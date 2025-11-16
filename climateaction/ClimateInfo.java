/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.climateaction;

/**
 *
 * @author kamlesh
 */
public class ClimateInfo {
      // Private data members
    private int year;
    private double seaLevel;
    private double temperatureDifference;

    /**
     * Constructor with parameters
     * @param year the year of the climate data
     * @param seaLevel the sea level change in mm
     * @param temperatureDifference the temperature difference in Celsius
     */
    public ClimateInfo(int year, double seaLevel, double temperatureDifference) {
        this.year = year;
        this.seaLevel = seaLevel;
        this.temperatureDifference = temperatureDifference;
    }
    
    /**
     * Default constructor
     * Initializes all fields to default values
     */
    public ClimateInfo() {
        this.year = 0;
        this.seaLevel = 0.0;
        this.temperatureDifference = 0.0;
    }

    // Getter and setter methods
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(double seaLevel) {
        this.seaLevel = seaLevel;
    }

    public double getTemperatureDifference() {
        return temperatureDifference;
    }

    public void setTemperatureDifference(double temperatureDifference) {
        this.temperatureDifference = temperatureDifference;
    }
    
    /**
     * Returns a string with all climate data details
     * @return formatted string with year, sea level and temperature difference
     */
    public String printDetails(){
        return "Year: " + year + ", Sea Level: " + seaLevel + "mm, Temp Diff: " + temperatureDifference + "°C";
    }
}
