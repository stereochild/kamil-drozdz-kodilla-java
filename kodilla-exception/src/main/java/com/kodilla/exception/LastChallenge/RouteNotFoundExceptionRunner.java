package com.kodilla.exception.LastChallenge;

public class RouteNotFoundExceptionRunner {

    public static void main(String[] args) {
        FlightsList flightsList = new FlightsList();
        Flight flight = new Flight("Warsaw", "Dublin");

        try {
            if(flightsList.findFlight(flight)){
                System.out.println("Flight is available");
            } else {
                System.out.println("Flight is not available");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}
