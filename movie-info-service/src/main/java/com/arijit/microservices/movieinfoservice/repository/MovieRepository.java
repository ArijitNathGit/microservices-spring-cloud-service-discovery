package com.arijit.microservices.movieinfoservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arijit.microservices.movieinfoservice.models.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	@Query(value = "SELECT * FROM movie_info m WHERE m.movie_name LIKE %?1%", nativeQuery = true)	
	List<Movie> findByMovieName(String movieName);
}
