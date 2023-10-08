package com.company;

interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning...");
    }
//    private method cannot be used in main but can be used in this interface.

//    default method in interface should have a body.
    default void record4KVideo(){
//        greet();
        System.out.println("Recording in 4K...");
    }
}

interface wifi{
    String [] getNetworks();
    void  connectToNetwork(String Network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting");
    }
}

class MySmartPhone extends MyCellPhone implements Camera,wifi{

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
    @Override
    public void record4KVideo(){
        System.out.println("Recording 4K in SmartPhone...");
    }
}

public class CH_41_Default_Methods_Interfaces {
    public static void main(String[] args) {
      MySmartPhone ms = new MySmartPhone();
      String[] ar = ms.getNetworks();
        for (String item:ar) {
            System.out.println(item);
        }
        ms.record4KVideo();

    }
}
