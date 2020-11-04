package by.jonline.decomp_methods;

//Написать  программу,  определяющую  сумму n-значных  чисел,  содержащих  только  нечетные  цифры.
// Определить также, сколько четных цифр в найденной сумме.Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {

        int n;
        int m;
        int interval_n;
        int interval_m;
        int sumOdd;
        int quantityOFEven;

        do {
            n = enterFromConsole("Введите начальное значение интервала чисел >> ");
            m = enterFromConsole("Введите крнечное значение интервала чисел >> ");

            if (n > m) {
                System.out.println((char) 27 + "[31mНачальное значение не может превышать конечное!"
                                 + (char) 27 + "[0m");
            }
        }
        while (n > m);


        interval_n = (int) Math.pow(10, n - 1);
        interval_m = (int) Math.pow(10, m) - 1;


        sumOdd = sumOddNums(n, m);
        System.out.println("\nОбщая сумма всех нечётных чисел в интервале от "
                           + interval_n + " до " + interval_m + " равна " + sumOdd);


        quantityOFEven = sumEvenNums(sumOdd);
        System.out.println("количество чётных чисел суммы равно " + quantityOFEven);

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


    public static int sumOddNums(int n, int m) {

        int x;
        int y;
        int count;
        int sum_odd_each;
        int sum_odd_all;
        int tmp_val;

        sum_odd_all = 0;

        for (int i = n; i <= m; i++) {

            x = (int) Math.pow(10, (i - 1));
            y = (int) Math.pow(10, i) - 1;

             System.out.println("\nнечётные числа в интервале от " + x + " до " + y + ":");
             System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");

            for (int j = x; j <= y; j++) {

                tmp_val = j;
                count = 0;
                sum_odd_each = 0;

                for (int k = i; k > 0; k--) {

                    if (tmp_val % 2 != 0) {
                        count++;
                        sum_odd_each += tmp_val % 10;
                        if (count == i) {
                            System.out.print("число = " + j + " | cумма чисел = " + sum_odd_each);

                            sum_odd_all += sum_odd_each;
                            System.out.println(" | общая сумма всех предыдущих чисел = " + sum_odd_all);
                        }
                    }

                    tmp_val /= 10;
                }
            }
        }

        return sum_odd_all;
    }


    public static int sumEvenNums(int sumOdd) {
        int quantityOFEven;
        quantityOFEven = 0;

        while (sumOdd > 0) {
            if (sumOdd % 10 != 0) {

                if ((sumOdd % 10) % 2 == 0) {
                    quantityOFEven++;
                }
            }
            sumOdd /= 10;
        }

        return quantityOFEven;
    }

}
