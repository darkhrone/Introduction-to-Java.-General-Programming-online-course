package by.jonline.sort;

import java.util.Random;

//Сортировка выбором.Дана последовательность чисел a1<=a2<=...<=an.
// Требуется переставить элементы так, чтобы они были расположены по убыванию.
// Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место,
// а первый -на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
// Написать алгоритм сортировки выбором.

public class Task_03 {
    public static void main(String[] args) {

        int n;
        int[] array;

        Random random = new Random();
        n = 5 + random.nextInt(15);

        array = new int[n];
        System.out.println("Исходная последовательность (возрастающая):");

        initArray(array);
        print(array);

        System.out.println();
        selectionSort(array);


        System.out.println("Итоговая последовательность (убывающая): ");
        print(array);

    }

    public static void initArray(int[] array) {

        if (array == null) {
            return;
        }

        Random random = new Random();

        array[0] = random.nextInt(10);

        for (int i = 1; i < array.length; i++) {

            array[i] = 1 + random.nextInt(10) + array[i - 1];

        }
    }


    public static void selectionSort(int[] array) {

        int min;
        int minId;
        int temp;

        for (int i = 0; i < array.length; i++) {

            min = array[i];
            minId = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] > min) {
                    min = array[j];
                    minId = j;
                }
            }

            temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }


    public static void print(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
