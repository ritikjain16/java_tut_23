package com.company;

import java.util.Scanner;

public class CH_13_If_Else_Practice_set {
    public static void main(String[] args) {
//        1.
//        System.out.println("Enter your marks of 5 subjects");
//        Scanner s = new Scanner(System.in);
//        byte s1 = s.nextByte();
//        byte s2 = s.nextByte();
//        byte s3 = s.nextByte();
//        byte s4 = s.nextByte();
//        byte s5 = s.nextByte();
//        float avg = (s1+s2+s3+s4+s5)/5.0f;
//        System.out.println("your % is " + avg + "%");
//        if (avg>=40 && s1>=33 && s2>=33 && s3>=33 && s4>=33 && s5>=33){
//            System.out.println("you are pass");
//        }
//        else {
//            System.out.println("you are fail");
//        }




//        2.
//        System.out.println("Enter your income");
//        Scanner s = new Scanner(System.in);
//        float tax =0;
//        float income = s.nextFloat();
//        if(income<=2.5){
//            tax=tax+0;
//        }
//        else if(income>2.5f && income<=5.0f){
//            tax= tax + 0.05f * (income-2.5f);
//        }
//        else if(income>5.0f && income<=10.0f){
//            tax= tax + 0.05f * (5.0f-2.5f);
//            tax= tax + 0.2f * (income-5.0f);
//        }
//        else if(income>10.0f){
//            tax= tax + 0.05f * (5.0f-2.5f);
//            tax= tax + 0.2f * (10.0f-5.0f);
//            tax= tax + 0.3f * (income-10.0f);
//        }
//
//        System.out.println("The total tax paid by the employee is : "+tax+" lakhs");




//        3.
//        System.out.println("Enter your choice");
//        Scanner s = new Scanner(System.in);
//        int day = s.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("wrong choice");
//
//        }

//        4.
//        System.out.println("Enter year");
//        Scanner s = new Scanner(System.in);
//        int year = s.nextInt();
//        if((year % 4 ==0 && year%100 != 0) || year % 400 ==0){
//            System.out.println("Leap Year");
//        }
//        else {
//            System.out.println("Not a leap year");
//        }







//        5.
        System.out.println("Enter your website");
        Scanner s = new Scanner(System.in);
        String st = s.next();
        if(st.endsWith(".org")){
            System.out.println("This is an organisational website");
        }
        else if(st.endsWith(".com")){
            System.out.println("This is commercial website");
        }
        else if(st.endsWith(".in")){
            System.out.println("This is an indian website");
        }

    }
}
