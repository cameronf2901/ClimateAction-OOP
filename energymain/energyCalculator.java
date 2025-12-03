/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package energymain;

/**
 *
 * @author Cam
 */
public class energyCalculator extends Energy {
    private String device;       // device name
    private double killowatts;   // kWh used
    private int time;            // time used
    private double cost;         // calculated cost

    // Arrays to store multiple device calculations
    private String[] deviceList = new String[20];
    private double[] kwhList = new double[20];
    private int[] timeList = new int[20];
    private int count = 0;

    public energyCalculator(double killowatts, int time, double cost, String device) {
        this.killowatts = killowatts;
        this.time = time;
        this.cost = cost;
        this.device = device;
    }

    public energyCalculator() {
        // empty constructor for GUI use
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public double getKillowatts() {
        return killowatts;
    }

    public void setKillowatts(double killowatts) {
        this.killowatts = killowatts;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    //add a device and its data into array
    public void addDeviceData(String deviceName, double kwhUsed, int timeUsed) {
        deviceList[count] = deviceName;
        kwhList[count] = kwhUsed;
        timeList[count] = timeUsed;
        count++;
    }

    //calculate cost for a device
    public double computeCost(double ratePerKwh) {
        cost = killowatts * ratePerKwh * time;
        return cost;
    }

    //calculate total kWh of all devices
    public double getTotalKwh() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += kwhList[i];
        }
        return total;
    }
    
    
    public String getDeviceSummary() {
        String summary = "";
        for (int i = 0; i < count; i++) {
            summary += deviceList[i] + " - " + kwhList[i] + " kWh\n";
        }
        return summary;
    }
    
}