package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a decimal number. ");
        double x = scanner.nextDouble();
        System.out.println("Give me another decimal number. ");
        double n = scanner.nextDouble();

        areEqualByThreeDecimalPlaces(x,n);

    }

    public static boolean areEqualByThreeDecimalPlaces(double x, double n){
        if(((int) (x * 1000)) == ((int) (n * 1000))){//Multiplies the numbers by 1000 then checks if the numbers are equal
            System.out.println("Your numbers are equal up to three decimal places.");
            return true;
        }
        else{
            System.out.println("Your numbers are not equal to the third decimal.");
            return false;
        }
    }
}
