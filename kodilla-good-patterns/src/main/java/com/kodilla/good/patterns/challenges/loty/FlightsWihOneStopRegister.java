package com.kodilla.good.patterns.challenges.loty;

import java.util.ArrayList;
import java.util.List;

public final class FlightsWihOneStopRegister {
    public static List<FlightWithOneStop> geList() {
        final List<FlightWithOneStop> theList = new ArrayList<>();

        theList.add(new FlightWithOneStop(1,"GDAŃSK","BERLIN","WROCŁAW"));
        theList.add(new FlightWithOneStop(2,"WROCŁAW","KRAKÓW","GDAŃSK"));
        theList.add(new FlightWithOneStop(3,"KRAKÓW","WARSZAWA","GDAŃSK"));
        theList.add(new FlightWithOneStop(4,"BERLIN","WARSZAWA","WROCŁAW"));
        theList.add(new FlightWithOneStop(5,"WROCŁAW","KRAKÓW","PRAGA"));
        return new ArrayList<FlightWithOneStop>(theList);
    }
}
