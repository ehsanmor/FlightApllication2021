package com.example.flightapp.controller;


import com.example.flightapp.model.Airport;
import com.example.flightapp.model.Airport;
import com.example.flightapp.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/airport")

public class AirportController {
    @Autowired
    private AirportService airportService;

    @GetMapping("/getAllAirport")
    public List<Airport> getAllAirport() {
        return airportService.getAllAirport();
    }
    @PostMapping("/save")
    public Airport saveAirport(@RequestBody Airport airport) {
        return airportService.saveAirport(airport);
    }

    @PostMapping("/saveList")
    public List<Airport> saveListAirports(@RequestBody List<Airport> airports) {
        return airportService.saveListAirports(airports);
    }


    @PutMapping("/update")
    public Airport updateAirport(@RequestBody Airport airport){
        return airportService.updateAirport(airport);
    }

    @PutMapping("/updateById/{id}")
    public Airport updateAirportById(@PathVariable Integer id,@RequestBody Airport airport){
        return airportService.updateAirportById(id,airport);
    }

    @DeleteMapping("/delete")
    public String deleteAirport(@RequestBody Airport airport){
        try {
            return airportService.deleteAirport(airport);
        } catch (Exception e) {
            return  e.getMessage() ;
        }

    }
}





