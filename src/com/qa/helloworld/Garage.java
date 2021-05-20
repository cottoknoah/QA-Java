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


}




