package by.jonline.sort;

/*
Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=...<=an и b1<=b2<=...<bm.
 Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...<bm
 в первую последовательность так, чтобы новая последовательность оставалась возрастающей.*/

import java.util.Random;
import java.util.Scanner;

public class Task_07 {

    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        int[] array3;
        int m;
        int n;

        m = enterFromConsole("Введите размер первой последовательности >>");
        n = enterFromConsole("Введите размер второй последовательности >>");

        array1 = new int[m];
        array2 = new int[n];

        initArray(array1);
        System.out.print("Последовательность №1 : ");
        printArray(array1);
        System.out.println();

        initArray(array2);
        System.out.print("Последовательность №2 : ");
        printArray(array2);
        System.out.println();

        System.out.println("Индексы для вставки последовательности №2 в последовательность №1: ");

        getIndexForMerge(array1, array2);


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

        int n;

        if (array == null) {
            return;
        }

        Random random = new Random();
        n = random.nextInt(25);
        array[0] = n + random.nextInt(77);

        for (int i = 1; i < array.length; i++) {
            n = random.nextInt(25);

            array[i] = n + array[i - 1];

        }
    }


    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static void getIndexForMerge(int[] array1, int[] array2) {

        int i;
        int j;
        int[] array3;

        array3 = new int[array1.length + array2.length];

        i = 0;
        j = 0;

        for (int k = 0; k < array3.length; k++) {

            if (i > array1.length - 1) {

                int a = array2[j];
                array3[k] = a;
                System.out.println(j + " элемент второй последовательности со значением " +
                        a + " заносим в >> " + k + " ячейку;");
                j++;

            } else if (j > array2.length - 1) {

                int a = array1[i];
                array3[k] = a;
                i++;

            } else if (array1[i] < array2[j]) {

                int a = array1[i];
                array3[k] = a;
                i++;

            } else {

                int b = array2[j];
                array3[k] = b;
                System.out.println(j + " элемент второй последовательности со значением " +
                        b + " заносим в >> " + k + " ячейку;");
                j++;

            }
        }
    }


}
