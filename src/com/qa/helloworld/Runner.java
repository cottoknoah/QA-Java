package com.qa.helloworld;

import java.util.ArrayList;
import java.util.List;

//Class has a scope
public class Runner {

    public static void main(String[] args){
        // START
        System.out.println("APP START");
        System.out.println("---------------");
        Garage myGarage = new Garage("Knoah's Garage");
        System.out.println("Welcome to " + myGarage.getGarageName());

//        List<String> vehicle = new ArrayList<>();
//        Vehicle vehicle = new ArrayList<Vehicle>();

        Vehicle x = new Motorcycle("Motorcyle", "M", 0, 0, 1, 1);
        System.out.println("Motorcycle is parked in " + myGarage.getGarageName());
        x.parked();



        System.out.println("---------------");
        System.out.println("APP END");
        //ENDS

    }





}
