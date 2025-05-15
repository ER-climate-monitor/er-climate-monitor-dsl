package it.unibo.sensor.dsl.generator;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import it.unibo.sensor.dsl.SensorDSLStandaloneSetup;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(final String[] args) {
        if (args.length == 0) {
            System.err.println("Aborting: no path to EMF resource provided!");;
            return;
        }

        final Injector injector = new SensorDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
        final Main main = injector.getInstance(Main.class);
        main.runGenerator(args[0]);
    }

    @Inject
    private Provider<ResourceSet> resourceSetProvider;

    @Inject
    private IResourceValidator validator;

    @Inject
    private GeneratorDelegate generator;

    @Inject
    private JavaIoFileSystemAccess fileAccess;

    protected void runGenerator(final String path) {
        final ResourceSet set = resourceSetProvider.get();
        final Resource resource = set.getResource(URI.createFileURI(path), true);

        final List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
        if (!issues.isEmpty()) {
            issues.forEach(System.out::println);
            return;
        }

        fileAccess.setOutputPath(new File(path).getParent());
        final GeneratorContext context = new GeneratorContext();
        context.setCancelIndicator(CancelIndicator.NullImpl);
        generator.generate(resource, fileAccess, context);
        System.out.println("Code generation completed!");
    }
}
