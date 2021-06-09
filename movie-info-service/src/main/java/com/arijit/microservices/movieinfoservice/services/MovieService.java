package com.arijit.microservices.movieinfoservice.services;

import com.arijit.microservices.movieinfoservice.models.MoviePayload;

public interface MovieService {
	MoviePayload getMovieByName(String movieName);
}
