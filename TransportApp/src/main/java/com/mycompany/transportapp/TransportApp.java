/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transportapp;
import javax.swing.JOptionPane;
/**
 *
 * @author SamPaisley
 */
public class TransportApp {

    public static void main(String[] args) {
        TransportGUI tGUI = new TransportGUI();
        CalorieGUI cGUI = new CalorieGUI();
        fcGUI fcGUI = new fcGUI();
        tGUI.setVisible(true);
        
        
        String input, transType;
        double distance;
        
        input = JOptionPane.showInputDialog(null, "Welcome to the Transport App\nPlease select from\n(T) Transport\n(F) Fuel\n(C) Calorie");
        if (input.equalsIgnoreCase("t")) {
            transType = JOptionPane.showInputDialog(null,"Please enter mode of transport,\n 'Car' ,'Bus' ,'Train' ,'Bike' ,'Walking'");
            distance = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter distance you are travelling in KM"));
            CO2Calculator co2 = new CO2Calculator(transType,distance);
            co2.calculate();
            JOptionPane.showMessageDialog(null,co2.printResults());
        }else if (input.equalsIgnoreCase("f")) {
            distance = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the distance you want to travel in KM"));
            transType = "Car";
            FuelCalculator fc = new FuelCalculator(transType,distance);
            fc.calculate();
            JOptionPane.showMessageDialog(null,fc.printResults());
        }else if (input.equalsIgnoreCase("c")) {
            transType = JOptionPane.showInputDialog(null,"Please enter mode of transport,\n walking or running");
            distance = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter distance you are travelling"));
            Calorie c = new Calorie(transType, distance);
            c.calculate();
            JOptionPane.showMessageDialog(null,c.printResults());
        }
    }
}
