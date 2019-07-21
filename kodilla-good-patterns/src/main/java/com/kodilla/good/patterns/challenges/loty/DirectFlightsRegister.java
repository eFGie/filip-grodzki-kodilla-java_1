package com.kodilla.good.patterns.challenges.loty;


import java.util.ArrayList;
import java.util.List;

public final class DirectFlightsRegister {
    public static List<DirectFlight> geList() {
        final List<DirectFlight> theList = new ArrayList<>();

        theList.add(new DirectFlight(1,"GDAŃSK","WROCŁAW"));
        theList.add(new DirectFlight(2,"WROCŁAW","GDAŃSK"));
        theList.add(new DirectFlight(3,"WROCŁAW","LONDYN"));
        theList.add(new DirectFlight(4,"WARSZAWA","WROCŁAW"));
        theList.add(new DirectFlight(5,"WROCŁAW","BARCELONA"));
        theList.add(new DirectFlight(6,"MADRYT","WROCŁAW"));
        theList.add(new DirectFlight(7,"WARSZAWA","BARCELONA"));
        theList.add(new DirectFlight(8,"BARCELONA","GDAŃSK"));
        return new ArrayList<DirectFlight>(theList);
    }
}
