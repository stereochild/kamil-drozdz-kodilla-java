package com.kodilla.exception.LastChallenge;

import java.util.HashMap;
import java.util.Map;

public class FlightsList{

    public boolean findFlight(Flight flight) throws RouteNotFoundException  {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("Radom", true);
        flights.put("Modlin", true);
        flights.put("Katowice", true);
        flights.put("Krakow", false);
        flights.put("Gdansk", true);
        flights.put("Wroclaw", true);
        flights.put("Ciechocinek", false);

        if(!flights.containsKey(flight.getDepartureAirport()) || !flights.containsKey(flight.getArrivalAirport())){
        throw new RouteNotFoundException("Flight not found.");
        }
        return flights.get(flight.getDepartureAirport()) & flights.get(flight.getArrivalAirport());
    }
}
