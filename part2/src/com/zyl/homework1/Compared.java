package com.zyl.homework1;

/**
 * Написать программу, результатом работы которой будет
 * вывод результата сравнения двух введенных чисел.
 */
public class Compared {
    public static void main(String[] args) {
        int x=3;
        int s=5;
        if (x>s) {
            System.out.println("x the bigger!");
        } else if (x<s) {
            System.out.println("y the bigger!");
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
