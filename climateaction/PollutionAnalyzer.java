/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.climateaction;

/**
 *
 * @author kamlesh
 */
public class PollutionAnalyzer {
    
    private String country;
    private double pollutionLevel;

    /**
     * Constructor with parameters
     * @param country the country name
     * @param pollutionLevel the pollution level value
     */
    public PollutionAnalyzer(String country, double pollutionLevel) {
        this.country = country;
        this.pollutionLevel = pollutionLevel;
    }
    
    /**
     * Default constructor
     * Initializes all fields to default values
     */
    public PollutionAnalyzer() {
        this.country = "";
        this.pollutionLevel = 0.0;
    }

    // Getter and setter methods
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPollutionLevel() {
        return pollutionLevel;
    }

    public void setPollutionLevel(double pollutionLevel) {
        this.pollutionLevel = pollutionLevel;
    }
    
    /**
     * Returns a string with all pollution data details
     * @return formatted string with country and pollution level
     */
    public String printDetails(){
        return "Country: " + country + ", Pollution Level: " + pollutionLevel;
    }
}

