package com.tts;

import java.awt.*;
import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);


        System.out.println("Choose an operator: add, subtract, multiply, divide, or square");
        String string = input.next();


        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (string) {


            case "add":
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;


            case "subtract":
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;


            case "multiply":
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;


            case "divide":
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            case "square":
                result = number1 * number1;
                System.out.println(number1 + " * " + number1 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;


        }


        input.close();

    }

    public int square(int num1) {
        return num1 * num1;

    }
}

