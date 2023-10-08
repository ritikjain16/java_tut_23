package com.company;

class MyThr extends Thread{
    MyThr(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread");
        }
    }

}


public class CH_49_Multithreading_by_extending_thread_class_String {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Ritik");
        MyThr t2 = new MyThr("Pragati");

//        t1.start();
//        t2.start();

        System.out.println("id is "+t1.getId());
        System.out.println("id is "+t2.getId());

        System.out.println("name is "+t1.getName());
        System.out.println("name is "+t2.getName());


    }
}
