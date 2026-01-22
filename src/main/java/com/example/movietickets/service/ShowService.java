package com.example.movietickets.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.movietickets.entity.Show;
import com.example.movietickets.repository.ShowRepository;
import java.util.List;

@Service
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    // API 3: Logic to save a show
    public Show addShow(Show show) {
        return showRepository.save(show);
    }

    // API 4: Logic to get all shows
    public List<Show> getAllShows() {
        return showRepository.findAll();
    }

    // API 5: Logic to get shows for a specific movie
    public List<Show> getShowsByMovie(Integer movieId) {
        return showRepository.findByMovieMovieId(movieId);
    }
}