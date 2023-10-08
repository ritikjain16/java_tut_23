package com.company;

public class CH_23_VarArgs {

//    static  int sum(int a,int b){
//        return a+b;
//    }


//    static int sum(int ...arr){
//        int sum=0;
//        for (int a:arr){
//            sum +=a;
//        }
//        return sum;
//    }

    static int sum(int x,int ...arr){
        int sum=x;
        for (int a:arr){
            sum +=a;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println("The sum of 3,5 is "+ sum(3,5));
//        but if we want to add 3 or more no. , we do not make methods again and again , we make a universal method. (int ...arr)

        System.out.println("The sum of 4,5,9 is " + sum(4,5,9));

//        if we want to make one argument compulsory then (int a,int ...arr)

        System.out.println("The sum of 1,2,3,4,5 is "+sum(1,2,3,4,5));
    }
}
