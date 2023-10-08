package com.company;

public class CH_22_Methods_OverLoading {

    // we can create methods of same name if we are passing different no. or different types of Parameters.


    static void hello(){
        System.out.println("Hello");
    }

    static void hello(String s){
        System.out.println(s);
    }

    static  void hello(int a){
        System.out.println(a);
    }

    static void hello(int a,int b){
        System.out.println(a+" "+b);
    }

    // we cannot create same methods if they are same but their type (ex-void,int) are different.

//    static int hello(){   // WRONG
//        return 1;
//    }




    public static void main(String[] args) {
        hello();
        hello("Ritik Jain");
        hello(5);
        hello(8,9);
    }
}
