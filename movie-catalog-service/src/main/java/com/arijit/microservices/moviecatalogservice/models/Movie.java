package com.arijit.microservices.moviecatalogservice.models;

public class Movie {
	private Integer movieId;
	private String movieName;
	private String movieDescription;
	private int movieYearRelease;
	
	public Movie() {}

	public Movie(Integer movieId, String movieName, String movieDescription, int movieYearRelease) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieDescription = movieDescription;
		this.movieYearRelease = movieYearRelease;
	}

	public String getMovieDescription() { return movieDescription; }

	public void setMovieDescription(String movieDescription) { this.movieDescription = movieDescription; }

	public int getMovieYearRelease() { return movieYearRelease; }

	public void setMovieYearRelease(int movieYearRelease) { this.movieYearRelease = movieYearRelease; }

	public Integer getMovieId() { return movieId; }

	public void setMovieId(Integer movieId) { this.movieId = movieId; }

	public String getMovieName() { return movieName; }

	public void setMovieName(String movieName) { this.movieName = movieName; }

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieDescription=" + movieDescription
				+ ", movieYearRelease=" + movieYearRelease + "]";
	}	
}
