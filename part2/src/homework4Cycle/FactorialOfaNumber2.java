package homework4Cycle;

import java.util.Scanner;

/**
 * Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */
public class FactorialOfaNumber2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number from 10 to 15 ");
        int number=in.nextInt();
        long fact=1;
        if ((number<10) || (number>15)){
            System.out.println("Enter a number from the condition!");
        } else {
            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + number + " equals " + fact);

        }
    }

}
