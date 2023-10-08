package com.company;

import java.util.Scanner;
class InvalidInput extends Exception{
    @Override
    public String toString() {
        return "Invalid Input";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Max input Exception.";
    }
}


class MaxMultiplierReachedException extends Exception{
    @Override
    public String toString() {
        return "Max Multiplier Reached Exception";
    }
}

public class CH_61_EX_6 {
    public static void main(String[] args) throws InvalidInput,MaxInputException,MaxMultiplierReachedException {
        Scanner sc = new Scanner(System.in);
        int a,b;

        try {
            while (true) {
                System.out.println("Welcome to my calculator...");
                System.out.println("Enter 1st Number");
                a = sc.nextInt();
                System.out.println("Enter 2nd Number");
                b = sc.nextInt();

                if (a >= 100000 || b >= 100000) {
                    throw new MaxInputException();
                }

                String operator;
                System.out.println("Choose the operation which you want to perform..\n1. Addition(+)\n2. Subtraction(-)\n3. Multiplication(*)\n4. Division(/)");
                operator = sc.next();

                if (operator.equals("/")) {
                    if (b == 0) {
                        throw new ArithmeticException();
                    }
                }

                if (operator.equals("*")) {
                    if (a >= 7000 || b >= 7000) {
                        throw new MaxMultiplierReachedException();
                    }
                }

                if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                    switch (operator) {
                        case "+" -> System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
                        case "-" -> System.out.println("Subtraction of " + a + " and " + b + " is " + (a - b));
                        case "*" -> System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
                        case "/" -> System.out.println("Division of " + a + " and " + b + " is " + (a / b));
                    }
                } else {
                    throw new InvalidInput();
                }
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Please try again...!");
        }
    }
}
