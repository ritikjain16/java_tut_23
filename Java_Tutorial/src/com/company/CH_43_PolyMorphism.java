package com.company;

interface Camera3{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning...");
    }
//    private method cannot be used in main but can be used in this interface.

    //    default method in interface should have a body.
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4K...");
    }
}

interface wifi3{
    String [] getNetworks();
    void  connectToNetwork(String Network);
}

class MyCellPhone3{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting");
    }
}

class MySmartPhone3 extends MyCellPhone3 implements Camera3,wifi3{

    @Override
    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList={"Ritik","Pragati","Frooti"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String Network) {
        System.out.println("Connecting to "+Network);
    }


    //    overriding default method
//    @Override
//    public void record4KVideo(){
//        System.out.println("Recording 4K in SmartPhone...");
//    }
}


public class CH_43_PolyMorphism {
    public static void main(String[] args) {

//        polymorphism --> using methods/properties of a particular class or interface.

        Camera3 cam1 = new MySmartPhone3();  // "This is a smartphone but, act it as a camera."

//        cannot use other interface methods and also MySmartPhone3 methods.

//        cam1.getNetworks(); // not allowed

//        only Camera3 interface methods.
        cam1.record4KVideo();
        cam1.recordVideo();
        cam1.takeSnap();

        System.out.println();

//        MySmartPhone3 can use all methods
        MySmartPhone3 obj = new MySmartPhone3();
        obj.recordVideo();


    }
}
