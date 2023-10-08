package com.company;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class CH_62_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();

                ArrayList<Integer> l2 = new ArrayList<>();
                l2.add(12);
                l2.add(13);
                l2.add(14);

        l1.add(5);
        l1.add(8);
        l1.add(9);

        l1.add(0,56);
        l1.add(0,78);

        l1.add(8);
        l1.addAll(2,l2);

//        l1.clear();

//        System.out.println(l1.contains(56));
//        System.out.println(l1.contains(89));

//        System.out.println(l1.get(0));
//        System.out.println(l1.get(2));

//        System.out.println(l1.indexOf(8));
//        System.out.println(l1.lastIndexOf(8));

//        System.out.println(l2.indexOf(14));

//        System.out.println(l1.isEmpty());
//        l1.clear();
//        System.out.println(l1.isEmpty());

//        l1.remove(2);
//        l1.removeAll(l2);

        l1.set(2,45);
        System.out.println(l1.size());

        System.out.println(l1.subList(2,6));

        for(int e:l1){
            System.out.print(e+", ");
        }

    }
}
