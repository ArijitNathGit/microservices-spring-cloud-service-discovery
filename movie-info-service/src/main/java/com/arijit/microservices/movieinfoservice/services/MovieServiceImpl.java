package com.arijit.microservices.movieinfoservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arijit.microservices.movieinfoservice.exceptions.MovieNotFoundException;
import com.arijit.microservices.movieinfoservice.models.Movie;
import com.arijit.microservices.movieinfoservice.models.MoviePayload;
import com.arijit.microservices.movieinfoservice.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	public MoviePayload getMovieByName(String movieName) {
		List<Movie> movieSearch = movieRepository.findByMovieName(movieName);
		
		if( movieSearch.isEmpty() )
			throw new MovieNotFoundException("Movie Not found!");
		
		MoviePayload payload = new MoviePayload(movieSearch);
		
		return payload;
	}
	
}
