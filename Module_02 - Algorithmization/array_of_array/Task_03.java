package by.jonline.array_of_array;

// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {

        int n;
        int m;
        int k;
        int p;
        int[][] matrix;

        n = enterFromConsole("введите n - число строк матрицы >> ");
        m = enterFromConsole("введите m - число столбцов матрицы >> ");

        matrix = new int[n][m];

        initArray(matrix);

        System.out.println("сгенерирована матрица : ");
        printArray(matrix);

        k = enterFromConsole("введите k - # выводимой строки матрицы (от 0 до n-1) >> ");
        printRow(matrix, k);
        System.out.println();


        p = enterFromConsole("введите p - # выводимого столбца матрицы (от 0 до m-1) >> ");
        printColumn(matrix, p);

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


    private static void printRow(int[][] array, int k) {

        for (int i = 0; i < array[k].length; i++) {

            System.out.print(array[k][i] + " ");
        }

        System.out.println();
    }


    private static void printColumn(int[][] array, int m) {

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i][m]);
        }

    }

}



