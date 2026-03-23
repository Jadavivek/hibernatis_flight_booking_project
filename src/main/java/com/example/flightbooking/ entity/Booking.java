package com.example.flightbooking.entity;

import jakarta.persistence.*;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Flight flight;

    @ManyToOne(cascade = CascadeType.ALL)
    private Passenger passenger;

    private String status;

    // getters setters
    public Long getId() { return id; }

    public Flight getFlight() { return flight; }
    public void setFlight(Flight flight) { this.flight = flight; }

    public Passenger getPassenger() { return passenger; }
    public void setPassenger(Passenger passenger) { this.passenger = passenger; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
