package com.company;

class Circle{
    int radius;

    Circle(){
        System.out.println("I am constructor of circle");
    }

    Circle(int r){
        this.radius=r;
        System.out.println("I am constructor of circle with radius");
    }

//
//    public int getRadius() {
//        return radius;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }

}

class Cylinder1 extends Circle{
    int height;

    Cylinder1(int h,int r){
//        super(r);
        this.height=h;
        System.out.println("I am constructor of cylinder with radius and height.");
    }

    @Override
    public  double area(){
        return 2*Math.PI*this.radius*this.height + 2*Math.PI*this.radius*this.radius;
    }
}

public class CH_37_CH10_Practice_Set {
    public static void main(String[] args) {

        // Problem 1
        Circle c = new Circle(4);
        System.out.println(c.area());

        Cylinder1 d = new Cylinder1(2,5);
        System.out.println(d.area());



        //Problem 4
//        Circle c = new Circle();
//        c.setRadius(4);
//        System.out.println(c.area());


    }
}
