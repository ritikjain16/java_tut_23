package com.company;

public class CH_08_Increment_Decrement {
    public static void main(String[] args) {

//        FOR INCREMENT
//        if prefix comes in last then solve right to left.
//        if postfix comes in last then solve left to right.

//        FOR DECREMENT always left to right.



//        int x = 3;
//        int y = ++x + x++; // left to right
//        // = 4 + 4 (5)
//        System.out.println(y);
//
//
//        int z = x++ + ++x; // right to left
//        // = 6 (7) + 6
//        System.out.println(z);
//
//
//        int a = ++z + ++y + x++;
//        // = 13 + 9 + 7 (8) // left to right.
//        System.out.println(a);
//
//
//
//        int b = x++ + ++x + ++x + ++a + x++ + ++x;
//        // = 12(13)+12+11+30+9(10)+9 = 83. // right to left.
//        System.out.println(b);
//
//        int c = x++ + ++x + ++x + a++ + x++ + x++;
//        // = 13(14) + 15 + 16 + 30(31) + 16(17) + 17(18) = 107. // left to right.
//        System.out.println(c);
//
//
//        int d = x++ + ++y + ++z + x++ + a++ + x++ + b++ + ++c + ++x;
//        // =  21(22)+10+14+20(21)+31(32)+19(20)+83(84)+108+19=325.// right to left.
//        System.out.println(d);
//

        int x =100;
        int y = --x - x-- - x--;
        // = 99 - 99(98) - 98(97) = -98. // left to right.
        System.out.println(y);

        int z =100;
        int v = z-- - --z - --z;
        // =98(97)-98-99=-99. // right to left.-----------> WRONG
        // 100(99)-98 - 97 = -95. // left to right.
        System.out.println(v);

        int l = v-- - --v - --v;
        // = -95(-96) - -97 - -98 = -95 + 97 + 98 =100.
        System.out.println(l);

    }
}
