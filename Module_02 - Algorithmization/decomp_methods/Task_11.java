package by.jonline.decomp_methods;

//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        int n;
        int m;
        int sizeN;
        int sizeM;

        n = enterFromConsole(" введите число типа int  >> ");
        sizeN = getCountsOfDigits(n);
        m = enterFromConsole(" введите число типа int  >> ");
        sizeM = getCountsOfDigits(m);

        printResult(n, m, sizeN, sizeM);

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

    public static int equalNums(int sizeA, int sizeB) {
        if (sizeA > sizeB) {
            return 1;
        } else if (sizeA < sizeB) {
            return 2;
        } else
            return 3;
    }

    public static void printResult(int a, int b, int sizeA, int sizeB) {
        switch (equalNums(sizeA, sizeB)) {
            case 1:
                System.out.println("В числе " + a + " больше чисел");
                break;
            case 2:
                System.out.println("В числе " + b + " больше чисел");
                break;
            case 3:
                System.out.println("В числах " + a + " и " + b + " одинаковое количество чисел");
                break;
        }
    }
}
