package com.company;

class My1Employee{
    private int id;
    private String name;
    private int salary;

//    Now we use constructors bcz we not want to use getters and setters again and again
//    Make constructor by making a method inside a class with same class name.
//    constructor not returns anything.

    public My1Employee(){
        id=21;               // default value
        name="Pragati";      // default value
        salary=1000;         // default value
    }

//    we can give arguments also in constructor.
    public My1Employee(int id1,String name1){
        id=id1;
        name=name1;
    }

//    constructor overloading
    public My1Employee(int salary1){
        salary=salary1;
    }
//---------------------------------------

    public int getId(){
        return id;
    }
    public void setId(int id2){
        id=id2;
    }

    public String getName(){
        return name;
    }
    public void setName(String name2){
        name=name2;
    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary2){
        id=salary2;
    }
}
public class CH_29_Constructors {
    public static void main(String[] args) {

        My1Employee e1 = new My1Employee(5000);

//        "only make an object and use get".

//        e1.setId(16);
//        e1.setName("Ritik");

//        we use only get in constructors not set.

        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}
