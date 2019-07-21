package com.kodilla.good.patterns.challenges.loty;

import java.util.Objects;

public final class DirectFlight {
    final int flightID;
    final String departureAirport;
    final String arrivalAirport;

    public DirectFlight(final int flightID, final String departureAirport, final String arrivalAirport) {
        this.flightID = flightID;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public int getDirectFlightID() {
        return flightID;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DirectFlight that = (DirectFlight) o;
        return flightID == that.flightID &&
                departureAirport.equals(that.departureAirport) &&
                arrivalAirport.equals(that.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightID, departureAirport, arrivalAirport);
    }

    @Override
    public String toString() {
        return "DirectFlight{" +
                "flightID=" + flightID +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                '}' + "\n" ;
    }
}
