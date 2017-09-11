package com.kodilla.good.patterns.challenges.Flights;

import java.util.ArrayList;
import java.util.List;

public class FlightList {
    private List<Flight> flights;

    public FlightList() {
        this.flights = new ArrayList<>();
        flights.add(new Flight("Warsaw","Krakow"));
        flights.add(new Flight("Warsaw","Gdansk"));
        flights.add(new Flight("Warsaw",  "Wroclaw"));
        flights.add(new Flight("Krakow", "Warsaw"));
        flights.add(new Flight("Krakow",  "Gdansk"));
        flights.add(new Flight("Krakow",  "Wroclaw"));
        flights.add(new Flight("Gdansk",  "Warsaw"));
        flights.add(new Flight("Gdansk",  "Wroclaw"));
        flights.add(new Flight("Wroclaw", "Warsaw"));
    }

    public List<Flight> getFlights() {return flights;}

}
