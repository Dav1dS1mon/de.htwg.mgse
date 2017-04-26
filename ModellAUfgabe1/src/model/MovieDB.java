package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Movie.Member;

public class MovieDB {

	private List<JSONMOVie> movies = new ArrayList<>();
	
	public List<JSONMOVie> getMovies() {
		return movies;
	}


	public void setMovies(List<JSONMOVie> movies) {
		this.movies = movies;
	}
	
	public final MovieDB addMovie(JSONMOVie movie){
		movies.add(movie);
		return this;
	}
	
	public final MovieDB saveDB(String path) throws IOException{
		Gson gson = new GsonBuilder().create();
		Files.write(Paths.get(path), gson.toJson(this).getBytes());
		return this;
	}


	public static class JSONMOVie{
		
		private String title;
		
		private String originalTitle;
		
		private boolean international;
		
		private int castmember = 0;
		
		private int actor = 0;
		
		private int leadActor = 0;
		
		private List<String> leadActors = new ArrayList<>();
		
		private String release;
		
		private String duration;
		
		public void copyMovie(Movie movie){
			this.title = movie.getTitle();
			this.release = movie.getRelease();
			if(movie.getOriginaltitle() != null){
				if(!movie.getOriginaltitle().equals(this.title)){
					this.originalTitle = movie.getOriginaltitle();
					international = true;
				}else{
					international = false;
				}
			}else{
				international = true;
			}
			
			List<Member> cast = movie.getCast();
			this.castmember = cast.size();
			for (Member member : cast) {
				if(member.getRole().equals("leadactor")){
					this.leadActor++;
						this.leadActors.add(member.getName());
				}
				if(member.getRole().equals("actor")){
					this.actor++;
				}
			}
			String movieMin = movie.getDuration().split("m")[0].trim();
			double min = Double.parseDouble(movieMin);
			this.duration = String.valueOf(min/60);
			
		}

		public String getTitle() {
			return title;
		}
		

		public void setTitle(String title) {
			this.title = title;
		}

		public String getOriginalTitle() {
			return originalTitle;
		}

		public void setOriginalTItle(String originalTItle) {
			this.originalTitle = originalTItle;
		}

		public boolean isInternational() {
			return international;
		}

		public void setInternational(boolean international) {
			this.international = international;
		}

		public int getCastmember() {
			return castmember;
		}

		public void setCastmember(int castmember) {
			this.castmember = castmember;
		}

		public int getActor() {
			return actor;
		}

		public void setActor(int actor) {
			this.actor = actor;
		}

		public int getLeadActor() {
			return leadActor;
		}

		public void setLeadActor(int leadActor) {
			this.leadActor = leadActor;
		}

		public List<String> getLeadActors() {
			return leadActors;
		}

		public void setLeadActors(List<String> leadActors) {
			this.leadActors = leadActors;
		}

		public String getRelease() {
			return release;
		}

		public void setRelease(String release) {
			this.release = release;
		}

		public String getDuration() {
			return duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}
		
		public String toString(){
			return this.getTitle();
		}
	}
}
