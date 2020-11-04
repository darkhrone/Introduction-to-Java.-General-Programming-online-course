package by.jonline.decomp_methods;

// Даны натуральные числа К и N. Написать метод(методы)формирования массива А, элементами которого являются числа,
// сумма цифр которых равна К и которые не большее N

import java.util.Arrays;
import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {

        int k;
        int n;
        int sizeK;
        int size2;
        int[] arrayA;
        int tmp = 1;


        k = enterFromConsole(" введите число k типа int >> ");
        do {
            n = enterFromConsole(" введите число n типа int (n > 0) >> ");

            if (n <= 0) {
                System.out.println("-= Значение n должно быть больше 0 =-");
            }

        } while (n <= 0);

        sizeK = getCountsOfDigits(k);
        size2 = k / n;


        if (sizeK == 1) {

            if (k <= n) {
                arrayA = new int[sizeK + 1];
                arrayA[0] = k;
            } else {
                arrayA = new int[size2 + 1];
                method2(arrayA, k, n);
            }
            System.out.println(Arrays.toString(arrayA));

        } else if (sizeK >= 2) {
            if (k <= n) {
                arrayA = new int[sizeK];
                method1(arrayA, k, tmp);
            } else {
                arrayA = new int[size2 + 1];
                method2(arrayA, k, n);
            }
            System.out.println(Arrays.toString(arrayA));

        }

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

    public static int getCountsOfDigits(int number) {

        int count = (number == 0) ? 1 : 0;

        while (number != 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static void method1(int[] array, int k, int tmp) {

        for (int i = 0; i < array.length; i++) {
            array[i] = k % 10 * tmp;
            k /= 10;
            tmp *= 10;
        }

    }

    public static void method2(int[] array, int k, int n) {

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = n;
        }
        array[array.length - 1] = k % n;

    }


}
