package org.example;

public class Location {

    private City city;//made enum just for ease

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }


    public enum City{
        BATHINDA,
        PATIALA,
        MUKERIAN
    }
}
