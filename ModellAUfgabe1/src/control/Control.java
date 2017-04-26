package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import model.Movie;
import model.MovieDB;
import model.MovieDB.JSONMOVie;

public class Control {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		if(args.length>0){
			Path path = Paths.get(args[0]);
		    MovieDB db  = new MovieDB();
			Files.walk(path).forEach(filePath ->{
				if(filePath.endsWith(".movie")){
					try {
						addMovie(db, filePath);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			//not needed anymore
		    db.saveDB(path.toAbsolutePath().toString()+"/movieDB.json");
		    
		}else{
			System.err.println("no path");
		}
	}
	
	private static void addMovie(MovieDB db, Path path) throws IOException, FileNotFoundException {
		File file = path.toFile();
	    Movie movie = Movie.load(new FileInputStream(file));
	    JSONMOVie json = new JSONMOVie();
	    json.copyMovie(movie);
	    db.addMovie(json);
	}

}
