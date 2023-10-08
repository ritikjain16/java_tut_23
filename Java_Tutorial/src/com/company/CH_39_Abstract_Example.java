package com.company;

abstract class Shape{
    Shape(){
        System.out.println("Shape Constructor");
    }
    abstract public void shapeee();
}

class Rectangle1 extends Shape{
    @Override
    public void shapeee(){
        System.out.println("I am rectangle");
    }
}
class Circle1 extends Shape{
    @Override
    public void shapeee(){
        System.out.println("I am circle");
    }
}
class Square1 extends Shape{
    @Override
    public void shapeee(){
        System.out.println("I am square");
    }
}
public class CH_39_Abstract_Example {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1();
        r.shapeee();

        Circle1 c =new Circle1();
        c.shapeee();

        Square1 s = new Square1();
        s.shapeee();

        //--------------------------------------------------------------------

        Shape s1 = new Rectangle1();
        s1.shapeee();

        Shape s2 = new Circle1();
        s2.shapeee();

        Shape s3 = new Square1();
        s3.shapeee();

    }
}
