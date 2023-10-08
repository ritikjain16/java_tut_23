package com.company;


//public  class Employee
//cannot make a public class(public class is only one in one program)

class Employee{
    int id;
    String name;
    public void printDetails(){    // not make static(Non-static field 'name' cannot be referenced from a static context)
        System.out.println("Employee name is "+ name +" and id is "+id);
    }
    public int getSalary(int salary){
        return salary;
    }
}
public class CH_26_Class_Making {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.id=16;
        e1.name="Ritik";
        e1.printDetails();
        System.out.println(e1.name +"'s Salary is "+ e1.getSalary(5000));

        e2.id=21;
        e2.name="Pragati";
        e2.printDetails();
        System.out.println(e2.name +"'s Salary is "+ e2.getSalary(4000));



    }
}
