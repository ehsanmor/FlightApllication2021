package com.example.flightapp.reposirory;

import com.example.flightapp.model.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AirplaneRepository extends JpaRepository<Airplane, Integer> {
}
