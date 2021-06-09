package com.arijit.microservices.movieinfoservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.arijit.microservices.movieinfoservice.validators.YearVaidator;

@Entity
@Table(name = "movie_info")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "movie_id")
	private Integer movieId;
	
	@NotNull
	@Min(value = 2)
	@Column(name = "movie_name")
	private String movieName;
	
	@Max(value = 500)
	@Column(name = "movie_desc")
	private String movieDescription;
	
	@Column(name = "movie_year_release")
	@YearVaidator
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
