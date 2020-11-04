package by.jonline.array;

//Даны действительные числа a1,a2,a3...an. Найти max(a1 + a2n, a2 + a2n-1 .....an + an+1)

// Я полагаю, что an дано чтобы количество элементов массива было строго чётным
// [a1, a2, a3, ......., an , ............... , a2n]
// max(a1 + a2n, a2 + a2n-1, a3+ a2n-2, a4+ a2n-3, a4+ a2n-3,........, an + an+1)

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_07 {

    public static void main(String[] args) {

        int n;
        System.out.println("Сформированная последовательность будет содержать 2*n элементов.");
        n = enterFromConsole("введите n - количество элементов последовательности a(n) >> ");



        int[] arr = new int[2 * n];

        initArray(arr);

        System.out.println(Arrays.toString(arr));

        maxSum(arr);

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


    public static int maxSum(int[] a) {

        int max;

        max = a[0] + a[a.length - 1];

        System.out.println(a[0] + " + " + a[a.length - 1] + " = " + max);

        for (int i = 1; i < a.length / 2 - 1; i++) {

            System.out.println(a[i] + " + " + a[a.length - i - 1] + " = " + (a[i] + a[a.length - i - 1]));

            if (a[i] + a[a.length - i - 1] > max) {

                max = a[i] + a[a.length - i - 1];

            }

        }

        System.out.println(" Максимальная сумма = " + max);
        return max;
    }

}
