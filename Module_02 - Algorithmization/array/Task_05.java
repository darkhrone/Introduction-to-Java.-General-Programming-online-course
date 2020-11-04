package by.jonline.array;

//Даны целые числа а1,а2 ,..., аn. Вывести на печать только те числа, для которых аi> i.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {

        int n;
        int[] array;

        n = enterFromConsole("Введите количество элементов последовательности >>");

        array = new int[n];

        initArray(array);
        System.out.println(Arrays.toString(array));

        printNums(array);

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

            array[i] = random.nextInt(50);

        }

    }


    public static void printNums(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > i) {
                System.out.print(arr[i] + " ");
            }

        }
    }

}
