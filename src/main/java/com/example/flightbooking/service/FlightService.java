package com.example.flightbooking.service;

import com.example.flightbooking.entity.Flight;
import com.example.flightbooking.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    private final FlightRepository repo;

    public FlightService(FlightRepository repo) {
        this.repo = repo;
    }

    public Flight addFlight(Flight f) {
        return repo.save(f);
    }

    public List<Flight> getAll() {
        return repo.findAll();
    }

    public Flight getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
