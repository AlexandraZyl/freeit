package homework5Arrays;

/**
 * Создать массив оценок произвольной длины, вывести максимальную и
 * минимальную оценку, её (их) номера.
 */
public class MaxMinMarks {
    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 31));
            System.out.print(array[i]+" ");
        }
        System.out.println();

        int max=0;
        int numberMax=0;
        for (int i = 0; i < array.length; i++) {
            if (array [i] > max){
                max=array[i];
                numberMax=i;
            }
        }
        int min=max;
        int numberMin=0;
        for (int i = 0; i < array.length; i++) {
            if (array [i] <min){
                min=array[i];
                numberMin=i;
            }
        }

        System.out.println("Max mark= "+max+". Her number in array is "+numberMax);
        System.out.println("Min mark= "+min+". Her number in array is "+numberMin);

    }


}
