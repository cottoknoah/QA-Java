package com.qa.helloworld;

public class Motorcycle extends Vehicle {

    private boolean hasInsurance;

    public Motorcycle(String vehicleType, String model, boolean isParked, boolean isDriving, int tireCount, boolean hasInsurance) {
        super(vehicleType, model, isParked, isDriving, tireCount);
        this.hasInsurance=hasInsurance;

    }
    //IDE generated this
    public Motorcycle(String motorcyle, String m, int i, int i1, int tireCount, int i2) {
    }
}