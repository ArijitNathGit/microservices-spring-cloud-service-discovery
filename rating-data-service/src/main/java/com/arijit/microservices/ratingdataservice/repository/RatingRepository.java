package com.arijit.microservices.ratingdataservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.arijit.microservices.ratingdataservice.models.Rating;

@Repository
public interface RatingRepository extends MongoRepository<Rating, Integer> {
	public Rating findByMovieId(Integer movieId);
}
