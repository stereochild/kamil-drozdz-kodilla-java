package com.kodilla.good.patterns.challenges.Flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchEngine {
    private FlightList flightList = new FlightList();

    public List<Flight> searchDepartures(String departureAirport) {
        System.out.println("Searching for flights from: " + departureAirport);
        List<Flight> departures = flightList.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
        return departures;
    }

    public List<Flight> searchDestination(String destinationlAirport) {
        System.out.println("Searching for flights to: " + destinationlAirport);
        List<Flight> destinations = flightList.getFlights().stream()
                .filter(flight -> flight.getDestinationAirport().equals(destinationlAirport))
                .collect(Collectors.toList());
        return destinations;
    }

    public List<Flight> searchTransit(String departureAirport, String transitAirport, String destinationAirport) {
        System.out.println("Searching for flight from " + departureAirport + " to " + departureAirport + "with stopover.");
        List<Flight> transitStep1 = flightList.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .filter(flight -> flight.getDestinationAirport().equals(transitAirport))
                .collect(Collectors.toList());
        List<Flight> transitStep2 = flightList.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(transitAirport))
                .filter(flight -> flight.getDestinationAirport().equals(destinationAirport))
                .collect(Collectors.toList());

        List<Flight> transits = new ArrayList<>(transitStep1);
        transits.addAll(transitStep2);

        return transits;
    }
}
