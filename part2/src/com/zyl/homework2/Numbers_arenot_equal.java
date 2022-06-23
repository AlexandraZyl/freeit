package com.zyl.homework2;

/**
 * Дано любое натуральное 4-х значное число.
 * Верно ли, что все цифры числа различны?
 */
public class Numbers_arenot_equal {
    public static void main(String[] args) {
        int s = 4324;
        if (s >= 1111 & s <= 9999) {
            int s1 = s % 10;
            int s2 = (s / 10) % 10;
            int s3 = (s / 100) % 10;
            int s4 = (s / 1000) % 10;
            boolean t = s1 != s2 && s1 != s3 && s1 != s4 && s2 != s3 && s2 != s4 && s3 != s4;
            if (t) {
                System.out.println("Numbers are not equal. Your number is " + s);
            } else {
                System.out.println("Numbers are equal. Your number is " + s);
            }
        } else {
            System.out.println("Your number is not four digits");
        }
    }

}
