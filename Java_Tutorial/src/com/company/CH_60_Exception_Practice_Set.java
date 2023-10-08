package com.company;

import java.util.Scanner;

class MaxRetriesException extends Exception{
    @Override
    public String toString() {
        return "Maximum Retries Reached.";
    }

    @Override
    public String getMessage() {
        return "Maximum Retries Reached.";
    }
}
public class CH_60_Exception_Practice_Set {
    public static void main(String[] args) throws MaxRetriesException {
//        Q1
//        int a = 9 // Syntax Error

       // int age = 16;
        // int year_born = 2000-16;  // Logical Error

        //int d = 6/0;  // Runtime Error





        // Q2
//        try{
//            int a= 666/0;
//
//        }catch (IllegalArgumentException e){
//            System.out.println("Hehe");
//        }
//        catch (ArithmeticException e){
//            System.out.println("Haha");
//        }





        // Q3
//        boolean flag = true;
//        int[] marks = new int[3];
//        marks[0]=23;
//        marks[1]=56;
//        marks[2]=98;
//        Scanner sc = new Scanner(System.in);
//        int index;
//        int i=0;
//        while (flag && i<5){
//            try{
//                System.out.println("Enter the value of index");
//                index = sc.nextInt();
//                System.out.println("value is "+marks[index]);
//                break;
//            }catch (Exception e){
//                System.out.println("Invalid index");
//                i++;
//            }
//        }
//        if(i>=5){
//            System.out.println("Error");
//        }




        // Q4
//        boolean flag = true;
//        int[] marks = new int[3];
//        marks[0]=23;
//        marks[1]=56;
//        marks[2]=98;
//        Scanner sc = new Scanner(System.in);
//        int index;
//        int i=0;
//        while (flag && i<5){
//            try{
//                System.out.println("Enter the value of index");
//                index = sc.nextInt();
//                System.out.println("value is "+marks[index]);
//                break;
//            }catch (Exception e){
//                System.out.println("Invalid index");
//                i++;
//            }
//        }
//        if(i>=5){
//            System.out.println("Error");
//            MaxRetriesException maxRetriesException = new MaxRetriesException();
//            System.out.println(maxRetriesException.getMessage());
//            throw new MaxRetriesException();
//        }


        MyException();

    }



    // Q5
    public static void MyException() throws MaxRetriesException{
        boolean flag = true;
        int[] marks = new int[3];
        marks[0]=23;
        marks[1]=56;
        marks[2]=98;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while (flag && i<5){
            try{
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("value is "+marks[index]);
                break;
            }catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
            MaxRetriesException maxRetriesException = new MaxRetriesException();
            System.out.println(maxRetriesException.getMessage());
            throw new MaxRetriesException();
        }
    }

}
