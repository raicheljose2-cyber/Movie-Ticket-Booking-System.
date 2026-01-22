package com.example.movietickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.movietickets.entity.Show;
import java.util.List;

public interface ShowRepository extends JpaRepository<Show, Integer> {
    
    // This special method will help us find all shows for one specific movie (API 5)
    List<Show> findByMovieMovieId(Integer movieId);
}