/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportapp;
import java.text.DecimalFormat;
/**
 *
 * @author SamPaisley
 */
public class FuelCalculator extends Transport {
    private double petrolEfficiency;
    private double electricEfficiency;
    private double petrolEmissions;
    private double electricEmissions;
    private double petrolUsed;
    private double electricUsed;
    private double petrolCO2;
    private double electricCO2;
    private double petrolCost;
    private double electricCost;

    public FuelCalculator(String transType, double distance) {
        super(transType, distance);
    }
    
    public FuelCalculator() {
        petrolEfficiency = 0.0;
        electricEfficiency = 0.0;
        petrolEmissions = 0.0;
        electricEmissions = 0.0;
        petrolUsed = 0.0;
        electricUsed = 0.0;
        petrolCO2 = 0.0;
        electricCO2 = 0.0;
        petrolCost = 0.0;
        electricCost = 0.0;
    }

    public double getPetrolEfficiency() {
        return petrolEfficiency;
    }

    public void setPetrolEfficiency(double petrolEfficiency) {
        this.petrolEfficiency = petrolEfficiency;
    }

    public double getElectricEfficiency() {
        return electricEfficiency;
    }

    public void setElectricEfficiency(double electricEfficiency) {
        this.electricEfficiency = electricEfficiency;
    }

    public double getPetrolEmissions() {
        return petrolEmissions;
    }

    public void setPetrolEmissions(double petrolEmissions) {
        this.petrolEmissions = petrolEmissions;
    }

    public double getElectricEmissions() {
        return electricEmissions;
    }

    public void setElectricEmissions(double electricEmissions) {
        this.electricEmissions = electricEmissions;
    }

    public double getPetrolUsed() {
        return petrolUsed;
    }

    public void setPetrolUsed(double petrolUsed) {
        this.petrolUsed = petrolUsed;
    }

    public double getElectricUsed() {
        return electricUsed;
    }

    public void setElectricUsed(double electricUsed) {
        this.electricUsed = electricUsed;
    }

    public double getPetrolCO2() {
        return petrolCO2;
    }

    public void setPetrolCO2(double petrolCO2) {
        this.petrolCO2 = petrolCO2;
    }

    public double getElectricCO2() {
        return electricCO2;
    }

    public void setElectricCO2(double electricCO2) {
        this.electricCO2 = electricCO2;
    }

    public double getPetrolCost() {
        return petrolCost;
    }

    public void setPetrolCost(double petrolCost) {
        this.petrolCost = petrolCost;
    }

    public double getElectricCost() {
        return electricCost;
    }

    public void setElectricCost(double electricCost) {
        this.electricCost = electricCost;
    }
    
    public void calculate() {
        //hardcoded values
        petrolEfficiency = 7.0;
        electricEfficiency = 15.0;
        petrolEmissions = 2.31;
        electricEmissions = 0.45;
        double petrolPPL = 1.85; //price per litre
        double electricPPK = 0.20; //price per km
        
        // petrol car calc
        petrolUsed = (distance*petrolEfficiency)/100;
        petrolCO2 = petrolUsed*petrolEmissions;
        petrolCost = petrolUsed*petrolPPL;
        
        // electric car calc
        electricUsed = (distance*electricEfficiency/100);
        electricCO2 = petrolUsed*electricEmissions;
        electricCost = electricUsed*electricPPK;
    }
    
    @Override
    public String printResults() {
        DecimalFormat df = new DecimalFormat("#.##"); // imported decimal format to display 2 decimal points
        return super.printResults()+"\nFuel Calculator"+"\nPetrol car:"+" Fuel used: "+df.format(petrolUsed)+"| CO2 Emitted: "+df.format(petrolCO2)+"kg | Petrol Cost: €"+df.format(petrolCost)+"\nElectric car:"+" Energy used: "+df.format(electricUsed)+"| CO2 Emitted: "+df.format(electricCO2)+"kg | Energy Cost: €"+df.format(electricCost);
    }
}
