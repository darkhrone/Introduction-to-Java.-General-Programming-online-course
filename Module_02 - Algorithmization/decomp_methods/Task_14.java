package by.jonline.decomp_methods;
/* Натуральное  число,  в  записи  которого n цифр,  называется  числом  Армстронга,  если  сумма  его  цифр,
 возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
 Для решения задачи использовать декомпозицию.*/

import java.util.Scanner;


public class Task_14 {
    public static void main(String[] args) {

        int max;

        max = enterFromConsole(" введите значение конца интервала k  (от 1 до k) >> ");

        compare(max);

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

    public static void compare(int max) {

        int sum;
        int count;
        int tmp;

        sum = 0;
        count = 0;

        for (int i = 1; i < max; i++) {
            tmp = i;

            while (tmp != 0) {
                tmp /= 10;
                count++;
            }
            tmp = i;
            for (int j = 0; j < count; j++) {
                sum += Math.pow(tmp % 10, count);
                tmp /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
            sum = 0;
            count = 0;
        }

    }


}