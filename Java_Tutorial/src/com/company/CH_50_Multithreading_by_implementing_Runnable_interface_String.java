package com.company;

class MyRunThr implements Runnable{

    MyRunThr(String name){
       super();
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread");
        }
    }
}


public class CH_50_Multithreading_by_implementing_Runnable_interface_String {
    public static void main(String[] args) {
        MyRunThr bullet1 = new MyRunThr("Ritik");
        Thread gun1 = new Thread(bullet1);

//        gun1.start();

        System.out.println("id is "+gun1.getId());
        System.out.println("name is "+gun1.getName());

    }
}
