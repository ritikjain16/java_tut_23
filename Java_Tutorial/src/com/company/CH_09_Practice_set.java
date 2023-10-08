package com.company;

import java.util.Scanner;

public class CH_09_Practice_set {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//      1.
        float a= 7/4 * 9/2;
        System.out.println(a);

        float b= 7/4f * 9/2f; // for getting float value use 'f'.
        System.out.println(b);

//      2.
        char grade ='A';
        grade = (char)(grade+8); // type casting
        System.out.println(grade);

        grade = (char)(grade-8); // type casting
        System.out.println(grade);

//      3.

        System.out.println("Enter the no.");
        int n = s.nextInt();
        System.out.println(n>=45);
        System.out.println(n<=45);

    }
}
