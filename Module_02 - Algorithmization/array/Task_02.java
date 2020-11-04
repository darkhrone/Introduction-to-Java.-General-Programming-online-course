package by.jonline.array;

// Дана последовательность действительных чисел а1,а2 ,..., ап.
// Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {

        int n;
        int z;
        int min;
        int max;

        int[] arrayA;
        int[] arrayB;

        System.out.println("Последовательность будет создана генератором случайных чисел.\n" +
                "Введите параметры последовательности:");

        min = enterFromConsole("Введите минимальное значение интервала >> ");

        max = enterFromConsole("Введите максимальное значение интервала >> ");

        n = enterFromConsole("Введите количество элементов последовательности действительных чисел A[n]>> ");

        z = enterFromConsole("Введите число Z >> ");

        arrayA = new int[n];
        initArray(arrayA, min, max);

        System.out.println("Сформированнаяа последовательность: " + Arrays.toString(arrayA));

        arrayB = swap(arrayA, z);

        System.out.println("Последовательность после замен: " + Arrays.toString(arrayB));

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


    public static int[] swap(int[] array, int k) {

        int count;
        count = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > k) {
                array[i] = k;
                count++;
            }

        }
        System.out.println("Количество произведённых замен равно " + count);
        return array;
    }

}

