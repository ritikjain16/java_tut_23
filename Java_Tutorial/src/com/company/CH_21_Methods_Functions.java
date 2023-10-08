package com.company;

public class CH_21_Methods_Functions {

//    Methods used for DRY (Do not repeat yourself).

    static  int sum(int a,int b){   // a and b are parameters and it is int type which always returns a value.

        return  a+b;

    }


    // making a void method which do not returns anything.
    static void greet(){
        System.out.println("Good Morning Sir!");
    }






    static void change(int a){
        a=59;              // do not change the value in main method bcz (Call by value).
    }


    static void change2(int [] a){
        a[0]=56;
    }






//      main method
    public static void main(String[] args) {

       int c=sum(3,4);   // calling a method , 3 and 4 are arguments
        System.out.println(c);

        greet();


        // or we can make an object of class
        CH_21_Methods_Functions obj = new CH_21_Methods_Functions();
        int c1 = obj.sum(5,6);
        System.out.println(c1);



        // try for changing a value
        int x=45;
        change(x);
        System.out.println(x);


//        value changes when its reference is passed
        int [] marks = {100,98,95,95,84};
         change2(marks);     // in arrays reference is passed.
        System.out.println(marks[0]);







    }
}
