package com.example.movietickets.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.movietickets.entity.Booking;
import com.example.movietickets.entity.Show;
import com.example.movietickets.repository.BookingRepository;
import com.example.movietickets.repository.ShowRepository;
import java.time.LocalDate;
import java.util.List;

@Service
public class BookingService {
    @Autowired private BookingRepository bookingRepo;
    @Autowired private ShowRepository showRepo;

    public Booking bookTicket(Booking booking) {
        Show show = showRepo.findById(booking.getShow().getShowId())
            .orElseThrow(() -> new RuntimeException("Show not found"));

        // Rule: Seats booked must not exceed available seats [cite: 1, 168]
        if (booking.getSeatsBooked() <= show.getAvailableSeats()) {
            // Rule: Booking date should be auto-generated [cite: 1, 171]
            booking.setBookingDate(LocalDate.now());

            // Rule: Available seats must reduce after booking [cite: 1, 169]
            show.setAvailableSeats(show.getAvailableSeats() - booking.getSeatsBooked());
            showRepo.save(show);

            return bookingRepo.save(booking);
        }
        throw new RuntimeException("Not enough seats available!");
    }

    public List<Booking> getAllBookings() {
        return bookingRepo.findAll();
    }
 // API 8 Logic: Cancel booking and restore seats
    public void cancelBooking(Integer bookingId) {
        Booking booking = bookingRepo.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found"));

        Show show = booking.getShow();

        // Rule: Restore seats back to the show
        show.setAvailableSeats(show.getAvailableSeats() + booking.getSeatsBooked());
        showRepo.save(show);

        // Delete the booking record
        bookingRepo.delete(booking);
    }
}


