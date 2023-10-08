package com.company;

import java.util.Scanner;

public class CH_03_Variables1 {
    public static void main(String[] args) {
        float a,b,c,d,e;
        System.out.println("Enter your marks of 5 subjects");
        Scanner s = new Scanner(System.in);
        a=s.nextFloat();
        b=s.nextFloat();
        c=s.nextFloat();
        d=s.nextFloat();
        e=s.nextFloat();
        float res = (a+b+c+d+e)/50;
        System.out.println("Your result is " + res);


        // we can check that the input taken from the user is int,float,etc. by using boolean.
//        System.out.println("enter the integer");
//        boolean bb=s.hasNextInt();  // by using hasNext we get boolean value.
//        System.out.println(bb);


//        System.out.println("enter the string");
//          String str = s.next();  // it only reads one word.
//        String str2 =s.nextLine();  // it reads full string..
//        System.out.println(str2);






    }
}
