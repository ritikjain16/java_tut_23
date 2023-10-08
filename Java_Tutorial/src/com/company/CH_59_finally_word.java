package com.company;

public class CH_59_finally_word {
    public static void greet() {
        int a = 20;
        int b = 10;
        while (true) {
            try {
                //            int a = 5;
                //            int b=0;
                //            int c = a/b;
                //            return  c;

                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                //            this block will execute always...
                System.out.println("This is the end. final b is " + b);
            }
            b--;
        }

        try {
            System.out.println(5 / 0);
        } finally {
            System.out.println("Finall....");
        }


    }

    public static void main(String[] args) {
        greet();

    }
}
