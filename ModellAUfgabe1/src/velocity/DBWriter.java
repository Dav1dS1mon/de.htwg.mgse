package velocity;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import model.MovieDB;

public class DBWriter {
	
	public static void writte(MovieDB db, String path){
		VelocityEngine engine = new VelocityEngine();
		engine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		engine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		engine.init();
		Template template = engine.getTemplate("velocity/Template.vm");
		VelocityContext context = new VelocityContext();
		context.put("movieDB", db);
		StringWriter writer = new StringWriter();
		template.merge(context, writer);
		try {
			Files.write(Paths.get(path), writer.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
