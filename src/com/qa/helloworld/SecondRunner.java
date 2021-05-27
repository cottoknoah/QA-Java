package com.qa.helloworld;

import java.util.Scanner;

public class SecondRunner {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//		double data type to include possible decimal answers
        double num1, num2;
        System.out.print("Enter first number:");
//	    Refactored to have a second int variable
        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close(); // IMPORTANT
        double output;

        switch(operator)
        {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                output = num1 / num2;
                break;
            default:
                System.out.printf("Wrong operator chosen.");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+" = "+output);
    }
}