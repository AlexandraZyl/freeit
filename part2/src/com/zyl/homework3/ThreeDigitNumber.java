package com.zyl.homework3;

import java.util.Scanner;

/**
 * Создайте число. Определите, является ли число трехзначным. Определите, является
 * ли его последняя цифра семеркой. Определите, является ли число четным.
 */
public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three-digits number");
        int number = in.nextInt();

        if ((number >= 111) & (number <= 999)) {
            int n1 = number % 10;
            System.out.println("Your reverse number is three-digits!");
            if (n1 == 7) {
                System.out.println("Last digit is 7 and not even");
            } else if (number % 2 == 0) {
                System.out.println("Your number is even!");
            }} else {
                System.out.println("Your number is not three-digits");
            }

    }
}
