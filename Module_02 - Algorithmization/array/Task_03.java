package by.jonline.array;

//Дан  массив  действительных  чисел,  размерность  которого N.
// Подсчитать,  сколько  в  нем  отрицательных, положительных и нулевых элементов.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {

        int n;

        int[] arrayA;
        int[] arrayB;


        n = enterFromConsole("Введите количество элементов массива действительных чисел >> ");

        arrayA = new int[n];
        initArray(arrayA, -33, 77);

        System.out.println("Сформированнаяа последовательность: " + Arrays.toString(arrayA));

        arrayB = counting(arrayA);

        System.out.println("Количество отрицательных элементов массива = " + arrayB[0]);
        System.out.println("Количество положительных элементов массива = " + arrayB[2]);
        System.out.println("Количество нулевых элементов массива = " + arrayB[1]);

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


    public static int[] counting(int[] array) {

        int[] arr = new int[3];
        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {

                arr[0] = arr[0] + 1;

            } else if (array[i] == 0) {

                arr[1] = arr[1] + 1;

            } else {

                arr[2] = arr[2] + 1;

            }

        }

        return arr;
    }

}
