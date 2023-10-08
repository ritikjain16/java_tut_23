package com.company;

class A{
    public void meth1(){
        System.out.println("Method 1 of class A");
    }

    public void meth2(int a){
        System.out.println("Method 2 of class A");
    }

}
class B extends A{

    @Override
    public void meth1(){
        System.out.println("Method 1 of class B");
    }

//    @Override  //--> if we change method in super class then we can't write @Override in subclass.
    public void meth2(){
        System.out.println("Method 2 of class B");
    }
}
public class CH_34_Method_overriding {
    public static void main(String[] args) {

        A a = new A();
        a.meth1();

        B b = new B();
        b.meth1();
    }
}
