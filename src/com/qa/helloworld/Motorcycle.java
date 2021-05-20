package com.qa.helloworld;

public class Motorcycle extends Vehicle {

    private boolean hasInsurance;

    public Motorcycle(String vehicleType, String model, boolean isParked, boolean isDriving, int tireCount, boolean hasInsurance) {
        super(vehicleType, model, isParked, isDriving, tireCount);
        this.hasInsurance=hasInsurance;

    }



}