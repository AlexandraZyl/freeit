package com.zyl.homework3;

import java.util.Scanner;

/**
 * Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
 * полностью закрыть круглой картонкой радиусом r.
 */
public class RectangleAndCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side a ");
        int a=in.nextInt();
        System.out.println("Enter side b ");
        int b=in.nextInt();
        System.out.println("Enter the radius of the circle ");
        int r=in.nextInt();

        if (2 * r >= Math.sqrt(a*a + b*b))
            System.out.println("A circle with a radius of "+ r + " covers a rectangle with sides " + a + " and " +b);
        else
            System.out.println("A circle with a radius of "+ r + " doesn't cover a rectangle with sides " + a + " and " +b);

    }
}
