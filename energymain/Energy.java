/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package energymain;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Cam
 */
public class Energy {
    private String energySourceType;
    private double costPerKilowattHour;
    private double totalKilowattsUsed;
    private double totalEnergyCost;
    private List<String> alternativeSuggestions;

    public Energy() {
        this.alternativeSuggestions = new ArrayList<>();
    }

    // Getters & Setters
    public String getEnergySourceType() {
        return energySourceType;
    }

    public void setEnergySourceType(String energySourceType) {
        this.energySourceType = energySourceType;
    }

    public double getCostPerKilowattHour() {
        return costPerKilowattHour;
    }

    public void setCostPerKilowattHour(double costPerKilowattHour) {
        this.costPerKilowattHour = costPerKilowattHour;
    }

    public double getTotalKilowattsUsed() {
        return totalKilowattsUsed;
    }

    public void setTotalKilowattsUsed(double totalKilowattsUsed) {
        this.totalKilowattsUsed = totalKilowattsUsed;
    }

    public double getTotalEnergyCost() {
        return totalEnergyCost;
    }

    public void setTotalEnergyCost(double totalEnergyCost) {
        this.totalEnergyCost = totalEnergyCost;
    }

    public List<String> getAlternativeSuggestions() {
        return alternativeSuggestions;
    }

    public void setAlternativeSuggestions(List<String> alternativeSuggestions) {
        this.alternativeSuggestions = alternativeSuggestions;
    }
}
