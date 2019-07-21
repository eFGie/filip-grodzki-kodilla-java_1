package com.kodilla.good.patterns.challenges.loty;

import java.util.Objects;

public class FlightWithOneStop {
    final int flightID;
    final String departureAirport;
    final String intermediateAirport;
    final String arrivalAirport;

    public FlightWithOneStop(final int flightID, final String departureAirport, final String intermediateAirport,
                             final String arrivalAirport) {
        this.flightID = flightID;
        this.departureAirport = departureAirport;
        this.intermediateAirport = intermediateAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public int getFlightID() {
        return flightID;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getIntermediateAirport() {
        return intermediateAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightWithOneStop that = (FlightWithOneStop) o;
        return flightID == that.flightID &&
                departureAirport.equals(that.departureAirport) &&
                intermediateAirport.equals(that.intermediateAirport) &&
                arrivalAirport.equals(that.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightID, departureAirport, intermediateAirport, arrivalAirport);
    }

    @Override
    public String toString() {
        return "FlightWithOneStop{" +
                "flightID=" + flightID +
                ", departureAirport='" + departureAirport + '\'' +
                ", intermediateAirport='" + intermediateAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                '}' + "\n";
    }
}
