package by.jonline.decomp_methods;

//Найти  все  натуральные n-значные  числа,  цифры  в  которых  образуют  строго  возрастающую последовательность
// (например, 1234, 5789).Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {

        System.out.println("\nПрограмма выводит на экран все  натуральные n-значные  числа," +
                "  цифры  в  которых  образуют  строго  возрастающую последовательность\n");

        int n;
        int choice;

        n = enterFromConsole("Введите количество знаков последовательности >>");

        System.out.println("Для вывода всех чисел с количеством цифр равным " + n + ", введите 1 >>");

        System.out.println("Для вывода всех чисел с количеством цифр равным от 2 до " + n + ", введите 2 >> ");

        choice = enterFromConsole(">>");

        switch (choice) {
            case 1:
                incNums1(n);
                break;
            case 2:
                incNums2(n);
                break;
            default:
                incNums2(n);
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

    public static void incNums1(int n) {

        int x;
        int y;
        int i_tmp;
        int count;

        x = (int) Math.pow(10, n - 1);
        y = 10 * x - 1;

        for (int i = x; i <= (y - x * (n - 1)); i++) {

            i_tmp = i;
            count = 0;

            for (int j = n; j > 1; j--) {

                if (i_tmp % 10 - (i_tmp / 10) % 10 == 1) {
                    count++;

                    if (count == n - 1) {
                        System.out.println(i);
                    }

                    if (i_tmp != 0) {
                        i_tmp /= 10;
                    }

                }

            }

        }

    }


    public static void incNums2(int n) {

        int x;
        int y;
        int i_tmp;
        int count;

        for (int k = 2; k <= n; k++) {

            x = (int) Math.pow(10, k - 1);
            y = 10 * x - 1;

            for (int i = x; i <= (y - x * (k - 1)); i++) {

                i_tmp = i;
                count = 0;

                for (int j = k; j > 1; j--) {

                    if (i_tmp % 10 - (i_tmp / 10) % 10 == 1) {
                        count++;

                        if (count == k - 1) {
                            System.out.println(i);
                        }

                        if (i_tmp != 0) {
                            i_tmp /= 10;
                        }

                    }

                }

            }
            System.out.println();
        }
    }


}

