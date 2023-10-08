package com.company;
interface  Bicycle{
    int speed=8;
    void applyBrakes(int decrement);
    void  speedUp(int increment);
    // we can use properties in interface and methods without implementing them in interface.
}

// class cannot extends more than one class but class can implements more than one interface.
interface HornBicycle{
    void peepee();
    void popo();
}

class  AvonCycle implements Bicycle,HornBicycle {
    //    all methods of interface should be declared public.
    public void applyBrakes(int decrement){
        System.out.println("Applying Brakes");
    }
    public void speedUp(int increment){
        System.out.println("Speed Up");
    }
    // other methods of class
    void blowHorn(){
        System.out.println("Pee Pee");
    }

    public void peepee(){
        System.out.println("Pee Pee");
    }
    public void popo(){
        System.out.println("Po Po");
    }
}


public class CH_40_Interface {
    public static void main(String[] args) {
        AvonCycle a = new AvonCycle();
        a.applyBrakes(1);
        a.speedUp(2);
        System.out.println(a.speed); // we cannot change the value of properties of interface bcz they are final.
        a.blowHorn();

//        a.speed = 89;  wrong

        a.peepee();
        a.popo();
    }
}
