/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportapp;

/**
 *
 * @author SamPaisley
 */
public class CO2Calculator extends Transport {
    private double emissions;
    private double bEmissions;
    private double cEmissions;
    private double tEmissions;

    public CO2Calculator(String transType, double distance) {
        super(transType, distance);
    }
    
    public CO2Calculator() {
        emissions = 0.0;
        bEmissions = 0.0;
        cEmissions = 0.0;
        tEmissions = 0.0;
    }

    public double getEmissions() {
        return emissions;
    }

    public void setEmissions(double emissions) {
        this.emissions = emissions;
    }

    public double getbEmissions() {
        return bEmissions;
    }

    public void setbEmissions(double bEmissions) {
        this.bEmissions = bEmissions;
    }

    public double getcEmissions() {
        return cEmissions;
    }

    public void setcEmissions(double cEmissions) {
        this.cEmissions = cEmissions;
    }

    public double gettEmissions() {
        return tEmissions;
    }

    public void settEmissions(double tEmissions) {
        this.tEmissions = tEmissions;
    }
    
    public double calculate() {
        double KgCO2e = 0.0; // https://www.co2everything.com/how-we-calculate-km-of-driving how we are calculating co2 emmissions- kgCO2 per km

        switch (transType.toLowerCase()) {
            case "car":
                KgCO2e = 0.128; // 128grams co2 per km
                cEmissions = distance*KgCO2e;
                emissions = cEmissions;
                break;
            case "bus":
                KgCO2e = 0.089; // 89grams co2 per km
                bEmissions = distance* KgCO2e;
                emissions = bEmissions;
                break;
            case "train":   
                KgCO2e = 0.041; // 42 grams co2 per km
                tEmissions = distance* KgCO2e;
                emissions = tEmissions;
                break;
            case "bike":
                KgCO2e = 0.0; 
                emissions = 0.0;
                break;
            default:
                System.out.println("Unknown transport type");
                emissions = 0.0;
                break;
        }
        return emissions;
    }
    
    @Override
    public String printResults() {
        return super.printResults()+"\nyour emissions are: "+emissions+"kg of Co2";
    }
}
