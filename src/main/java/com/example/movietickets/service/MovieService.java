package com.example.movietickets.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.movietickets.entity.Movie;
import com.example.movietickets.repository.MovieRepository;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    // Logic to save a movie to the database
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    // Logic to retrieve all movies
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
