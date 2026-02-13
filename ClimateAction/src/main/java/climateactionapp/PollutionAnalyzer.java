package climateactionapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author kamlesh
 */
public class PollutionAnalyzer {
    
    private String country;
    private double pollutionLevels;
    private String result;

    /**
     * Constructor with parameters
     * @param country the country name
     * @param pollutionLevel the pollution level value
     * @param result the result
     */
    public PollutionAnalyzer(String country, double pollutionLevel, String result) {
        this.country = country;
        this.pollutionLevels = pollutionLevel;
        this.result= result;
    }
    
    /**
     * Default constructor
     * Initializes all fields to default values
     */
    public PollutionAnalyzer() {
        this.country = "";
        this.pollutionLevels = 0.0;
       
    }

    // Getter and setter methods
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPollutionLevel() {
        return pollutionLevels;
    }

    public void setPollutionLevel(double pollutionLevel) {
        this.pollutionLevels = pollutionLevel;
    }

    public String getResult() {
        return result;
    }
    
    
    
    /**
     * Returns a string with all pollution data details
     * @return formatted string with country and pollution level
     */
    public String printDetails(){
        return result ;
    }
}

