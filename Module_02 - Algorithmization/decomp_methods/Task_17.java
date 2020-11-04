package by.jonline.decomp_methods;

// Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль?Для решения задачи использовать декомпозицию

import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {

        int n;
        int sum;
        int count;
        int res;

        do {
            n = enterFromConsole("Введите число n >> ");

            if (n < 0) {
                System.out.println((char) 27 + "[31mВведите положительное число!"
                        + (char) 27 + "[0m");
            }
        }
        while (n < 0);

        count = 0;

        do {
            count++;

            sum = sumOfNum(n);

            res = n - sum;

            System.out.println("Действие № " + count + "  |  Сумма чисел числа " + n + " = " + sum +
                                "  |  Результат вычитания суммы цифр = " + res);

            n = res;

        } while (res != 0);

        System.out.println("\nДля получения нуля необходимо выполнить " + count + " действий");

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


    public static int sumOfNum(int n) {

        int sum;

        sum = 0;

        do {
            sum += n % 10;
            n /= 10;
        }
        while (n > 0);

        return sum;
    }

}
