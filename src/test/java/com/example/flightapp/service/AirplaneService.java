package com.example.flightapp.service;

import com.example.flightapp.reposirory.AirplaneRepository;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AirplaneService {
    @InjectMocks
    private AirplaneService airplaneService;
    @Mock
    private AirplaneRepository airplaneRepository;


}
