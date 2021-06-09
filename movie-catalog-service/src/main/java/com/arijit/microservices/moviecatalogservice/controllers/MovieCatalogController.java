package com.arijit.microservices.moviecatalogservice.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.arijit.microservices.moviecatalogservice.models.CatalogItem;
import com.arijit.microservices.moviecatalogservice.models.Movie;
import com.arijit.microservices.moviecatalogservice.models.Rating;
import com.arijit.microservices.moviecatalogservice.models.UserRating;


@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webClientBuilder; 
	
	@GetMapping(value = "/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {		
		
		
		UserRating ratings = restTemplate.getForObject("http://rating-data-service/ratings/users/" + userId, UserRating.class);		
		
		
		WebClient.Builder build = WebClient.builder(); 
		
		return ratings.getUserRatings().stream()
			.map(rating -> {
				//Movie movie = restTemplate.getForObject("http://localhost:7001/movies/A", Movie.class);
				
				Movie movie = webClientBuilder.build()
					.get()
					.uri("http://movie-info-service/movies/A")
					.retrieve()
					.bodyToMono(Movie.class)
					.block();
				
				return new CatalogItem(movie.getMovieId(), movie.getMovieName(), rating.getRating());
			})
			.collect(Collectors.toList());
			
		
		
		/*
		 * return Collections.singletonList( new CatalogItem("Transformers",
		 * "Transformers Movie", Double.valueOf(4.5)) );
		 */
	}
}
