package it.unibo.sensor.dsl.generator;

import com.google.inject.Injector;
import it.unibo.sensor.dsl.SensorDSLStandaloneSetup;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;

import java.io.File;

public class SensorDslGeneratorLauncher {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java SensorDslGeneratorLauncher <input.dsl> <output-dir>");
            System.exit(1);
        }

        final String dslFilePath = args[0];
        final String outputDir = args[1];

        final Injector injector = new SensorDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
        final XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        final File inputFile = new File(dslFilePath);
        final Resource resource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createFileURI(inputFile.getAbsolutePath()), true);
        final JavaIoFileSystemAccess fsa = injector.getInstance(JavaIoFileSystemAccess.class);
        final SensorGenerator generator = injector.getInstance(SensorGenerator.class);

        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sensor", new XMIResourceFactoryImpl());
        fsa.setOutputPath(JavaIoFileSystemAccess.DEFAULT_OUTPUT, outputDir);
        generator.doGenerate(resource, fsa, () -> CancelIndicator.NullImpl);

        System.out.println("Code generation completed!");
    }
}
