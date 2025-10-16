package com.example.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class holds our City type objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This method adds a City type object to the cities list
     * @param c: the object to add
     * @throws IllegalArgumentException if c already exists in the cities list
     */
    public void add(City c) {
        if(cities.contains(c)) {
            throw new IllegalArgumentException();
        }
        cities.add(c);
    }

    /**
     * This method checks whether or not the given city is in the cities list
     * @param city: the object to check
     * @return True if city is in the cities list, False otherwise
     */
    public boolean hasCity(City city) {
        for (City c : cities) {
            if (c.equals(city)) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method removes a City type object in the cities list
     * @param city: the object to delete
     * @throws IllegalArgumentException if city does not exist in the cities list
     */
    public void delete(City city) {
        if (cities.contains(city)) {
            cities.remove(city);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * This method counts how many City objects exist in the cities list
     * @return number of City objects in the cities list
     */
    public int countCities() {
        return cities.size();
    }

    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}
