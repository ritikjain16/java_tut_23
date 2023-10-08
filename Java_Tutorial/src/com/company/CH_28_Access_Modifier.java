package com.company;

class MyEmployee{
    private int id;
    private String name;

//    for private properties we use getters and setters
    public int getId(){
        return id;
    }
    public void setId(int ids){
       // this.id=ids; OR
        id=ids;
    }


    public String getName(){
        return name;
    }
    public void setName(String n){
       // this.name=n; OR
        name=n;
    }

}


public class CH_28_Access_Modifier {
    public static void main(String[] args) {
        MyEmployee e1=new MyEmployee();
//        e1.id=16;
//        e1.name="Ritik";

        e1.setId(16);
        System.out.println(e1.getId());

        e1.setName("Ritik");
        System.out.println(e1.getName());


    }
}
