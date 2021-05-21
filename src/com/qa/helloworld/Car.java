package com.qa.helloworld;

//subclass/child class of Car parent class
public class Car extends Vehicle implements Movement{
    private int seats;
    private String color;


    public Car(String vehicleType, String model, boolean isParked, boolean isDriving, int tireCount, int seats, String color) {
        super(vehicleType, model, isParked, isDriving, tireCount);
        this.seats = seats;
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }



}
