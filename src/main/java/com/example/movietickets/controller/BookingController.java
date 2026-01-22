package com.example.movietickets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movietickets.entity.Booking;
import com.example.movietickets.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired 
    private BookingService bookingService;

    // API 6: Book a ticket
    @PostMapping
    public Booking bookTicket(@RequestBody Booking booking) {
        return bookingService.bookTicket(booking);
    }

    // API 7: Get all bookings
    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    // API 8: Cancel Booking and restore seats
    @DeleteMapping("/{bookingId}")
    public String cancelBooking(@PathVariable("bookingId") Integer bookingId) {
        bookingService.cancelBooking(bookingId);
        return "Booking cancelled successfully and seats have been restored!";
    }
} // Make sure this last brace is present!