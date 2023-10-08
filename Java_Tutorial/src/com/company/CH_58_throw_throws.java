package com.company;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "radius cannot be negative";
    }
}

public class CH_58_throw_throws {

    public static  int divide(int a,int b) throws ArithmeticException{
//        Made by Ritik
        return a/b;
    }

    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        return Math.PI * r * r;
    }

                        public static void main(String[] args) {
                    //        Pragati uses divide function
                                try{

                    //                int c = divide(6,0);
                                    double c = area(-6);
                                    System.out.println(c);
                                }
                                catch (Exception e){
                                    System.out.println("Exception");
                                    System.out.println(e.getMessage());
                                }
                        }
}
