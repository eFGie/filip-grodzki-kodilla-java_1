package com.kodilla.good.patterns.challenges.loty;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightApplication {
    public static void main(String[] args) {

        //Znalezienie wszystkich lotów z podanego miasta
        String departureAirportToFind = "WROCŁAW";

        List<DirectFlight> directFlights = DirectFlightsRegister.geList();

        List<DirectFlight> departureAirportToFindInDirect = directFlights.stream()
                .filter(p -> p.getDepartureAirport().equals(departureAirportToFind))
                .collect(Collectors.toList());
        System.out.println(departureAirportToFindInDirect);

        //Znalezienie wszystkich lotów do danego miasta
        String arrivalAirportToFind = "GDAŃSK";

        List<DirectFlight> arrivalAirportToFindInDirect = directFlights.stream()
                .filter(p -> p.getArrivalAirport().equals(arrivalAirportToFind))
                .collect(Collectors.toList());
        System.out.println(arrivalAirportToFindInDirect);

        System.out.println();

        //Znalezienie lotów z Gdańska do Wrocławia poprzez inne miasto
        for(DirectFlight depFlight : departureAirportToFindInDirect) {
            for (DirectFlight arrFlight : arrivalAirportToFindInDirect) {
                if(depFlight.getArrivalAirport() == arrFlight.getDepartureAirport()) {
                    System.out.println(depFlight.getDepartureAirport() + " - " + depFlight.getArrivalAirport());
                    System.out.println(arrFlight.getDepartureAirport() + " - " + arrFlight.getArrivalAirport());
                }
            }
        }

    }
}