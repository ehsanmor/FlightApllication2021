package com.example.flightapp.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No record with that id was found")
public class NotFoundExeption extends RuntimeException{
}

