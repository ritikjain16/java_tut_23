package com.company;

import java.util.Random;
import java.util.Scanner;

public class CH_14_Rock_Paper_Scissor_Game {
    public static void main(String[] args) {
        Random ran = new Random();
        int num = ran.nextInt(100);
//        System.out.println("Random number is: "+ num);

        char comp;

        if(num<33){
            comp = 'r';
        }
        else if(num>33 && num<66){
            comp='p';
        }
        else{
            comp='s';
        }

        System.out.println("Enter 'r' for rock ,'p' for paper and 's' for scissor.");
        Scanner s = new Scanner(System.in);
        char you = s.next().charAt(0);

        if(you == 'r' && comp == 's'){
            System.out.println("You Won!.Bcz rock beats scissor");
        }
        else if(you == 's' && comp == 'p'){
            System.out.println("You Won!.Bcz scissor cuts the paper");
        }
        else if(you == 'p' && comp == 'r'){
            System.out.println("You Won!.Bcz paper hides the rock");
        }
        else if(you == 's' && comp == 'r'){
            System.out.println("You Lost!.Bcz scissor beaten by the rock");
        }
        else if(you == 'p' && comp == 's'){
            System.out.println("You Lost!.Bcz paper cuts by the scissor");
        }
        else if(you == 'r' && comp == 'p'){
            System.out.println("You Lost!.Bcz rock is hidden below the paper");
        }
        else {
            System.out.println("Match Tied");
        }

        System.out.println("you choose "+you+" computer choose "+comp);


    }
}
