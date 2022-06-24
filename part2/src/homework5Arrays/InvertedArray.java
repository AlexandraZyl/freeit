package homework5Arrays;

/**
 * Создать массив, заполнить его случайными элементами, распечатать,
 * перевернуть, и снова распечатать (при переворачивании нежелательно создавать
 * еще один массив).
 */
public class InvertedArray {
    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 31));
            System.out.print(array[i]+" ");
        }
        System.out.println();

        for (int i = array.length-1; i>=0 ; i--) {
            System.out.print(array[i] + " ");
        }

    }
}
