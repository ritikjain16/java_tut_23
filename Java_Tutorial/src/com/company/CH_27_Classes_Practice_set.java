package com.company;

//class Employee{}      not make same class in same package.
class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name=n;
    }

}




class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class circle{
    int radius;
    public float area(){
        return 3.14f*radius*radius;
    }
    public float perimeter(){
        return 2*3.14f*radius;
    }
}


public class CH_27_Classes_Practice_set {
    public static void main(String[] args) {

        //Problem 1
//        Employee1 e1=new Employee1();
//        e1.salary=5000;
//        System.out.println(e1.getSalary());
//
//        e1.setName("Ritik");
//        System.out.println(e1.getName());



        //Problem 3
//        square s1 =new square();
//        s1.side=5;
//        System.out.println(s1.area());
//        System.out.println(s1.perimeter());


        //Problem 4
        circle c1=new circle();
        c1.radius=5;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());

    }
}
