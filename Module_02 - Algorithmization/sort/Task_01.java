package by.jonline.sort;

// Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один  массив,  включив  второй  массив  между k-м  и  (k+1) -м  элементами  первого,
// при  этом  не  используя дополнительный массив.

import java.util.Random;
import java.util.Scanner;

public class Task_01 {

    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        int[] array3;
        int k;
        int m;
        int n;

        m = enterFromConsole("Введите размер первого массива >>");
        n = enterFromConsole("Введите размер второго массива >>");
        k = enterFromConsole("Введите № позиции вставки второго массива в первый >>");
        System.out.println();


        array1 = new int[m];
        array2 = new int[n];
        array3 = new int[m + n];

        initArray(array1);
        System.out.print("Массив №1 : ");
        printArray(array1);
        System.out.println();

        initArray(array2);
        System.out.print("Массив №2 : ");
        printArray(array2);
        System.out.println();

        System.out.println("Результат вставки массива №2 в " + k + " позицию  массива №1  : ");
        array3 = insert(array1, array2, k);
        printArray(array3);
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

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static int[] insert(int[] array1, int[] array2, int k) {

        int[] array;

        array = new int[array1.length + array2.length];

        for (int n = 0; n < array.length; ) {

            for (int i = 0; i < array1.length; i++) {

                if (i == k) {
                    for (int j = 0; j < array2.length; j++) {
                        array[n] = array2[j];
                        n++;
                    }
                }

                array[n] = array1[i];
                n++;

            }
        }
        return array;
    }


}

