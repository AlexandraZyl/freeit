package com.zyl.homework3;

import java.util.Scanner;

/**
 * Написать 5 способов создания/получения строки
 */
public class WaysToCreateString {
    public static void main(String[] args) {
        String str1 = "Java"; // способ 1
        System.out.println(str1); //Java

        String str2 = new String(); // способ 2
        System.out.println(str2); //пустая строка

        String str3 = new String(new char[] {'H', 'e', 'l', 'l', 'o'}); // способ 3
        System.out.println(str3); // Hello

        char[] helloArray = { 'H', 'e', 'l', 'l', 'o', '!'}; // способ 4
        String helloString = new String(helloArray);// используя ключевое слово new(массив)
        System.out.println(helloString); //Hello!

        Scanner in = new Scanner(System.in); //способ 5 (Ввод значения строки с клавиатуры)
        System.out.println("Enter your name");
        String name=in.nextLine();
        System.out.println(name);// имя

        String str5 = "Java"; // способ 6 (сколько символов с строке)
        System.out.println("String length "+str5.length()); // 4

        String s = "Я стану отличным программистом!"; // способ 7 (сколько символов с строке)
        int len = s.length();
        System.out.println( "Длина строки: " + len + " символ.");//31





    }
}
