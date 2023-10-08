package com.company;

import java.util.Date;

public class CH_63_Date_and_Time {
    public static void main(String[] args) {
        Date date = new Date();

//        System.out.println(date);
//
//        System.out.println(date.getTime());
//        System.out.println(date.getDate());
//        System.out.println(date.getDay());
//        System.out.println(date.getHours());
//        System.out.println(date.getMonth());
//        System.out.println(date.getSeconds());
//        System.out.println(date.getYear());
//        System.out.println(date.getMinutes());

        System.out.println(System.currentTimeMillis());

        System.out.println(System.currentTimeMillis()/1000);
        System.out.println(System.currentTimeMillis()/1000/60);
        System.out.println(System.currentTimeMillis()/1000/60/60);
        System.out.println(System.currentTimeMillis()/1000/60/60/24);
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
//        System.out.println(System.currentTimeMillis());


    }
}
