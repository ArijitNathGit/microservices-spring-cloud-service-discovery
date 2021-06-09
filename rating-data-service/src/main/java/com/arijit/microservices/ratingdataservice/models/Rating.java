package com.arijit.microservices.ratingdataservice.models;

public class Rating {
	
	private String movieId;
	private double rating;
	
	public Rating() {}

	public Rating(String movieId, double rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}

	public String getMovieId() { return movieId; }

	public void setMovieId(String movieId) { this.movieId = movieId; }

	public double getRating() { return rating; }

	public void setRating(double rating) { this.rating = rating; }

	@Override
	public String toString() { return "Rating [movieId=" + movieId + ", rating=" + rating + "]"; }	
}