package com.company;

class Q1 extends Thread{
    public void run(){
//        while (true){
//            try {
//                Thread.sleep(200);
//                System.out.println("Good Morning");
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//        }
    }

}
class Q2 extends Thread{
    public void run(){
//        while (true){
//            try {
//                Thread.sleep(200);
//                System.out.println("Welcome");
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//        }
    }

}


public class CH_53_Thread_Practice_Set {
    public static void main(String[] args) {
        Q1 t1 = new Q1();
        Q2 t2 = new Q2();


//        t1.setPriority(6);
//        t2.setPriority(8);
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());

//        System.out.println(t1.getState());
        System.out.println(t2.getState());

//        t1.start();
        t2.start();

//        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
