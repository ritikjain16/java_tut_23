package com.company;

import java.util.Scanner;

public class CH_15_Loops {
    public static void main(String[] args) {
        System.out.println("Enter the integer");
        Scanner s = new Scanner((System.in));
        int n = s.nextInt();

//        for loop
//        for (int i=1;i<=n;i++){
//            System.out.println(i);
//        }




//        while loop
//        int i=1;
//        while (i<=n){
//            System.out.println(i);
//            i++;
//        }



//        do while loop
//        int i=1;
//        do {
//            System.out.println(i);
//            i++;
//        }while (i<=n);




//        break statement
//        int i=1;
//        do {
//            System.out.println(i);
//            i++;
//            if(i==2){
//                break;
//            }
//        }while (i<=n);


        //    continue statement
//        int i=0;
//        do {
//            i++;
//            if(i==2){
//                continue;
//            }
//            System.out.println(i);
//
//
//        }while (i<=n);




//        continue by for loop
        for (int i=1;i<=n;i++){
            if (i==2){
                continue;
            }
            System.out.println(i);

        }



    }
}
