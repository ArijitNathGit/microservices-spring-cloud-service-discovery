package com.arijit.microservices.movieinfoservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arijit.microservices.movieinfoservice.models.MoviePayload;
import com.arijit.microservices.movieinfoservice.services.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController implements MovieService {
	
	@Autowired
	private MovieService movieService;

	@Override
	@GetMapping(value = "/{movieName}")
	public MoviePayload getMovieByName(@PathVariable("movieName") String movieName) {
		return movieService.getMovieByName(movieName);
	}
}
