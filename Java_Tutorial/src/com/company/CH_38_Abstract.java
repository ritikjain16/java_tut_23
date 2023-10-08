package com.company;

// abstract means --> existing in thought or as an idea without concrete existence.

// * if a class having an abstract method then the class should be also abstract.
// * all abstract methods should be declared in subclass.
// * reference of abstract class can be created but object cannot be created.

abstract class Parent2{
    public Parent2(){
        System.out.println("Parent 2 Constructor");
    }

    abstract public void greet();
    abstract public void hello();
}

// all abstract methods should be declared in subclass which inherits super class.

class Child1 extends Parent2{

    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void hello(){
        System.out.println("Hello");
    }

    public Child1(){
        System.out.println("Child 1 Constructor");
    }

}

// abstract class Child2 extends Parent2{
//
//    @Override
//    public void greet(){
//        System.out.println("Good Morning");
//    }
////    @Override
////    public void hello(){
////        System.out.println("Hello");
////    }
//
//    public Child2(){
//        System.out.println("Child 2 Constructor");
//    }
//
//}

// if an abstract subclass inherits an abstract superclass, then subclass reference can be created
// but object cannot be created.


public class CH_38_Abstract {
    public static void main(String[] args) {

       // Parent2 p = new Parent2();  // -- wrong

//        Parent2 p = new Child1();  // Dynamic
//        p.greet();
//        p.hello();

        Child1 c = new Child1();
        c.greet();
        c.hello();


    }
}
