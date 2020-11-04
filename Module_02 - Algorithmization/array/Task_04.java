package by.jonline.array;

// Даны действительные числа а1,а2,..., аn. Поменять местами наибольший и наименьший элементы

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {

        int n;
        int[] array;
        int[] sortedArray;

        n = enterFromConsole("Введите количество элементов последовательности >>");

        array = new int[n];

        initArray(array);
        System.out.println(Arrays.toString(array));

        sort(array);
        swap(array);
        System.out.println(Arrays.toString(array));

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

    public static int[] sort(int[] arr) {

        int tmp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;

                }
            }
        }
        return arr;

    }

    public static int[] swap(int[] arr){
        int tmp;

        tmp = arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1] = tmp;

        return arr;
    }

}
