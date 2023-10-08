package com.company;

import java.util.Scanner;

public class CH_10_Strings {
    public static void main(String[] args) {
        String a = new String("Ritik Jain");
        System.out.println(a);

        // OR

        String b = "Ritik Bhai";
        System.out.println(b);

        // we can also use c language printf
        int c = 3;
        float d = 42.365f;
        System.out.printf("%d and %f",c,d);
        System.out.printf("%d and %8.2f",c,d);
        System.out.format("%d and %8.2f",c,d); // also we can use format

        System.out.println("\nEnter the string");
        Scanner s = new Scanner(System.in);
//        String e = s.next();  //only prints one word
        String e = s.nextLine(); // prints full string
        System.out.println(e);

    }
}
