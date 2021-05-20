package com.qa.helloworld;

//Task: using a List implementation, store all your vehicles in a Garage class.

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

//    Create a method in Garage that --iterates through each Vehicle--,
//    calculating a bill for each type of Vehicle in a different way,
//    depending on the type of vehicle it is.
    public static void sortVehicle() {
        Vehicle vehicle = new Vehicle();
        for (int counter = 0; counter < 10; counter++) {
            System.out.println(counter);
        }
    }

}




