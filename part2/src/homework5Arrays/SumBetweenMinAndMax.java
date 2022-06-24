package homework5Arrays;

/**
 * Определите сумму элементов одномерного массива, расположенных между
 * минимальным и максимальным значениями.
 */
public class SumBetweenMinAndMax {
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
        int sum=0;
        if (numberMax>numberMin) {
            for (int r=numberMin+1; r<numberMax;r++){
                sum=sum+array[r];
            }
        }
        System.out.println("The sum of the elements of array located between the minimum and maximum values = "+sum);
    }
}
