package com.company;

import java.util.Scanner;

public class CH_24_Recursion {

//    Iterative Procedure

//    static int factorial(int n){
//        int fac=1;
//        if(n==0 &&  n==1){
//            return 1;
//        }
//        else {
//            for (int i=1;i<=n;i++){
//                fac*=i;
//            }
//        }
//        return fac;
//    }





//    Recursive Procedure

//    static int factorial(int n){
//
//        if(n==0 ||  n==1){
//            return 1;
//        }
//        else {
//            return n*factorial(n-1);
//        }

//    }





    //    Iterative Procedure

//    static void fibonacci(int n){
//     int a=0;
//        int b=1;
//        int c;
//
//        System.out.print(a);
//
//        System.out.print("\t"+b);
//
//        for (int i=0;i<n-2;i++){
//            c=a+b;
//            System.out.print("\t" + c);
//            a=b;
//            b=c;
//
//
//        }
//}





    //    Recursive Procedure
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a no.");
//        int a = s.nextInt();
//        System.out.println("Factorial of "+a+" is "+factorial(a));


//        fibonacci(a);

        int n = s.nextInt();
        for(int i=0;i<n;i++){
         System.out.print(fibonacci(i)+"\t");
        }



    }
}
