package com.kodilla.good.patterns.flights;

import java.util.Map;

public class Application {
    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();
        Map<Flight, Integer> dataBase = flightDatabase.createFlightDatabase();

        FlightSearcher flightSearcher = new FlightSearcher();

        flightSearcher.searchFlightsFromCity(dataBase, "Gdansk");
        flightSearcher.searchFlightsToCity(dataBase, "Rzeszow");
        flightSearcher.searchFlightsThroughCity(dataBase, "Gdansk", "Poznan", "Rzeszow");
    }
}
