package by.jonline.decomp_methods;

// Дано  натуральное  число N. Написать  метод(методы)для  формирования  массива,
// элементами  которого являются цифры числа N.

import java.util.Arrays;
import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        int n;
        int size;

        n = enterFromConsole(" введите число типа int  >> ");
        size = getCountsOfDigits(n);

        int[] arrayN = new int[size];

        initArray(arrayN, n);

        System.out.println("Сформированный массив: " + Arrays.toString(arrayN));
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

    public static void initArray(int[] array, int number) {
        if (array == null) {
            return;
        }

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = number % 10;
            number /= 10;
        }
    }

}
