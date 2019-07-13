package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearching {
    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("departureAirport_1", true);
        flights.put("departureAirport_2", true);
        flights.put("departureAirport_3", true);
        flights.put("departureAirport_4", true);
        flights.put("departureAirport_5", true);

        if (!flights.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        }
    }

    public static void main(String[] args) {
        FlightSearching flightSearching = new FlightSearching();

        Flight flight1 = new Flight("departureAirport_1", "arrivalAirport_1");
        Flight flight2 = new Flight("departureAirport_2", "arrivalAirport_2");

        Flight flight6 = new Flight("departureAirport_6", "arrivalAirport_6");

        try {
            flightSearching.findFilght(flight6);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight does not exist");
        }

        System.out.println("Program still running");
    }
}

