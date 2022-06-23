package com.zyl.homework3;

import java.util.Scanner;

/**
 * Написать программу, в которой в консоль будет выводится название месяца и сезон,
 * к которму этот месяц относится (написать с помощью  if  и с помощью switch)
 */
public class MonthAndSeason {
    public static void main(String[] args) {
        String monthwinter1="december";
        String monthwinter2="january";
        String monthwinter3="february";
        String monthspring1="march";
        String monthspring2="april";
        String monthspring3="may";
        String monthsummer1="june";
        String monthsummer2="july";
        String monthsummer3="august";
        String monthautumn1="september";
        String monthautumn2="october";
        String monthautumn3="november";

        Scanner in = new Scanner(System.in);
        System.out.println("Enter month");
        String month=in.nextLine();
        System.out.print(month);
        if (month.equals(monthwinter1)) {
            System.out.print(" related to the season - winter");
        } else if (month.equals (monthwinter2)) {
            System.out.print(" related to the season - winter");
        } else if (month.equals (monthwinter3)) {
            System.out.print(" related to the season - winter");
        } else if (month.equals (monthspring1)) {
            System.out.print(" related to the season - spring");
        } else if (month.equals (monthspring2)) {
            System.out.print(" related to the season - spring");
        } else if (month.equals (monthspring3)) {
            System.out.print(" related to the season - spring");
        } else if (month.equals (monthsummer1)) {
            System.out.print(" related to the season - summer");
        } else if (month.equals (monthsummer2)) {
            System.out.print(" related to the season - summer");
        } else if (month.equals (monthsummer3)) {
            System.out.print(" related to the season - summer");
        } else if (month.equals (monthautumn1)) {
            System.out.print(" related to the season - autumn");
        } else if (month.equals (monthautumn2)) {
            System.out.print(" related to the season - autumn");
        } else if (month.equals (monthautumn3)) {
            System.out.print(" related to the season - autumn");
        }else {
            System.out.print(" - This is not a month!");
        }


    }
}
