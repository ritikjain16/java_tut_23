package com.company;

class Phone{
     public void time(){
         System.out.println("Time is 7p.m.");
     }
     public void on(){
         System.out.println("Turning on Phone...");
     }
}

class Smartphone extends Phone{
    public void music(){
        System.out.println("Playing music in Smartphone");
    }

    @Override
    public void on(){
        System.out.println("Turning on Smartphone...");
    }
}

public class CH_35_Dynamic_Method_Dispatch {
    public static void main(String[] args) {

//      Smartphone s = new Phone();  // Not allowed


//        we can make reference of superclass with a subclass object.

        Phone p = new Smartphone();
        p.on();
        p.time();


//        but we cannot run subclass (smartphone) method.
//        p.music();  // not allowed


    }
}
