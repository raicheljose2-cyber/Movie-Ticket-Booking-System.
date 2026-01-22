package com.example.movietickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.movietickets.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
}