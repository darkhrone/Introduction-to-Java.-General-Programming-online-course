package by.jonline.array_of_array;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {

        int n;
        int m;
        int[][] matrix;

        n = enterFromConsole("введите n - число строк матрицы >> ");
        m = enterFromConsole("введите m - число столбцов матрицы >> ");

        matrix = new int[n][m];

        initArray(matrix);

        System.out.println("сгенерирована матрица : ");
        printArray(matrix);

        printOddColumn(matrix);

    }

    private static int enterFromConsole(String s) {

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


    private static void initArray(int[][] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 10 + random.nextInt(89);
            }
        }

    }


    private static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }


    private static void printOddColumn(int[][] array) {

        for (int j = 1; j < array[0].length; j += 2) {

            if (array[0][j] > array[array.length - 1][j]) {

                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i][j]);
                }

                System.out.println();
            }

        }

    }


}





