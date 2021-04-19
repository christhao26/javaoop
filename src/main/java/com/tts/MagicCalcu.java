package com.tts;

import java.util.Scanner;

public class MagicCalcu extends Calculator {
    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        //scanner class to take input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int num = sc.nextInt();
        //calling square method
        double sq = Math.sqrt(num);
        System.out.println("The Square Root of " + num + " is: " + sq);
//        double sinValue = Math.sin(num);
//        double cosValue = Math.cos(num);
//        double tanValue = Math.tan(num);
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

//
        System.out.println ("Enter angle in degrees :");

        double degree = sc.nextDouble ();

        double radians = Math.toRadians (degree);

        System.out.println ("Sin is: " + Math.sin (radians));
        System.out.println ("Cosine is: " + Math.cos (radians));
        System.out.println ("Tangent is: " + Math.tan (radians));
       System.out.println ("Factorial of "+ num + " is: " + factorial);







    }
}
