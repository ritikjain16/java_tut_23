package com.company;

abstract class Pen{
   abstract void write();
   abstract void refill();
}

class FountainPen extends  Pen{

    @Override
    void write() {
        System.out.println("Writing...");
    }

    @Override
    void refill() {
        System.out.println("Refilling...");
    }

    void changeNib(){
        System.out.println("Changing Nib...");
    }
}
// -----------------------------------------------------------
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}
//---------------------------------------------------------

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{

    @Override
    void ring() {
        System.out.println("Ringing...");
    }

    @Override
    void lift() {
        System.out.println("Lifting...");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnecting...");
    }

    void music(){
        System.out.println("Music...");
    }
}
//---------------------------------------------------------
interface TVRemote{
    void volumeUp();
    void volumeDown();
}

interface SmartTVRemote extends TVRemote{
    void googleAssistant();
    void amazonPrime();
}
class TV implements SmartTVRemote{

    @Override
    public void volumeUp() {
        System.out.println("Volume Up...");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume Down...");
    }

    @Override
    public void googleAssistant() {
        System.out.println("Ok Google...");
    }

    @Override
    public void amazonPrime() {
        System.out.println("Amazon Prime...");
    }
}

public class CH_44_Chapter_11_Practice_Set {
    public static void main(String[] args) {

        // Q1 + Q2
        FountainPen f = new FountainPen();
        f.changeNib();
        f.refill();
        f.write();

        //---------------------------------------------------------

        // Q3 + Q5
       Human h1 = new Human();
       h1.eat();
       h1.sleep();
       h1.jump();
       h1.bite();

       //Polymorphism
       Monkey m1 = new Human();
       m1.bite();
       m1.jump();

       BasicAnimal b1 = new Human();
       b1.eat();
       b1.sleep();

        //---------------------------------------------------------
        // Q4
        SmartTelephone s1 = new SmartTelephone();
        s1.disconnect();
        s1.lift();
        s1.ring();
        s1.music();

        Telephone t1 = new SmartTelephone();
        t1.disconnect();
        t1.lift();
        t1.ring();
        // t1.music(); -- not allowed

        //---------------------------------------------------------

        // Q6 + Q7
        TV t2 = new TV();
        t2.amazonPrime();
        t2.googleAssistant();
        t2.volumeDown();
        t2.volumeUp();

//        Polymorphism
        TVRemote r1 = new TV();
        r1.volumeDown();
        r1.volumeUp();

        SmartTVRemote r2 = new TV();
        r2.amazonPrime();
        r2.googleAssistant();
        r2.volumeDown();
        r2.volumeUp();
    }
}
