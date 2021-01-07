package ro.mta.se.lab.model;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private ArrayList<City> cities;
    private String countryName;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void addCity(City city){
        cities.add(city);
    }

    public void printCities(){
        for(City index: cities){
            System.out.println(index.getCityName() + " ");
        }
    }
}
