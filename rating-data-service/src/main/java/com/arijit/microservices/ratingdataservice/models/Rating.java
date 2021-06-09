package com.arijit.microservices.ratingdataservice.models;

import java.util.List;

public class Rating {
	private String movieId;
	
	private List<Double> rating;
	
	public Rating() {}

	public Rating(String movieId, List<Double> rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}

	public String getMovieId() { return movieId; }

	public void setMovieId(String movieId) { this.movieId = movieId; }

	public List<Double> getRating() { return rating; }

	public void setRating(List<Double> rating) { this.rating = rating; }

	@Override
	public String toString() { return "Rating [movieId=" + movieId + ", rating=" + rating + "]"; }	
}
