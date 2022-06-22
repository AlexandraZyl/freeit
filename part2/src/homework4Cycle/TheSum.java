package homework4Cycle;

import java.util.Scanner;

/**
 * Найдите сумму первых n целых чисел, которые делятся на 3
 */
public class TheSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 'n' ");
        int n=in.nextInt();
        int i=1;
        int sum=0;
        int j=1;
            while (i <= n) {
                if (j % 3 == 0) {
                    sum = sum + j;
                    i++;
                }
                j++;
            }
            System.out.println("The sum of the first n-numbers is " + sum);
    }
}
