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


//        List<Integer> arrayList = new ArrayList<>();
//        int x =1;
//        arrayList.add(x++);
//        arrayList.add(x++);
//        arrayList.add(x++);
//        arrayList.add(x++);
//
//        for(Integer handle : arrayList) {
//            System.out.println(handle);
//        }
        System.out.println("---------------");
        System.out.println("APP END");
        //ENDS
/*
        Primitives Data Types
        int, boolean, short, long, float, double, char, byte
        Wrapper classes, complex data type, always capital
        String, Object
        RULES: no default value; null

        Integer, Boolean, Short, Long, Float, Double, Char, Byte
        Integer y = 0;
        Boolean z = false;
        Short a = 0;
        Long b = 0L;
        Float c = 0.5f;
        Double d = 123.5;
        Character e = 'a';
        Byte f = 0;

        The .equals() method compared the contents of an object

        int x = Integer.parseInt("12");

        String var = "Hello World.";
        String var = new String("Hello World 2");
        System.out.println();
*/

    }





}
