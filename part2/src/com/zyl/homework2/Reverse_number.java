package com.zyl.homework2;

/**
 * Определить число, полученное выписыванием в обратном порядке цифр
 * любого 4-х значного натурального числа n.
 */
public class Reverse_number {
    public static void main(String[] args) {
        int s = 5674;
        System.out.println("Your number is" + s);
        if (s >= 1111 & s <= 9999) {
            int s1 = s % 10;
            int s2 = (s / 10) % 10;
            int s3 = (s / 100) % 10;
            int s4 = (s / 1000) % 10;
            System.out.println("Your reverse number is = " + s1 + s2 + s3 + s4);
        } else {
            System.out.println("Your number is not four digits");
        }
    }
}