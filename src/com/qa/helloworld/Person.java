package com.qa.helloworld;

public class Person {

    private String name;
    private int age;
    private String gender;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBreathing(boolean breathing) {
        isBreathing = breathing;
    }

    public void sayHello(){
        System.out.println(this.name + " says hi!");
    }
}
