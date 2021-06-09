package com.arijit.microservices.moviecatalogservice.models;

import java.util.List;

public class Rating {
	private String movieId;
	private String movieName;
	private List<Double> rating;
	private Double avgRating;
	
	public Rating() {}
	
	public Rating(String movieId, String movieName, List<Double> rating, Double avgRating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.rating = rating;
		this.avgRating = avgRating;
	}

	public String getMovieId() { return movieId; }

	public void setMovieId(String movieId) { this.movieId = movieId; }

	public List<Double> getRating() { return rating; }

	public void setRating(List<Double> rating) { this.rating = rating; }
	
	public String getMovieName() { return movieName; }
	
	public void setMovieName(String movieName) { this.movieName = movieName; }
	
	public Double getAvgRating() { return avgRating; }
	
	public void setAvgRating(Double avgRating) { this.avgRating = avgRating; }

	@Override
	public String toString() {
		return "Rating [movieId=" + movieId + ", movieName=" + movieName + ", rating=" + rating + "]";
	}
}
