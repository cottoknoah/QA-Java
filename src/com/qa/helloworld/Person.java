package com.qa.helloworld;

public class Person {

    public String name; //
    public int age; //
    public String gender; //
    public boolean isBreathing;
    public int walkSpeed = 30; // in feet

    // Constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void read() {
        System.out.println(this.name + " is reading the book titled: {given}");
    }

    public boolean isStillBreathing() {
        return isBreathing;
    }

    public String speak(String msg) {
        return this.name + " says: " + msg;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println(this.name + " says hi!");
    }
}
