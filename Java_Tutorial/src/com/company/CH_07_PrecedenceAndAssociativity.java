package com.company;

public class CH_07_PrecedenceAndAssociativity {
    public static void main(String[] args) {
        // + and - have same precedence but if occurs same time then solve left to right associativity.
        // * , / and % have same precedence but if occurs same time then solve left to right associativity.
        int a = 6*5-3+4/2;
        /*
        =30-3+2
        =29
         */
        System.out.println(a);

        int b = 9/3-5/3*32*2;
        /*
        =3-1*32*2
        =3-64
        =-61
         */
        System.out.println(b);

        int d = 10%4*5-5*5/5%5;
        /*
        =2*5-5*5/5%5
        =10-25/5%5
        =10-5%5
        =10-0
        =10
         */
        System.out.println(d);

        int c =3;
        int k = (b*b - 4*a*c)/2*a;
        System.out.println(k);



    }
}
