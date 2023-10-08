package com.company;

import java.util.Random;
import java.util.Scanner;

class GuessTheNumber{
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    int comp;
    int user=0;
    private int guess =0;

    //constructor
    public GuessTheNumber(){
       comp = rand.nextInt(100);

   }

   // toDetectNumber() method
    public void toDetectNumber(){
       while (user!=comp){
            System.out.println("Guess the no. between 1 to 100 : ");
            user=sc.nextInt();
            if(user<comp){
               System.out.println("Try a Larger No.");
           }
           else if(user>comp){
               System.out.println("Try a smaller No.");
           }
           else {
                System.out.println("You guessed it correct.");
            }
           guess++;
       }

    }

//  guess --> by getter and setter.
    public int getGuess(){
        return guess;
    }

    public void setGuess(int n){
        guess=n;
    }

}
public class CH_30_Guess_the_no {
    public static void main(String[] args) {

        GuessTheNumber n = new GuessTheNumber();
        n.toDetectNumber();
        System.out.println("You guessed the no. in "+n.getGuess()+" attempts.");


    }
}

