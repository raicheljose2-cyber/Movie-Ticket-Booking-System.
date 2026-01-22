package com.example.movietickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.movietickets.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    // No code needed here! Spring Boot provides save(), findAll(), etc.
}
