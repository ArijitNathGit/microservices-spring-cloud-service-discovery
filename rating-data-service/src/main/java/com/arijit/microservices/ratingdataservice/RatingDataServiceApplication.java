package com.arijit.microservices.ratingdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.arijit.microservices.ratingdataservice.repository.RatingRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = RatingRepository.class)
public class RatingDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingDataServiceApplication.class, args);
	}

}
