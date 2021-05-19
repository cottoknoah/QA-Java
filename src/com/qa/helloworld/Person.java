package com.qa.helloworld;

public class Person {

    private String name; //
    private int age; //
    private String gender; //
    public boolean isBreathing;

    // Constructor
    public Person(String name, int age, String gender, boolean isBreathing) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isBreathing=isBreathing();
    }

    // Default Constructor
    public Person() {
    }

    public void read() {
        System.out.println(this.name + " is reading the book titled: {given}");
    }

    public boolean isBreathing() {
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
