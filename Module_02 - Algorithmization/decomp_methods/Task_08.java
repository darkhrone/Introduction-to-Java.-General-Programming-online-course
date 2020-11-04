package by.jonline.decomp_methods;

//Задан массив D. Определить следующие суммы:D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].Пояснение.
// Составить метод(методы)для вычисления суммы трех последовательно расположенных элементов массива с номерами от kдо m.

import java.util.Arrays;
import java.util.Random;

public class Task_08 {
    public static void main(String[] args) {

        int[] arrayD = new int[7];

        initArray(arrayD);
        System.out.println(Arrays.toString(arrayD) + "\n");

        sum(arrayD, 1);
        sum(arrayD, 3);
        sum(arrayD, 4);

    }

    public static int sum(int[] array, int i) {

        int result = 0;
        System.out.print("Sum of ");
        for (int j = i; j < (i + 3); j++) {
            result += array[j];
            System.out.print(array[j] + " ");
        }
        System.out.println(" =  " + result);
        return result;
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

}
