package com.example.code;

import java.util.Objects;

/**
 * This class is our city type object
 */
public class City implements Comparable{
    private String city;
    private String province;

    /**
     * This method creates a City object with the specified city and province
     * @param city name of the city
     * @param province the province the city belongs to
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * This method gets the name of the City object
     * @return the city name
     */
    public String getCity() {
        return city;
    }

    /**
     * This methods sets the name of the City object
     * @param city the new city name
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This methods gets the name of the province of the City objet
     * @return the province name
     */
    public String getProvince() {
        return province;
    }

    /**
     * This methods sets the name of the province of the City object
     * @param province the new province name
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /** This method compares cities base on city name field
     * @param o The object to compare city to
     * @return -1 if the caller is greater than the city name field of called object
     */
    @Override
    public int compareTo(Object o) { // we have to typecast object into cities
        City city = (City) o; // typecasting
        return this.city.compareTo(city.getCity());
    }


    /** This method checks if two City objects are equal by comparing their city and province field
     * @param o The object to compare city to
     * @return true if both cities and provinces are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        City other = (City) o;
        return Objects.equals(this.city, other.city)
                && Objects.equals(this.province, other.province);
    }

    /** This method returns the hash code number for the called City object
     * @return unique object ID
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}



