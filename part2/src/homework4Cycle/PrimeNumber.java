package homework4Cycle;

import java.util.Scanner;
/**
 * Имеется целое число, определить является ли это число простым, т.е.
 * делится без остатка только на 1 и себя.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number=in.nextInt();
            boolean f = true;
            int i;
            if (number>=1) {
                 for(i=2; i<number ;i++)  {
                    if (number%i==0) {
                        f = false;
                        break;
                     }
                 }
                if (f) {System.out.println("Number "+ number + " is prime");
                } else {System.out.println("Number "+ number + " is composite");
                    }
            } else {
                System.out.println("Non-integer or negative number!");
            }
    }
}
