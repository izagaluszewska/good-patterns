package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class FlightDatabase {
    public Map<Flight, Integer> createFlightDatabase() {
        Flight flightGdnWro = new Flight("Gdansk","Wroclaw", LocalDateTime.of(2018, Month.OCTOBER, 2, 20, 0,0), LocalDateTime.of(2018, Month.OCTOBER, 2, 21, 0, 0));
        Flight flightGdnRze = new Flight("Gdansk","Rzeszow", LocalDateTime.of(2018, Month.OCTOBER, 2, 18, 0,0), LocalDateTime.of(2018, Month.OCTOBER, 2, 20, 0, 0));
        Flight flightWroGdn = new Flight("Wroclaw", "Gdansk", LocalDateTime.of(2018, Month.OCTOBER, 3, 9, 0,0), LocalDateTime.of(2018, Month.OCTOBER, 3, 10, 0, 0));
        Flight flightRzeGdn = new Flight("Rzeszow", "Gdansk", LocalDateTime.of(2018, Month.OCTOBER, 4, 12, 0,0), LocalDateTime.of(2018, Month.OCTOBER, 4, 14, 0, 0));
        Flight flightGdnPoz = new Flight("Gdansk", "Poznan", LocalDateTime.of(2018, Month.OCTOBER, 5, 9, 0,0), LocalDateTime.of(2018, Month.OCTOBER, 5, 10, 0, 0));
        Flight flightPozRze = new Flight("Poznan", "Rzeszow", LocalDateTime.of(2018, Month.OCTOBER, 5, 11, 0,0), LocalDateTime.of(2018, Month.OCTOBER, 5, 12, 0, 0));
        Flight flightPozWro = new Flight("Poznan", "Wroclaw", LocalDateTime.of(2018, Month.OCTOBER, 6, 9, 0,0), LocalDateTime.of(2018, Month.OCTOBER, 6, 10, 0, 0));
        Flight flightPozGdn = new Flight("Poznan", "Gdansk", LocalDateTime.of(2018, Month.OCTOBER, 6, 9, 0,0), LocalDateTime.of(2018, Month.OCTOBER, 6, 10, 0, 0));

        Map<Flight, Integer> flightDatabase = new HashMap<>();
        flightDatabase.put(flightGdnWro, 1);
        flightDatabase.put(flightGdnRze, 2);
        flightDatabase.put(flightWroGdn, 3);
        flightDatabase.put(flightRzeGdn, 4);
        flightDatabase.put(flightGdnPoz, 5);
        flightDatabase.put(flightPozRze, 6);
        flightDatabase.put(flightPozWro, 7);
        flightDatabase.put(flightPozGdn, 8);

        return flightDatabase;
    }
}
