package com.company;

public class CH_18_Arrays {
    public static void main(String[] args) {
        int [] marks = {100,98,95,95,84};
        System.out.println(marks.length);

//        Traversing an array
//        for (int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }




//        Traversing an array in reverse order
//        for (int i=marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//        }




        //        Traversing an array by for-each loop
        for(int element:marks){
            System.out.println(element);
        }


    }
}

