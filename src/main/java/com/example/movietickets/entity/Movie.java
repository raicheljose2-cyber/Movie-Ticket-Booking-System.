package com.example.movietickets.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId; // Matches "Movie ID" in requirements
    
    private String title;    // Matches "Title" in requirements
    private String genre;    // Matches "Genre" in requirements
    private Integer duration; // Matches "Duration" in requirements

    // 1. Mandatory No-Args Constructor
    public Movie() {
    }

    // 2. All-Args Constructor (Optional but helpful)
    public Movie(String title, String genre, Integer duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    // 3. Getters and Setters (Required for JSON to work)
    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
