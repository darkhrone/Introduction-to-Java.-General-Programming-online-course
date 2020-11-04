package by.jonline.array;

// Задана последовательность N вещественных чисел. Вычислить сумму чисел,
// порядковые номера которых являются простыми числами

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {

        int n;
        int min;
        int max;
        int sum;
        int[] array;

        System.out.println("Последовательность будет создана генератором случайных чисел.\n" +
                "Введите параметры последовательности:");

        min = enterFromConsole("Введите минимальное значение интервала >> ");

        max = enterFromConsole("Введите максимальное значение интервала >> ");

        n = enterFromConsole("Введите количество элементов последовательности вещественных чисел>> ");

        array = new int[n];

        initArray(array, min, max);

        System.out.println("\nСгенерированная последовательность: " + Arrays.toString(array) + "\n");

        sum = sumOfPrimalIndex(array);

        System.out.println("\nСумма всех чисел последовательности, " +
                "порядковый номер которых является простым числом,  равна " + sum);

    }

    public static int enterFromConsole(String s) {

        @SuppressWarnings("resource")

        Scanner sc = new Scanner(System.in);
        int value;
        System.out.print(s);

        while (!sc.hasNextInt()) {

            sc.next();
            System.out.println(s);

        }

        value = sc.nextInt();
        return value;
    }

    public static void initArray(int[] array, int min, int max) {

        if (array == null) {
            return;
        }

        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = min + rnd.nextInt(max - min + 1);

        }


    }

    public static boolean primalNum(int n) {

        boolean isprime;
        isprime = true;

        if (n < 3) {
            isprime = false;
            return isprime;
        }

        for (int i = 2; i <= (int) (n / 2); i++) {

            if ((n % i) == 0) {
                isprime = false;
                break;
            }

        }
        return isprime;
    }

    public static int sumOfPrimalIndex(int[] arr) {

        int sum;
        boolean tmp;

        sum = 0;

        for (int i = 0; i < arr.length; i++) {

            tmp = primalNum(i);

            if (tmp) {
                System.out.println("номер элемента " + i + " значение элемента " + arr[i] + " ");
                sum += arr[i];
            }

        }

        return sum;
    }

}
