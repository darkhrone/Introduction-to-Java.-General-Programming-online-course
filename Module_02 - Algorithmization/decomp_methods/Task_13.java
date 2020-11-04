package by.jonline.decomp_methods;

/*Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n-заданное натуральное число больше 2.
Для решения задачи использовать декомпозицию*/

import java.util.Arrays;
import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {

        int n;

        do {
            n = enterFromConsole("введите число n типа int (n > 2) >> ");

            if (n <= 2) {
                System.out.println("Значение n должно быть больше 2 !");
            }

        } while (n <= 2);

        int[] array = new int[n + 1];
        initArray(array, n);

        System.out.println("Отрезок >> " + Arrays.toString(array));

        printTwins(array);
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

    public static void initArray(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = n;
            n++;
        }

    }

    public static void printTwins(int[] array) {

        for (int i = 0; i < array.length - 2; i++){
            System.out.println(array[i] + " " + array[i+2]);
        }
    }

}