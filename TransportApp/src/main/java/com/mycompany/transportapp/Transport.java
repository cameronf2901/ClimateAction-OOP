/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportapp;

/**
 *
 * @author SamPaisley
 */
public class Transport {
    protected String transType;
    protected double distance;

    public Transport(String transType, double distance) {
        this.transType = transType;
        this.distance = distance;
    }
    
    public Transport() {
        transType = "";
        distance = 0.0;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
   
    public String printResults() {
        return "Transport type: "+transType+" Distance travelled: "+distance+"km";
    }
}
