package homework4Cycle;

/**
 * Надо получить ряд случайных чисел, и посчитать произведение чисел данного ряда, а также
 * поделить на количество чисел в данном ряду. Ввод чисел прекращается,
 * если очередным числом будет ноль.
 */
public class FactorialOfaNumber {
    public static void main(String[] args) {
        float averageMul = 0;
        float multiply = 1;
        int n = 0;
        int x = (int)(Math.random() * 20);
        while(x != 0) {
            multiply=multiply * x;
            n ++;
            x = (int)(Math.random()*20);
        }
        if(n != 0){
            averageMul = multiply / n;
        } else {
            averageMul = 0;
        }
        System.out.println("The product of numbers is " + multiply);
        System.out.println("Division results are " + averageMul);
        System.out.println(n);
    }
}
