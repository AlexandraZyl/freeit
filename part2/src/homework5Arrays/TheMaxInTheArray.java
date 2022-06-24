package homework5Arrays;

import java.util.Random;

/**
 * Создать последовательность случайных чисел, найти и вывести наибольшее
 * из них.
 */
import java.util.*;

public class TheMaxInTheArray {
    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 31));
            System.out.print(array[i]+" ");
        }

        int max=0;
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array [i] > max){
                max=array[i];
            }
        }
        System.out.println(max);
    }

}
