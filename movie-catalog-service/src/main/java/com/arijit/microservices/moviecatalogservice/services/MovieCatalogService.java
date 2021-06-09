package com.arijit.microservices.moviecatalogservice.services;

import com.arijit.microservices.moviecatalogservice.models.UserRating;

public interface MovieCatalogService {
	UserRating getRatings(String movieName);
}
