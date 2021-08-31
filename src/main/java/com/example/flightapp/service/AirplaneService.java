package com.example.flightapp.service;


import com.example.flightapp.model.Airplane;
import com.example.flightapp.reposirory.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AirplaneService {
    @Autowired
    AirplaneRepository airplaneRepository;

    public List<Airplane> saveListAirplanes(List<Airplane> airplanes) {
        return airplaneRepository.saveAll(airplanes);
    }


    public  List<Airplane> getAllAirplane() {
        return airplaneRepository.findAll();
    }

    public Airplane saveAirplane(Airplane airplane) {
        return airplaneRepository.save(airplane);
    }

    public Airplane updateAirplane(Airplane airplane) {
        return  airplaneRepository.save(airplane);
    }

    public String deleteAirplane(Airplane airplane) throws Exception {
        //chck employee id first
        if(airplane.getId()==0){
            throw  new Exception("Id must be exist");
        }
        airplaneRepository.delete(airplane);
        Optional<Airplane> e = airplaneRepository.findById(airplane.getId());
        if (e.isPresent()){
            return "Employee with id --->" +airplane.getId()+ "has  not been deleted";
        }
        return "Employee with id --->" +airplane.getId()+ "has been deleted";
    }

    public Airplane updateAirplaneById(Integer id, Airplane airplane) {
        Airplane r = airplaneRepository.findById(id).get();
        if (Objects.nonNull(airplane.getType())){
            r.setType(airplane.getType());
        }
        if ((Objects.nonNull(airplane.getCurrentAirfield()))){
            r.setCurrentAirfield(airplane.getCurrentAirfield());
        }
        if ((Objects.nonNull(airplane.getFuel()))){
            r.setFuel(airplane.getFuel());
        }

        return  airplaneRepository.save(r);

    }
}
