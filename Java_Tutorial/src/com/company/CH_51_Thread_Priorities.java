package com.company;

class MyThr1 extends Thread{
    MyThr1(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while (i<50){
            System.out.println(""+getName());
        }
    }
}

public class CH_51_Thread_Priorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Ritik1 (Most Important)");
        MyThr1 t2 = new MyThr1("Ritik2");
        MyThr1 t3 = new MyThr1("Ritik3");
        MyThr1 t4 = new MyThr1("Ritik4");
        MyThr1 t5 = new MyThr1("Ritik5");

        t1.setPriority(Thread.MAX_PRIORITY);  // this will occur most
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
