package climateactionapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author kamlesh
 */
public class PlasticWasteCalculator {
    
 private double plasticPerDay;
    private int days;
    private String result;

    /**
     * Constructor with parameters
     * @param plasticPerDay amount of plastic used per day in kg
     * @param days number of days
     * @param result total result
     */
    public PlasticWasteCalculator(double plasticPerDay, int days, String result) {
        this.plasticPerDay = plasticPerDay;
        this.days = days;
        this.result= result;
    }
    
    /**
     * Default constructor
     * Initializes all fields to default values
     */
    public PlasticWasteCalculator() {
        this.plasticPerDay = 0.0;
        this.days = 0;
    }

    // Getter and setter methods
    public double getPlasticPerDay() {
        return plasticPerDay;
    }

    public void setPlasticPerDay(double plasticPerDay) {
        this.plasticPerDay = plasticPerDay;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getResult() {
        return result;
    }
    
    /**
     * Returns a string with all plastic waste details
     * @return formatted string with plastic per day, days and total waste
     */
    public String printDetails(){
        return result;
    }
    
}