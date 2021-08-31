package com.example.flightapp.controller;


import com.example.flightapp.model.Airplane;
import com.example.flightapp.service.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/airplane")

public class AirplaneController {

    @Autowired
    private AirplaneService airplaneService;

    @GetMapping("/getAllAirplane")
    public List<Airplane> getAllAirplane() {
        return airplaneService.getAllAirplane();
    }
    @PostMapping("/save")
    public Airplane saveAirplane(@RequestBody Airplane airplane) {
        return airplaneService.saveAirplane(airplane);
    }

    @PostMapping("/saveList")
    public List<Airplane> saveListAirplanes(@RequestBody List<Airplane> airplanes) {
        return airplaneService.saveListAirplanes(airplanes);
    }


    @PutMapping("/update")
    public Airplane updateAirplane(@RequestBody Airplane airplane){
        return airplaneService.updateAirplane(airplane);
    }

    @PutMapping("/updateById/{id}")
    public Airplane updateAirplaneById(@PathVariable Integer id,@RequestBody Airplane airplane){
        return airplaneService.updateAirplaneById(id,airplane);
    }

    @DeleteMapping("/delete")
    public String deleteAirplane(@RequestBody Airplane airplane){
        try {
            return airplaneService.deleteAirplane(airplane);
        } catch (Exception e) {
            return  e.getMessage() ;
        }

    }
}





