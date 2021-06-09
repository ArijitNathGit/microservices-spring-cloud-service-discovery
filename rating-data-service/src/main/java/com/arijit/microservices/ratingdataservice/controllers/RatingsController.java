package com.arijit.microservices.ratingdataservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arijit.microservices.ratingdataservice.models.Rating;
import com.arijit.microservices.ratingdataservice.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingsController {

	@Autowired
	private RatingService ratingService;

	@GetMapping(value = "/{movieId}")
	public Rating getMovieInfo(@PathVariable("movieId") Integer movieId) { 
		return ratingService.getRatingForMovie(movieId);
	}	 
}