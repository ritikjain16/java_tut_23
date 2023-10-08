package com.company;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void printMe(){
        System.out.println("Hello");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class CH_32_Inheritance {
    public static void main(String[] args) {

//        derived can use any property/method of base class as it extends it.
//        but base class cannot use  property/method of derived class.
//        Base class - superClass(Parent Class),
//        Derived class - subClass(Child class).

//        Base Class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());


//      Derived Class
        Derived d = new Derived();
        d.setX(8);
        System.out.println(d.getX());

        d.setY(6);
        System.out.println(d.getY());

        d.printMe();
    }
}
