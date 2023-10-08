package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class TataSky {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> s = new ArrayList<>();
        int a = 1;
        s.add("9XM");
        s.add("BalleBalle");
        s.add("StarSports1Hindi");
        s.add("SonyMax");
        s.add("9XTashan");
        s.add("Zoom");

            while (a == 1) {
                System.out.println("****************Welcome to Tata Sky****************" +
                        "\n1. See Your Pack" +
                        "\n2. Add a Channel" +
                        "\n3. Drop a Channel" +
                        "\n4. Clear Your Pack" +
                        "\n5. Exit");
                System.out.println("Enter your Choice:");
                int ch = sc.nextInt();

                if (ch == 1) {
                    System.out.println(s);
                }
                else if (ch == 2) {
                    System.out.println("Enter the name of the channel which you want to add:(Do not add Space)");
                    String s1 = sc.next();
                    if(s.contains(s1)){
                        System.out.println("You have already subscribed "+s1+" channel.");
                    }
                    else{
                        s.add(s1);
                        System.out.println("Yor request to add ''" + s1 + "'' channel is successfully placed.");
                    }
                }
                else if (ch == 3) {
                    System.out.println("Enter the name of the channel which you want to drop:(Do not add Space)");
                    String s1 = sc.next();
                    if(s.contains(s1)){
                        s.remove(s1);
                        System.out.println("Yor request to drop " + s1 + " channel is successfully placed.");
                    }
                    else{
                        System.out.println("Yor have not subscribed to "+s1+" channel.");
                    }
                }
                else if(ch==4){
                    s.removeAll(s);
                    System.out.println("Your Request to drop all channels is placed successfully.");
                }
                else if (ch == 5) {
                    System.out.println("Thanks for using Tata Sky Program!");
                    a++;
                }
                else{
                    System.out.println("Please choose correct Choice");
                }
            }

    }
}
