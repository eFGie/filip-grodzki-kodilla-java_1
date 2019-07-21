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


        List<FlightWithOneStop> flightsWihOneStop = FlightsWihOneStopRegister.geList();

        List<FlightWithOneStop> departureAirportToFindInOneStopFlights = flightsWihOneStop.stream()
                .filter(p -> p.getDepartureAirport().equals(departureAirportToFind))
                .collect(Collectors.toList());
        System.out.println(departureAirportToFindInOneStopFlights);

        System.out.println();

        //Znalezienie wszystkich lotów do danego miasta
        String arrivalAirportToFind = "GDAŃSK";

        List<DirectFlight> arrivalAirportToFindInDirect = directFlights.stream()
                .filter(p -> p.getArrivalAirport().equals(arrivalAirportToFind))
                .collect(Collectors.toList());
        System.out.println(arrivalAirportToFindInDirect);

        List<FlightWithOneStop> arrivalAirportToFindInOneStopFlights = flightsWihOneStop.stream()
                .filter(p -> p.getArrivalAirport().equals(arrivalAirportToFind))
                .collect(Collectors.toList());
        System.out.println(arrivalAirportToFindInOneStopFlights);

        System.out.println();

        //Znalezienie lotów poprzez inne miasto np. lot z Gdańska przez Kraków do Wrocławia
        List<FlightWithOneStop> IntermediateFlightsoFindInOneStopFlights = flightsWihOneStop.stream()
                .filter(p -> p.getDepartureAirport().equals(departureAirportToFind)
                        && p.getArrivalAirport().equals(arrivalAirportToFind))
                .collect(Collectors.toList());
        System.out.println(IntermediateFlightsoFindInOneStopFlights);
    }
}