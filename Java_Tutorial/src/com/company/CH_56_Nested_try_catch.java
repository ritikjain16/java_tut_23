package com.company;

import java.util.Scanner;

public class CH_56_Nested_try_catch {
    public static void main(String[] args) {

        int [] students = new int[3];
        students[0]=56;
        students[1]=69;
        students[2]=32;

        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.println("Enter the index of array");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to my class...");
                try {
                    System.out.println(students[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist.");
                    System.out.println("Exception in level 2");
                }
            }
            catch (Exception e){
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for taking my class.");
    }
}
