package com.example.flightbooking.service;

import com.example.flightbooking.entity.Booking;
import com.example.flightbooking.repository.BookingRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private final BookingRepository repo;

    public BookingService(BookingRepository repo) {
        this.repo = repo;
    }

    public Booking book(Booking b) {
        b.setStatus("BOOKED");
        return repo.save(b);
    }

    public Booking get(Long id) {
        return repo.findById(id).orElse(null);
    }
}
