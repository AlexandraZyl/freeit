package com.zyl.homework3;

/**
 * Имеется целове число (задать с помощью Random rand = new Random(); int x =
 * rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
 * нему слово «рублей» в правильном падеже.
 */
import java.util.*;
public class NumberWithRandom {
    public static void main(String[] args) {
        Random money = new Random();
        int rmoney = money.nextInt(1000);
        System.out.println("The Randomly generated integer is : " + rmoney);
        int m=rmoney%10;
        if ((rmoney%100>=11) && (rmoney%100<=14)) {
           System.out.println(rmoney+ " рублей");
        } else {
            switch (m) {
                case 1:
                    System.out.println(rmoney+ " рубль");
                    break;
                case 2:
                    System.out.println(rmoney+ " рубля");
                    break;
                case 3:
                    System.out.println(rmoney+ " рубля");
                    break;
                case 4:
                    System.out.println(rmoney+ " рубля");
                    break;
                default:
                    System.out.println(rmoney+ " рублей");
           }
       }

    }
}
