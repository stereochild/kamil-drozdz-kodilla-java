package com.kodilla.good.patterns.challenges.Flights;

public class Application {
    public static void main(String[] args) {

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();

        System.out.println(flightSearchEngine.searchDepartures("Warsaw"));
        System.out.println(flightSearchEngine.searchDestination("Krakow"));
        System.out.println(flightSearchEngine.searchTransit("Warsaw", "Gdansk", "Wroclaw"));
    }
}
