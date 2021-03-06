package com.qa.helloworld;

//QA Class Review

public class Loops {

    public static void transferOfControl() {
        // for (initialization; termination; increment)
        // - use a counter variable
        for (int counter = 0; counter < 10; counter++) {
            if (counter == 2) {
                continue; // skips the current code block in the loop
            }
            if (counter == 6) {
                break;
            }
            System.out.println(counter);
        }
    }
    public static void nestedForStatement() {
        for (int counter = 1; counter <= 10; counter++) {
            for (int innerCounter = 1; innerCounter <= 10; innerCounter++) {
                System.out.println(counter + " * " + innerCounter + " = " + (counter * innerCounter));
            }
        }
    }
    public static void forStatement() {
        // for (initialization; termination; increment)
        for (int counter = 0; counter < 10; counter++) {
            System.out.println(counter);
        }
    }
    public static void doWhileStatement() {
        // do-while loops always execute at least once
        int playCount = 0;
        int maxPlays = 8;
        do {
            playCount++;
            System.out.println("Play count: " + playCount);
        } while (playCount < maxPlays);
    }
    public static void whileStatement() {
        // execution stops when either;
        // - the boolean condition changes to false
        // - the conditional statement changes to false
        int parkingLotCapacity = 500;
        int parkedCars = 450;
        boolean notFull = true;
        // while loops might never run
        while (notFull == true) {
            // we can abbreviate it to `while (notFull)`
            parkedCars++;
            System.out.println(parkedCars);
            if (parkedCars >= parkingLotCapacity) {
                notFull = false;
            }
        }
        System.out.println("Execution resumed outside of loop");
    }


}
