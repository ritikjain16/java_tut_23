package com.company;

import java.util.Scanner;

public class CH_12_IfElseAndSwitch {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner s =new Scanner(System.in);
        int age = s.nextInt();

//        if(age>18){
//            System.out.println("you are adult.");
//        }
//        else{
//            System.out.println("you are not an adult.");
//        }








//        ifElse ladder

//        IN THIS THE VALUES WRITTEN IN IF ELSE STATEMENTS SHOULD BE IN DECREASING ORDER.
//        FOR THIS WE WRITE FIRST 40,25,21,18 AND NOT 18,21,25,40 -> X(WRONG).

//        if(age>40){
//            System.out.println("You are experienced");
//        }
//        else if(age>25){
//            System.out.println("You are semi experienced");
//        }
//        else if(age>21){
//            System.out.println("You are semi-semi experienced");
//        }
//        else if(age>18){
//            System.out.println("You are adult");
//        }
//        else {
//            System.out.println("You are not experienced");
//        }









//         SWITCH (used for choices)

//        1st Method
//        switch (age){
//            case 18:
//                System.out.println("You are adult");
//                break;
//                case 21:
//                System.out.println("You are semi-semi experienced");
//                break;
//                case 25:
//                System.out.println("You are experienced");
//                break;
//            default:
//                System.out.println("You are not experienced");
//
//        }

//        2nd Method(enhanced)
        switch (age) {
            case 18 -> System.out.println("You are adult");
            case 21 -> System.out.println("You are semi-semi experienced");
            case 25 -> System.out.println("You are experienced");
            default -> System.out.println("You are not experienced");
        }
    }
}
