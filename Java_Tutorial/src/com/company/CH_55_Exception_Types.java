package com.company;

import java.util.Scanner;

public class CH_55_Exception_Types {
    public static void main(String[] args) {

        int [] students = new int[3];
        students[0]=56;
        students[1]=69;
        students[2]=32;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of array");
        int ind = sc.nextInt();
        System.out.println("Enter the no. you want to divide the value with");
        int number = sc.nextInt();

        try{
            System.out.println("Result is "+ students[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException Occurred!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occurred!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some Error Occurred!");
            System.out.println(e);
        }
    }
}
