package com.company;

import java.util.Scanner;

public class CH_20_Practice_Set_Array{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


//        1.
//        float [] marks=new float[10];
//        System.out.println("Enter the size of array");
//        float n = s.nextFloat();
//        System.out.println("Enter the marks");
//        for(int i=0;i<n;i++){
//            marks[i] = s.nextFloat();
//        }
//        float sum=0;
//        for(int i=0;i<n;i++){
//            sum = sum + marks[i];
//        }
//        System.out.println("Your total marks sum is : "+ sum);








//        2.
//        int [] marks=new int[10];
//        System.out.println("Enter the size of array");
//        int n = s.nextInt();
//        System.out.println("Enter the array elements");
//        for(int i=0;i<n;i++){
//            marks[i] = s.nextInt();
//        }
//        System.out.println("Enter the value which you want to find.");
//        int value = s.nextInt();
//        boolean isInArray = false;
//        for(int e:marks){
//             if(value==e) {
//                 isInArray = true;
//
//                 break;
//             }
//        }
//        if(isInArray){
//            System.out.println("value is present in array.");
//        }
//        else {
//            System.out.println("value is not present in array.");
//        }





//        3.
//        float [] marks=new float[10];
//        System.out.println("Enter the size of array");
//        float n = s.nextFloat();
//        System.out.println("Enter the marks of all students of physics");
//        for(int i=0;i<n;i++){
//            marks[i] = s.nextFloat();
//        }
//        float sum=0;
//        for(int i=0;i<n;i++){
//            sum = sum + marks[i];
//        }
//        System.out.println("Your total marks average is : "+ sum/n);








//        4.
//        int [][] m1 = new int[10][10];
//        System.out.println("Enter the rows of array");
//        int m = s.nextInt();
//        System.out.println("Enter the columns of array");
//        int n = s.nextInt();
////        array 1
//        System.out.println("Enter the array 1 elements");
//        for(int i=0;i<m;i++) {
//            for (int j = 0; j < n; j++) {
//                m1[i][j] = s.nextInt();
//            }
//        }
//        System.out.println("Array 1 = ");
//        for(int i=0;i<m;i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(m1[i][j]+" ");
//            }
//            System.out.println("");
//        }
//// array 2
//        int [][] m2 = new int[10][10];
//        System.out.println("Enter the array 2 elements");
//        for(int i=0;i<m;i++) {
//            for (int j = 0; j < n; j++) {
//                m2[i][j] = s.nextInt();
//            }
//        }
//        System.out.println("Array 2 = ");
//        for(int i=0;i<m;i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(m2[i][j]+" ");
//            }
//            System.out.println("");
//        }
//        System.out.println("\nArray 3 = \n");
//        int [][] m3 = new int[10][10];
//        for(int i=0;i<m;i++) {
//            for (int j = 0; j < n; j++) {
//                m3[i][j] = m1[i][j] + m2[i][j];
//                System.out.print(m3[i][j]+" ");
//            }
//            System.out.println("");
//        }








//       5.
//        System.out.println("Enter the size of array");
//        int l = s.nextInt();
//
//        int n = Math.floorDiv(l,2);   // gives greatest integer for (l/2)
//
//        int [] a=new int[l];
//        int temp;
//        System.out.println("Enter the array elements");
//        for(int i=0;i<l;i++){
//            a[i] = s.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            // swap a[i] and a[l-1-i] for reversing an array
//            temp= a[i];
//            a[i]=a[l-i-1];
//            a[l-i-1]=temp;
//        }
//        System.out.println("Array in reverse order is :");
//        for(int element:a){
//            System.out.print(element+" ");
//        }








//        System.out.println(Integer.MAX_VALUE);  // = 2147483647
//        System.out.println(Integer.MIN_VALUE);  // = -2147483648


//        6.
//        System.out.println("Enter the size of array");
//        int l = s.nextInt();
//        int [] a=new int[l];
//
//        System.out.println("Enter the array elements");
//        for(int i=0;i<l;i++){
//            a[i] = s.nextInt();
//        }
//        int max=-2147483648;   // give max value -> min value of int
//        for (int e:a){
//            if(e>max){
//                max=e;
//            }
//        }
//        System.out.println("max element is : "+max);







//        7.
//        System.out.println("Enter the size of array");
//        int l = s.nextInt();
//        int [] a=new int[l];
//
//        System.out.println("Enter the array elements");
//        for(int i=0;i<l;i++){
//            a[i] = s.nextInt();
//        }
//        int min=2147483647;  // give min value -> max value of int
//        for (int e:a){
//            if(e<min){
//                min=e;
//            }
//        }
//        System.out.println("min element is : "+min);





//        8.
//        System.out.println("Enter the size of array");
//        int l = s.nextInt();
//        int [] a=new int[l];
//
//        System.out.println("Enter the array elements");
//        for(int i=0;i<l;i++){
//            a[i] = s.nextInt();
//        }
//        boolean isSorted=true;
//
//        for (int i=0;i<l-1;i++){
//            if(a[i]>a[i+1]){
//                isSorted=false;
//                break;
//            }
//        }
//        if(isSorted){
//            System.out.println("Array is sorted");
//        }
//        else {
//            System.out.println("Array is not sorted");
//        }





    }
}
