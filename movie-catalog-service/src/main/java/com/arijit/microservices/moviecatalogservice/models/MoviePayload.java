package com.arijit.microservices.moviecatalogservice.models;

import java.util.List;

public class MoviePayload {
	private List<Movie> allMovies;
	
	public MoviePayload() {}
	
	public MoviePayload(List<Movie> allMovies) {
		super();
		this.allMovies = allMovies;
	}
	
	public List<Movie> getAllMovies() {	return allMovies; }
	
	public void setAllMovies(List<Movie> allMovies) { this.allMovies = allMovies; }
}
