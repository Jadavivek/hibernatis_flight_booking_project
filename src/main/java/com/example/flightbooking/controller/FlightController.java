package com.example.flightbooking.controller;

import com.example.flightbooking.entity.Flight;
import com.example.flightbooking.service.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    private final FlightService service;

    public FlightController(FlightService service) {
        this.service = service;
    }

    @PostMapping
    public Flight add(@RequestBody Flight f) {
        return service.addFlight(f);
    }

    @GetMapping
    public List<Flight> getAll() {
        return service.getAll();
    }
}
