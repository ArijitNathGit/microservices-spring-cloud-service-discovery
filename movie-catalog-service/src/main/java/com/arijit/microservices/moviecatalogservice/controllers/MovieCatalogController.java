package com.arijit.microservices.moviecatalogservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arijit.microservices.moviecatalogservice.models.UserRating;
import com.arijit.microservices.moviecatalogservice.services.MovieCatalogService;


@RestController
@RequestMapping("/catalog")
public class MovieCatalogController implements MovieCatalogService {

	@Autowired
	private MovieCatalogService movieCatalogService;

	@GetMapping(value = "/{movieName}")
	public UserRating getRatings(@PathVariable("movieName") String movieName) {		
		return movieCatalogService.getRatings(movieName);
	}
}
