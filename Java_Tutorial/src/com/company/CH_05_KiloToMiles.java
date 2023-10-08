package com.company;

import java.util.Scanner;

public class CH_05_KiloToMiles {
    public static void main(String[] args) {
        System.out.println("enter the value in kilometres");
        Scanner s = new Scanner(System.in);
        float kilo = s.nextFloat();
        double miles = 0.621 * kilo;
        System.out.println(kilo + " kilometres is " + miles + " miles");

    }
}
