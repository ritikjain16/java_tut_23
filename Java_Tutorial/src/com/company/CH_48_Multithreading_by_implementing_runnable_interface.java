package com.company;

class MyRunnableThread1 implements Runnable{
    public void run(){
        for(int i=0;i<10000;i++){
            System.out.println("MyRunnableThread1");
        }

    }
}

class MyRunnableThread2 implements Runnable{
    public void run(){
        for(int i=0;i<10000;i++){
            System.out.println("MyRunnableThread2");
        }

    }
}

public class CH_48_Multithreading_by_implementing_runnable_interface {
    public static void main(String[] args) {
        MyRunnableThread1 bullet1 = new MyRunnableThread1();
        Thread gun1 = new Thread(bullet1);

        MyRunnableThread2 bullet2 = new MyRunnableThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

//        Thread t1 = new Thread(new MyRunnableThread1());
//        Thread t2 = new Thread(new MyRunnableThread2());
//
//        t1.start();
//        t2.start();


    }
}
