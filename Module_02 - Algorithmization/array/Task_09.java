package by.jonline.array;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
//Если таких чисел несколько, то определить наименьшее из них.

import java.util.Arrays;
import java.util.Random;

public class Task_09 {
    public static void main(String[] args) {
        int n;
        int[] array;
        int[] mem;

        Random rand = new Random();
        n = rand.nextInt(30);

        array = new int[n];
        initArray(array);
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));

        mem = repNum(array);
        System.out.println(mem[0] + " встречается " + mem[1] + " раз(-a)");
    }

    public static void initArray(int[] array) {

        int min = -2;
        int max = 10;

        if (array == null) {
            return;
        }

        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = min + rnd.nextInt(max - min + 1);

        }

    }


    public static int[] repNum(int[] arr) {

        int count;
        int value_of_max_count;
        int value_of_count;
        int max_count;
        int[] mem = new int[2];

        count = 1;
        max_count = 0;
        value_of_count = arr[0];
        value_of_max_count = arr[0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length - 1; j++) {

                if (arr[i] == arr[j + 1]) {
                    count++;
                }

            }

          //  System.out.println(arr[i] + " встречается " + count + " раз(-a)");

            if (max_count < count) {
                value_of_max_count = arr[i];
                max_count = count;
            }

            if (max_count == count && value_of_max_count > arr[i]) {
                value_of_max_count = arr[i];
            }

            count = 1;
        }

        mem[0] = value_of_max_count;
        mem[1] = max_count;

        return mem;
    }

}
