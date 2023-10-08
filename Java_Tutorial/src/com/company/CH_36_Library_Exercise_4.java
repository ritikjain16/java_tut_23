package com.company;

import java.util.Scanner;

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books=new String[100];
        this.no_of_books=0;
    }

    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+ " has been added to Library");
    }

    void showAvailableBooks(){
        System.out.println("Available books are:");
        for (String book:this.books) {
            if(book==null){
                continue;
            }
            System.out.println("* "+book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println(book + " has been issued.");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist in Library");
    }




    void returnBook(String book){
        addBook(book);
    }
}

public class CH_36_Library_Exercise_4 {
    public static void main(String[] args) {
        Library l = new Library();
        while (true) {
            System.out.println("Welcome to Central Library:");
            System.out.println("1. Add Book\n2. Issue Book\n3. Show all Books\n4. Return Book");
            System.out.println("Enter your Choice:");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a == 1) {
                System.out.println("Enter the name of the book you want to add:");
                String book = sc.next();
                l.addBook(book);

            }else if (a == 2) {
                System.out.println("Enter the name of the book you want to Issue:");
                String book = sc.next();
                l.issueBook(book);

            }else if (a == 3) {
                l.showAvailableBooks();

            }else if (a == 4) {
                System.out.println("Enter the name of the book you want to return:");
                String book = sc.next();
                l.returnBook(book);

            }
            else{
                System.out.println("Please Choose the correct Choice...");
            }

        }
    }
}
