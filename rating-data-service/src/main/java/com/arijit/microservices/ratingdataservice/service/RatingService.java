package com.arijit.microservices.ratingdataservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arijit.microservices.ratingdataservice.models.Rating;
import com.arijit.microservices.ratingdataservice.repository.RatingRepository;

@Service
public class RatingService {
	@Autowired
	private RatingRepository ratingsRepository;
		
	public Rating getRatingForMovie(Integer movieId) {
		return ratingsRepository.findByMovieId(movieId);
	}
}
