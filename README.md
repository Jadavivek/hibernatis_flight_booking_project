package com.bus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.model.Bus;
import com.bus.repository.BusRepository;

import java.util.List;

@Service
public class BusService {

    @Autowired
    private BusRepository repo;

    public Bus addBus(Bus bus) {
        return repo.save(bus);
    }

    public List<Bus> getAllBuses() {
        return repo.findAll();
    }

    public Bus updateBus(Long id, Bus bus) {
        bus.setId(id);
        return repo.save(bus);
    }

    public void deleteBus(Long id) {
        repo.deleteById(id);
    }
}
