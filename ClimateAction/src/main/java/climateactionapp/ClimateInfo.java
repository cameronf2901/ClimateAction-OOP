package climateactionapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author kamlesh
 */
public class ClimateInfo {
      // Private data members
    private int year;
    private double seaLevels;
    private String result;
    

    /**
     * Constructor with parameters
     * @param year the year of the climate data
     * @param seaLevel the sea level change in mm
     *@param result the result
     */
    public ClimateInfo(int year, double seaLevel, String result) {
        this.year = year;
        this.seaLevels = seaLevel;
       this.result = result;
    }
    
    /**
     * Default constructor
     * Initializes all fields to default values
     */
    public ClimateInfo() {
        this.year = 0;
        this.seaLevels = 0.0;
    }

    // Getter and setter methods
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSeaLevel() {
        return seaLevels;
    }

    public void setSeaLevel(double seaLevel) {
        this.seaLevels = seaLevel;
    }

    /**
     * Returns a string with all climate data details
     * @return formatted string with year and sea level 
     */
    public String result(){
        return result;
    }
}
