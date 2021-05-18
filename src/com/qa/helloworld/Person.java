package com.qa.helloworld;

public class Person {

    public String name;
    public float height;
    public int age;
    public String eyeColor;
    public String ethnicity;
    public String gender;
    public boolean isBreathing;
    public  int walkSpeed = 30; //in feet

    //Contructor
    public Person() {

    }


    public void read() {
        System.out.println("{name} is reading the book titled: {given}");
    }

    public boolean isStillBreathing() {
        return isBreathing;
    }

    public String speak() {
        return "{name} says: ";
    }

    public int walk() {
//        return "{name} says: " +msg;
    }


}
