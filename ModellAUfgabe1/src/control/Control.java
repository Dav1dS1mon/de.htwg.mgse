package control;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import org.apache.velocity.io.VelocityWriter;

import model.Movie;
import model.MovieDB;
import model.MovieDB.JSONMOVie;
import velocity.DBWriter;

public class Control {

	public static void main(String[] args) throws FileNotFoundException, IOException, URISyntaxException {
		
			Path path = Paths.get(args[0]);
		    MovieDB db = new MovieDB();

			Files.walk(path).forEach(filePath ->{
				String pathString = filePath.toString();
				String ext = pathString.substring(pathString.length()-6);
				if(ext.equals(".movie")){
					try {
						addMovie(db, filePath);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			String filePath = path.toAbsolutePath().toString()+"/db.html";
			DBWriter.writte(db, filePath);
			openBrowser(filePath);
			System.out.println("Done");
	}

	private static void openBrowser(String filePath) throws IOException, URISyntaxException {
		String fileToOpen = String.format("file:///%s", filePath);
		Desktop.getDesktop().browse(new URI(fileToOpen.replaceAll(Pattern.quote("\\"), "/")));
	}
	
	private static void addMovie(MovieDB db, Path path) throws IOException, FileNotFoundException {
		File file = path.toFile();
	    Movie movie = Movie.load(new FileInputStream(file));
	    JSONMOVie json = new JSONMOVie();
	    json.copyMovie(movie);
	    db.addMovie(json);
	}

}
