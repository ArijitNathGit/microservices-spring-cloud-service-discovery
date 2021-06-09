package com.arijit.microservices.ratingdataservice.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arijit.microservices.ratingdataservice.models.Rating;
import com.arijit.microservices.ratingdataservice.models.UserRating;

@RestController
@RequestMapping("/ratings")
public class RatingsController {

	@GetMapping(value = "/{movieId}")
	public Rating getMovieInfo(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4.8);
	}
	
	@GetMapping(value = "/users/{userId}")
	public UserRating getRatingInfo(@PathVariable("userId") String webClientBuilder) {
		List<Rating> ratings = Arrays.asList(
				new Rating("1234", 4),
				new Rating("5678", 5)
			);
		
		UserRating userRatings = new UserRating();
		userRatings.setUserRatings(ratings);
		
		return userRatings;
	}
}