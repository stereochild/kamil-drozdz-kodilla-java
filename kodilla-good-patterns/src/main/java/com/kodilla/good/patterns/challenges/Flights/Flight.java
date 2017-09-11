package com.kodilla.good.patterns.challenges.Flights;

public class Flight {
    private String departureAirport;
    private String destinationAirport;

    public Flight(String departureAirport, String destinationAirport) {
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureAirport() {return departureAirport;}
    public String getDestinationAirport() {return destinationAirport;}

    @Override
    public String toString() {
        return departureAirport + " to " + destinationAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!departureAirport.equals(flight.departureAirport)) return false;
        return destinationAirport.equals(flight.destinationAirport);
    }

    @Override
    public int hashCode() {
        int result = departureAirport.hashCode();
        result = 31 * result + destinationAirport.hashCode();
        return result;
    }
}
