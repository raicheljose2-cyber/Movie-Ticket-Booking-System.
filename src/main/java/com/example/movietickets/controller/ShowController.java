package com.example.movietickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.movietickets.entity.Show;
import com.example.movietickets.service.ShowService;
import java.util.List;

@RestController
@RequestMapping("/api/shows")
public class ShowController {

    @Autowired
    private ShowService showService;

    // API 3: Schedule a show
    @PostMapping("/add")
    public Show addShow(@RequestBody Show show) {
        return showService.addShow(show);
    }

    // API 4: View all shows
    @GetMapping("/all")
    public List<Show> getAllShows() {
        return showService.getAllShows();
    }

    // API 5: View shows for a specific movie
    @GetMapping("/movie/{movieId}")
    public List<Show> getShowsByMovie(@PathVariable Integer movieId) {
        return showService.getShowsByMovie(movieId);
    }
}
