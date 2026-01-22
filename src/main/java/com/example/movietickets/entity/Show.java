package com.example.movietickets.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "movie_shows") // We use 'movie_shows' because 'show' is a reserved keyword in MySQL
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer showId; // Unique ID for each show [cite: 47]

    private LocalDateTime showTime; // Date and time of the show [cite: 48]
    private Integer totalSeats; // Total capacity of the hall [cite: 49]
    private Integer availableSeats; // Seats left to be booked [cite: 50]

    // This connects the Show to a specific Movie 
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    // No-argument constructor (required by JPA)
    public Show() {}

    // Getters and Setters (How the program reads and writes these values)
    public Integer getShowId() { return showId; }
    public void setShowId(Integer showId) { this.showId = showId; }

    public LocalDateTime getShowTime() { return showTime; }
    public void setShowTime(LocalDateTime showTime) { this.showTime = showTime; }

    public Integer getTotalSeats() { return totalSeats; }
    public void setTotalSeats(Integer totalSeats) { this.totalSeats = totalSeats; }

    public Integer getAvailableSeats() { return availableSeats; }
    public void setAvailableSeats(Integer availableSeats) { this.availableSeats = availableSeats; }

    public Movie getMovie() { return movie; }
    public void setMovie(Movie movie) { this.movie = movie; }
}