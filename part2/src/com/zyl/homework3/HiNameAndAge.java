package com.zyl.homework3;
/**Написать программу, которая приветствует пользователя
 * в зависимости от его пола и возраста (имя, пол и возраст
 * задаются при старте программы)
 */
import java.util.Scanner;
public class HiNameAndAge {
    public static void main(String[] args) {
        String f="female";
        String m="male";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name=in.nextLine();
        System.out.println("Enter your gender: male or female");
        String gender=in.nextLine();
        System.out.println("Enter your age");
        int age=in.nextInt();

        if (age<18) {
            System.out.println("Hello," + name + "! You are too young!");
        } else if ((age>=18) & (gender.equals (m))) {
            System.out.println("Hello," + name + "! Would you like a glass of beer!");
        } else if ((age>=18) & (gender.equals (f))){
                System.out.println("Hello," + name + "! Would you like a glass of champagne!");
            } else {
                System.out.println("Hello," + name + "! Would you like a glass of water!");
            }

    }
}
