package com.company;

public class CH_11_Strings_Methods {
    public static void main(String[] args) {

//        1.  Length
        String name = "Ritik";
        int value = name.length();
        System.out.println(value);

//        2. to lower case
        System.out.println(name.toLowerCase());

//        3. to upper case
        System.out.println(name.toUpperCase());

//        4. Trim String --> if we use spaces ,then it remove extra spaces.
        String trim = "      Ritik Jain       ";
        System.out.println(trim.trim());

//        5. Substring (begInd)
        System.out.println(name.substring(1));

//        6. Substring (begInd,endInd) --> excludes endInd also
        System.out.println(name.substring(1,4));

//        7. Replace
        System.out.println(name.replace('i','h'));
        System.out.println(name.replace("ik","z"));
        System.out.println(name.replace("i","zlkj"));
        String a = "<|name|> Ritik Jain is a good boy";
        System.out.println(a.replace(" ","_"));
        System.out.println(a.replace("<|name|>","Master"));

//        8. starts With --> returns boolean
        System.out.println(name.startsWith("R"));
        System.out.println(name.startsWith("H"));

//        9. ends With --> returns boolean
        System.out.println(name.endsWith("k")); // case sensitive
        System.out.println(name.endsWith("l"));

//        10. charAt
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(4));

//        11. indexOf
        System.out.println(name.indexOf("i")); // gives 1st appearence
        System.out.println(name.indexOf("i54"));  // if string wrong --> returns -1.
        System.out.println(name.indexOf("ik",2));
        String my = "the string contains  double and   triple spaces";
        System.out.println(my.indexOf("  "));
        System.out.println(my.indexOf("   "));

//        12. lastIndexOf
        String b = "Ritiitikkk";
        System.out.println(b.lastIndexOf("i"));
        System.out.println(b.lastIndexOf("iti"));
        System.out.println(b.lastIndexOf("itilkjui")); // if string wrong --> returns -1.
        System.out.println(b.lastIndexOf("i",5));

//        13. equals
        System.out.println(name.equals("Ritik"));
        System.out.println(name.equals("Riti"));

//        14. equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("ritik"));
        System.out.println(name.equalsIgnoreCase("RiTiK"));

//        15. Special Quotes
        System.out.println("Ritik is a \"good\" boy."); // if we want to print " ".
        System.out.println("Ritik is a \\good\\ boy."); // if we want to print \.
        System.out.println("Ritik is a \ngood boy."); // if we want to print in newline.
        System.out.println("Ritik is a  \tgood boy."); // if we want to print after a tab space.

//        Question: print in letter format
        String letter = "Dear Ritik,\n\tYou are doing a great job.\n\t\tThanks!";
        System.out.println(letter);


    }
}
