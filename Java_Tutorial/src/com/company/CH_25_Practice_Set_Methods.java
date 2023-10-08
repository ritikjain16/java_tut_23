package com.company;

public class CH_25_Practice_Set_Methods {

//    1.
    static void table(int n){
        for (int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }


//    2.
    static void p1(int n){
        for (int i=0;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }

//    3.
//    sum(n)=1+2+....+n-1 +n
//    sum(n)=sum(n-1)+n
    static int sum(int n){
        if (n==1){
            return 1;
        }
        else {
            return n+sum(n-1);
        }
    }


//    4.
  static void p2(int n){
        for (int i=n;i>=0;i--){
            for (int j=i;j>0;j--){
                System.out.printf("*");
            }
            System.out.println();
        }
  }

//  5.
  static int fibonacci(int n) {
    if (n == 1) {
        return 0;
    } else if (n == 2) {
        return 1;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}


//    6.
    static int s1(int ...arr){
        int sum=0;
        for (int a:arr){
            sum+=a;
        }
        return  sum;
    }


//    7.
    static void pr2(int n){
        if(n>0){
            pr1(n - 1);
            for(int i=n;i>0;i--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }


    //    8.
    static void pr1(int n){
        if(n>0){
            pr1(n - 1);
            for(int i=n;i>0;i--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

//   10.
    static int sum1(int a){
        int c= a*(a+1)/2;
        return c;
    }

    public static void main(String[] args) {

//        1.
//        table(5);



//        2.
//        p1(5);


//        3.
//        System.out.println(sum(5));


//        4.
//        p2(4);


//        5.
//        System.out.println(fibonacci(5));     // 0 1 1 2 3 5 8 ...


//        6.
//        System.out.println(s1(1,2,6,7,8));


//        7.



//        8.
//        pr1(5);



//        10.
//        System.out.println(sum1(4));


    }
}
