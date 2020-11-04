package by.jonline.sort;

//Даны дроби p1/q1, p2/q2,..., pn/qn  (q и p,-натуральные). Составить программу,
// которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.


import java.util.Random;
import java.util.Scanner;

public class Task_08 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";


    public static void main(String[] args) {

        int n;
        int[] numerator;
        int[] denominator;
        int[] multiplier;
        int gcd;
        int lcm;

        n = enterFromConsole("Введите количетво элементов (дробей) полследовательности >>");

        numerator = new int[n];
        denominator = new int[n];

        initArray1(numerator);
        denominator = initArray2(numerator);

        lcm = calcLCM(denominator);

        multiplier = calcMultiplier(denominator, lcm);


        System.out.print(ANSI_YELLOW + "Последовательность: " + ANSI_RESET);
        printSequence(numerator, denominator);

        System.out.println("наименьшее общее кратное всех знаменателей = " + ANSI_CYAN + lcm + ANSI_RESET);

        System.out.print("коэффициенты домножения для приведения дробей к общему знаменателю: ");
        printArray(multiplier);

        commonArray(multiplier, numerator);
        shellSort(numerator);
        commonArray(multiplier, denominator);

        System.out.print(ANSI_YELLOW +
                "Отсортированная последовательность приведённая к наименьшему общему знаменателю:\n " + ANSI_RESET);
        printSequence(numerator, denominator);

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

    public static void initArray1(int[] array) {

        if (array == null) {
            return;
        }

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = 1 + random.nextInt(9);

        }
    }


    public static int[] initArray2(int[] array) {

        int[] array2;
        array2 = new int[array.length];

        Random random = new Random();

        for (int i = 0; i < array.length; ) {

            array2[i] = 1 + random.nextInt(10);
            if (array2[i] > array[i]) {
                i++;
            }
        }
        return array2;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int gcd(int x, int y) {         // Greatest common divisor

        return y == 0 ? x : gcd(y, x % y);
    }


    public static int lcm(int x, int y) {        // Least common multiple
        return x * y / gcd(x, y);
    }


    public static int calcLCM(int[] array) {

        int value = array[0];

        for (int i = 1; i < array.length; i++) {
            value = lcm(value, array[i]);

        }
        return value;
    }

    public static int[] calcMultiplier(int[] array, int lcm) {

        int[] multipliers = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            multipliers[i] = lcm / array[i];
        }
        return multipliers;
    }

    public static void commonArray(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * b[i];
        }
    }

    public static void printSequence(int[] a1, int[] a2) {

        for (int i = 0; i < a1.length; i++) {
            System.out.print(ANSI_RED + a1[i] + "/" + a2[i] + "   ");

        }
        System.out.println(ANSI_RESET);
    }

    public static void shellSort(int[] array) {
        int inner, outer;
        int temp;

        int h = 1;
        // ищем начальное значение h
        while (h <= array.length / 3) {
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        }

        while (h > 0) {
            //сдвигаемся на 1 шаг, для h-сортировки следующей группы элементов
            for (outer = h; outer < array.length; outer++) {
                temp = array[outer];
                inner = outer;
                //сортируем массив с шагом h
                while (inner > h - 1 && array[inner - h] >= temp) {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            //на каждом шаге уменьшаем h
            h = (h - 1) / 3;
        }
    }

}

