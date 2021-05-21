package com.qa.helloworld;

//Task: using a List implementation, store all your vehicles in a Garage class.
import java.util.ArrayList;
import java.util.List;

public class Garage {
    // Any number of final, static fields
    // Any number of abstract method declarations\

    private String garageName;

    public Garage() {
        super();
        this.garageName = "Knoah's Garage";
    }
    public Garage(String garageName) {
        this.garageName = garageName;
    }

    public String getGarageName() {
        return garageName;
    }

    List<String> vehicle = new ArrayList<>();

//    Create a method in Garage that --iterates through each Vehicle--,
//    calculating a bill for each type of Vehicle in a different way,
//    depending on the type of vehicle it is.
    public static void sortVehicle() {
        Vehicle vehicle = new Vehicle();
        for (int counter = 0; counter < 10; counter++) {
            System.out.println(counter);
        }
    }
//    Garage should have methods that add Vehicle,
//    remove Vehicle(s) (By ID, By Vehicle Type) fix Vehicle (Calculate bill) and
//    empty the garage

    public void isEmpty(boolean isEmpty) {
//        if garage is empty print true
//        else garage is NOT empty print false
    }

    public void addVehicle(int v) {

    }



}




