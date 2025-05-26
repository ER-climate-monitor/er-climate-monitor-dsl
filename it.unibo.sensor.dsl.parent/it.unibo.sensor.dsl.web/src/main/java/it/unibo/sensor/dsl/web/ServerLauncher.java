package it.unibo.sensor.dsl.web;

import java.io.File;
import java.net.InetSocketAddress;
import java.net.URL;

import org.eclipse.jetty.annotations.AnnotationConfiguration;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.Configuration;
import org.eclipse.jetty.webapp.MetaInfConfiguration;
import org.eclipse.jetty.webapp.WebAppConfiguration;
import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.webapp.WebInfConfiguration;
import org.eclipse.jetty.webapp.WebXmlConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This program starts an HTTP server for testing the web integration of your DSL.
 * Just execute it and point a web browser to http://localhost:8080/
 */
public class ServerLauncher {
	
	private static final Logger LOG = LoggerFactory.getLogger(ServerLauncher.class);
	
	public static void main(String[] args) {
		Server server = new Server(new InetSocketAddress("localhost", 8080));
		WebAppContext ctx = new WebAppContext();
		
		try {
			// Set up resource base
			Resource webAppResource = getWebAppResource();
			ctx.setBaseResource(webAppResource);
			
			ctx.setWelcomeFiles(new String[] {"index.html"});
			ctx.setContextPath("/");
			ctx.setConfigurations(new Configuration[] {
				new AnnotationConfiguration(),
				new WebXmlConfiguration(),
				new WebInfConfiguration(),
				new MetaInfConfiguration(),
				new WebAppConfiguration()
			});
			ctx.setAttribute(MetaInfConfiguration.CONTAINER_JAR_PATTERN,
				".*/it\\.unibo\\.sensor\\.dsl\\.web/.*,.*\\.jar");
			ctx.setInitParameter("org.eclipse.jetty.servlet.Default.useFileMappedBuffer", "false");
			
			// Additional settings for JAR-based execution
			ctx.setThrowUnavailableOnStartupException(true);
			ctx.setExtractWAR(false);
			
		} catch (Exception e) {
			LOG.error("Failed to configure web application context", e);
			System.exit(1);
		}
		
		server.setHandler(ctx);
		
		try {
			server.start();
			LOG.info("Server started " + server.getURI() + "...");
			LOG.info("Base resource: " + ctx.getBaseResource());
			
			new Thread(() -> {
				try {
					LOG.info("Press enter to stop the server...");
					int key = System.in.read();
					if (key != -1) {
						server.stop();
					} else {
						LOG.warn(
								"Console input is not available. In order to stop the server, you need to cancel process manually.");
					}
				} catch (Exception e) {
					LOG.warn(e.getMessage());
				}
			}).start();
			
			server.join();
		} catch (Exception exception) {
			LOG.error("Server failed to start", exception);
			System.exit(1);
		}
	}
	
	private static Resource getWebAppResource() throws Exception {
		// First, try development environment
		File webappDir = new File("src/main/webapp");
		if (webappDir.exists()) {
			LOG.info("Using development webapp directory: " + webappDir.getAbsolutePath());
			return Resource.newResource(webappDir.toURI());
		}
		
		// Try to find webapp resources in JAR
		URL webappUrl = null;
		
		// Try common locations where webapp resources might be stored in JAR
		String[] possiblePaths = {
			"/webapp/",
			"/META-INF/resources/",
			"/static/",
			"/public/"
		};
		
		for (String path : possiblePaths) {
			webappUrl = ServerLauncher.class.getResource(path);
			if (webappUrl != null) {
				LOG.info("Found webapp resources at: " + path);
				break;
			}
		}
		
		if (webappUrl != null) {
			return Resource.newResource(webappUrl);
		}
		
		// Last resort: try to use the JAR root and hope webapp files are there
		URL jarRootUrl = ServerLauncher.class.getResource("/");
		if (jarRootUrl != null) {
			LOG.info("Using JAR root as webapp resource base");
			return Resource.newResource(jarRootUrl);
		}
		
		// Ultimate fallback - create empty resource
		LOG.warn("Could not find webapp resources, creating empty resource base");
		return Resource.newResource(".");
	}
}
