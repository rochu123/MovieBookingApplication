package org.example;

import org.example.Location.City;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class TheaterController {
    private List<Theater> theaters;

    public void addTheater(Theater theater) {
        if (isNull(theater)) {
            theaters = new ArrayList<>();
        }
        theaters.add(theater);
    }

    public List<Theater> findTheatersInCity(City city) {
        List<Theater> theatersInCity = new ArrayList<>();
        for (Theater theater : theaters) {
            if (city.equals(theater.getLocation().getCity())) {
                theatersInCity.add(theater);
            }
        }
        return theatersInCity;
    }
}
