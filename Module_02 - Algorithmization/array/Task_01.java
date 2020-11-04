package by.jonline.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task_01 {
    public static void main(String[] args) {

        int n;
        int k;
        int sum;

        do {
            n = enterFromConsole("Введите количество элементов массива А >> ");
            k = enterFromConsole("Введите делитель K >> ");
        } while ((n | k) <= 0);

        int[] arrayA = new int[n];
        initArray(arrayA);

        System.out.println("Сформированный массив: " + Arrays.toString(arrayA));

        sum = sumOfElements(arrayA, k);
        System.out.println("Сумма элементов массива, которые кратны " + k + " равна " + sum);

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

    public static void initArray(int[] array) {

        if (array == null) {
            return;
        }

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(77);
        }
    }

    public static int sumOfElements(int[] array, int k) {
        int sum;
        sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }

        }

        return sum;
    }

}
