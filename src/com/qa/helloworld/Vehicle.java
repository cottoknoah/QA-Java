package com.qa.helloworld;

public abstract class Vehicle implements Movement {

    private String vehicleType;
    private String model;
    private boolean isParked;
    private boolean isDriving;
    private int tireCount;

    public Vehicle(){
    }

    public Vehicle(String vehicleType, String model, boolean isParked, boolean isDriving, int tireCount) {
        this.vehicleType = vehicleType;
        this.model = model;
        this.isParked = isParked;
        this.isDriving = isDriving;
        this.tireCount = tireCount;
       }


    public void driving() {
        this.isDriving = true;
    }

    public void parked() {
        this.isParked = true;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getModel() {
        return vehicleType;
    }

    public int getTireCount() {
        return tireCount;
    }

    public void setTireCount(int tireCount) {
        this.tireCount = tireCount;
    }


    @Override
    public double getSpeed(double s) {
        return 0;
    }

    @Override
    public boolean isParked(boolean b) {
        return false;
    }
}