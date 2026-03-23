package com.example.flightbooking.controller;

import com.example.flightbooking.entity.Booking;
import com.example.flightbooking.service.BookingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private final BookingService service;

    public BookingController(BookingService service) {
        this.service = service;
    }

    @PostMapping
    public Booking book(@RequestBody Booking b) {
        return service.book(b);
    }

    @GetMapping("/{id}")
    public Booking get(@PathVariable Long id) {
        return service.get(id);
    }
}
