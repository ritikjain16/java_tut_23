package com.company;

import java.util.Scanner;

public class CH_04_CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println("enter the value of temperature in celsius");
        Scanner s = new Scanner(System.in);
        float cel = s.nextFloat();
        float fah = (9*cel)/5 + 32 ;
        float kel = 273 + cel;
        System.out.println(cel + " celsius is " + fah + " fahrenheit and in kelvin is " + kel );

    }
}