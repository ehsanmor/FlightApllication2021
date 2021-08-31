package com.example.flightapp.service;

import com.example.flightapp.model.Airport;
import com.example.flightapp.model.Airport;
import com.example.flightapp.reposirory.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AirportService {
    @Autowired
    private AirportRepository airportRepository;
    public List<Airport> saveListAirports(List<Airport> airports) {
        return airportRepository.saveAll(airports);
    }


    public  List<Airport> getAllAirport() {
        return airportRepository.findAll();
    }

    public Airport saveAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    public Airport updateAirport(Airport airport) {
        return  airportRepository.save(airport);
    }

    public String deleteAirport(Airport airport) throws Exception {
        //chck employee id first
        if(airport.getId()==0){
            throw  new Exception("Id must be exist");
        }
        airportRepository.delete(airport);
        Optional<Airport> e = airportRepository.findById(airport.getId());
        if (e.isPresent()){
            return "Employee with id --->" +airport.getId()+ "has  not been deleted";
        }
        return "Employee with id --->" +airport.getId()+ "has been deleted";
    }

    public Airport updateAirportById(Integer id, Airport airport) {
        Airport r = airportRepository.findById(id).get();

        if (Objects.nonNull(airport.getName())){
            r.setName(airport.getName());
        }
        if ((Objects.nonNull(airport.getPlace()))){
            r.setPlace(airport.getPlace());
        }


        return  airportRepository.save(r);

    }
}
