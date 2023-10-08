package com.company;

class MyThread1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i < 20000) {
            System.out.println("Thread1");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i < 20000) {
            System.out.println("Thread2");
            i++;
        }
    }
}

public class CH_47_Multithreading_by_extending_thread_class {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

//        both process takes place parallel..
        t1.start();  // by start -- remember
        t2.start();
    }
}
