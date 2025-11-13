/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportapp;

/**
 *
 * @author SamPaisley
 */
public class Calorie extends Transport {
    private double caloriesBurned;

    public Calorie(String transType, double distance) {
        super(transType, distance);
    }
    
    public Calorie() {
        caloriesBurned = 0.0;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(double caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }
    
    public void calculate() {
        if (transType.equalsIgnoreCase("Running")) {
            caloriesBurned = distance*62;
        } else if (transType.equalsIgnoreCase("Walking")) {
            caloriesBurned = distance*45;
        } else {
            System.out.println("Invalid transport type. Please enter Running or Walking");
        }
    }
    
    @Override
    public String printResults() {
        return super.printResults()+"\nYou have burned "+caloriesBurned+" Calories";
    }
}
 