package com.company;

class Cylinder {
    private int radius;
    private int height;

    // constructor
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    //    generate getters and setters by (alt+insert).
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }

}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        length=4;
        breadth=5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class Sphere{
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea(){
        return  4*Math.PI*radius*radius;
    }
    public double volume(){
        return (4*Math.PI*radius*radius*radius)/3;
    }
}


public class CH_31_Practice_set_constructors_AccessModifier {
    public static void main(String[] args) {
        // Problem 1
//        Cylinder c=new Cylinder();
//        Cylinder c=new Cylinder(9,12);
//        //c.setHeight(12);
//        System.out.println(c.getHeight());
//        //c.setRadius(9);
//        System.out.println(c.getRadius());
//


//        //Problem 2
//        System.out.println(c.surfaceArea());
//        System.out.println(c.volume());



//        Problem 4
//      Rectangle r = new Rectangle();
//        Rectangle r = new Rectangle(9,8);
//        System.out.println(r.getLength());
//        System.out.println(r.getBreadth());



//        Problem 5
        Sphere s = new Sphere(8);
        //s.setRadius(5);
        System.out.println(s.getRadius());
        System.out.println(s.surfaceArea());
        System.out.println(s.volume());



    }
}
