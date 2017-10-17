package com.kodilla.good.patterns.flights;

import java.util.Map;

public class FlightSearcher {
    public void searchFlightsFromCity(Map<Flight, Integer> flightDatabase, String departureCity) {
        System.out.println("\nFlights from chosen city:\n");
        flightDatabase.entrySet().stream()
                .filter(e -> e.getKey().getDepartureCity() == departureCity)
                .forEach(System.out::println);
    }

    public void searchFlightsToCity(Map<Flight, Integer> flightDatabase, String arrivalCity) {
        System.out.println("\nFlights to chosen city:\n");
        flightDatabase.entrySet().stream()
                .filter(e -> e.getKey().getArrivalCity() == arrivalCity)
                .forEach(System.out::println);
    }

    public void searchFlightsThroughCity(Map<Flight, Integer> flightDatabase, String departureCity, String throughCity, String arrivalCity) {
        System.out.println("\nFlights from chosen city to chosen city through chosen city:\n");
        flightDatabase.entrySet().stream()
                .filter(e -> e.getKey().getDepartureCity() == departureCity && e.getKey().getArrivalCity() == throughCity ||
                        (e.getKey().getDepartureCity() == throughCity && e.getKey().getArrivalCity() == arrivalCity))
                .forEach(System.out::println);
    }
}
