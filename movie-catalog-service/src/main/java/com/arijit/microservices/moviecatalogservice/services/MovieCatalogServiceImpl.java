package com.arijit.microservices.moviecatalogservice.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.arijit.microservices.moviecatalogservice.models.MoviePayload;
import com.arijit.microservices.moviecatalogservice.models.Rating;
import com.arijit.microservices.moviecatalogservice.models.UserRating;

@Service
public class MovieCatalogServiceImpl implements MovieCatalogService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	public UserRating getRatings(String movieName) {
		MoviePayload movie = this.getMovieDetails(movieName);
		
		List<Rating> userRatings = movie.getAllMovies().stream()
			.map(indivMovie -> {
				Rating rating = restTemplate.getForObject("http://rating-data-service/ratings/" + indivMovie.getMovieId(), Rating.class);
				rating.setMovieName(indivMovie.getMovieName());
				rating.setAvgRating(Math.round(rating.getRating().stream().mapToDouble(val -> val).average().orElse(0.0) * 100.0) / 100.0);
				
				return rating;
			})
			.collect(Collectors.toList());
		
		UserRating allRatings = new UserRating();
		allRatings.setUserRatings(userRatings);
		
		return allRatings;
	}
	
	private MoviePayload getMovieDetails(String movieName) {
		return webClientBuilder.build()
				.get()
				.uri("http://movie-info-service/movies/" + movieName)
				.retrieve()
				.bodyToMono(MoviePayload.class)
				.block();
	}
}
