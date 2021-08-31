package com.example.flightapp.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    private String type;
    private  String CurrentAirfield;
    private long Fuel;

    public Airplane() {
    }

    public Airplane(int id, String type, String currentAirfield, long fuel) {
        this.id = id;
        this.type = type;
        CurrentAirfield = currentAirfield;
        Fuel = fuel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrentAirfield() {
        return CurrentAirfield;
    }

    public void setCurrentAirfield(String currentAirfield) {
        CurrentAirfield = currentAirfield;
    }

    public long getFuel() {
        return Fuel;
    }

    public void setFuel(long fuel) {
        Fuel = fuel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", CurrentAirfield='" + CurrentAirfield + '\'' +
                ", Fuel=" + Fuel +
                '}';
    }
}

