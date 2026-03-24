package com.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bus.model.Bus;
import com.bus.service.BusService;

import java.util.List;

@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusService service;

    @PostMapping("/add")
    public Bus addBus(@RequestBody Bus bus) {
        return service.addBus(bus);
    }

    @GetMapping("/all")
    public List<Bus> getAll() {
        return service.getAllBuses();
    }

    @PutMapping("/update/{id}")
    public Bus update(@PathVariable Long id, @RequestBody Bus bus) {
        return service.updateBus(id, bus);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteBus(id);
        return "Bus Deleted Successfully";
    }
}
