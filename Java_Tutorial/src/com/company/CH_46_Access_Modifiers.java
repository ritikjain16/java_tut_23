package com.company;

class C1{
    public int w = 5;
    protected int x = 6;
    int y = 7;        // default
    private int z = 8;

    public void meth1(){
        // inside a class we can use all access modifiers.
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

class TableOfAccessModifier{
    void met(){
        System.out.println("Modifiers          class     Package     Subclass     World");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Public               Y          Y            Y           Y");
        System.out.println("Protected            Y          Y            Y           N");
        System.out.println("default(no)          Y          Y            N           N");
        System.out.println("Private              Y          N            N           N");
    }
}

public class CH_46_Access_Modifiers {
    public static void main(String[] args) {

        C1 c = new C1();
        c.meth1();



//        we cannot use private access modifier inside a package.
        System.out.println(c.w);
        System.out.println(c.x);
        System.out.println(c.y);
//        System.out.println(c.z);



        TableOfAccessModifier t = new TableOfAccessModifier();
        t.met();

        // Also see acmod package in visual studio in java.



    }
}
