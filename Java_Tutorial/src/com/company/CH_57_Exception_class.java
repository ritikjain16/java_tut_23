package com.company;

// we can make our own exceptions by extending Exception class..

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
//        return super.toString() + " I am toString() function.";

//        return " I am toString() function.";

        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
//        return super.getMessage() + " I am getMessage() function.";

//        return " I am getMessage() function.";

        return "Make sure that the value of age entered is correct.";
    }
}

public class CH_57_Exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no.");
        a = sc.nextInt();

        if(a<9){
            try{
//                throw new MyException();
                throw new ArithmeticException("This is an exception.");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e); // by default --> toString()
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished.");
        }
    }
}
