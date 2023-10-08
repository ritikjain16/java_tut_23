package com.company;

class Base1{
//    making constructor by making Same name method as class name
    Base1(){
        System.out.println("I am a base class constructor");
    }
    Base1(int a){
        System.out.println("I am a base class constructor "+a);
    }

}
class Derived1 extends  Base1{
    Derived1(){
                System.out.println("I am a Derived class constructor");
    }
    Derived1(int x,int y){
        super(5);   // runs constructor of extending class with argument
        System.out.println("I am an overloaded constructor of derived with value of x , y is :"+x +", "+y);
    }
}
class ChildOFDerived extends  Derived1{
    ChildOFDerived(){
        System.out.println("I am a constructor of child Derived class");
    }
    ChildOFDerived(int x,int y,int z){
        super(4,9);    // runs Derived class constructor with argument
        System.out.println("sum of x and y and z is "+(x+y+z));
    }
}

public class CH_33_Constructors_in_Inheritance {
    public static void main(String[] args) {

//          Base1 b =new Base1();
//          Base1 b1 =new Base1(2);


//          Derived1 d =new Derived1();
//          Derived1 d1 =new Derived1(5,6);

//          ChildOFDerived c = new ChildOFDerived();
//          ChildOFDerived c1 = new ChildOFDerived(4,5,6);



    }
}
