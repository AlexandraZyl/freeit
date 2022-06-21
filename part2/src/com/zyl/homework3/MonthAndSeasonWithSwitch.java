package com.zyl.homework3;

import java.util.Scanner;

public class MonthAndSeasonWithSwitch {
    /**
     * Написать программу, в которой в консоль будет выводится название месяца и сезон,
     * к которму этот месяц относится (написать с помощью switch)
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of month");
        int month=in.nextInt();
        System.out.println(month);
        switch (month) {
            case 1: System.out.println("January related to the season - winter");     break;
            case 2:  System.out.println("February related to the season - winter");    break;
            case 3:  System.out.println("March related to the season - spring");       break;
            case 4:  System.out.println("April related to the season - spring");       break;
            case 5:  System.out.println("May related to the season - spring");         break;
            case 6:  System.out.println("June related to the season - summer");        break;
            case 7:  System.out.println("July related to the season - summer");        break;
            case 8:  System.out.println("August related to the season - summer");      break;
            case 9:  System.out.println("September related to the season - autumn");   break;
            case 10:  System.out.println("October related to the season - autumn");     break;
            case 11: System.out.println("November related to the season - autumn");    break;
            case 12: System.out.println("December related to the season - winter");    break;
            default: System.out.println(" - This is not a month!");   break;
        }
    }
}
