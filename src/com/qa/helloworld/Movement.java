package com.qa.helloworld;

public interface Movement {

    double getSpeed(double s);
    boolean isParked(boolean b);


    void changeGear(int g);
    void speedUp(int s);
    void applyBrakes(int a);


    // to change gear
    public void changeGear(int newGear){
        gear = newGear;
    }

    // to increase speed
    public void speedUp(int increment){
        speed = speed + increment;
    }

    // to decrease speed
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }


}
