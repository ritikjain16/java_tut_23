package com.company;

public class CH_54_Try_Catch_Exception {
    public static void main(String[] args) {
        int a = 45;
        int b= 0;
        try {
            int c = a / b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
