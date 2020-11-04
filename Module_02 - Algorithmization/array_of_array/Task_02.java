package by.jonline.array_of_array;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {

        int n;
        int[][] matrix;

        n = enterFromConsole("введите n - число строк/столбцов матрицы >> ");

        matrix = new int[n][n];

        initArray(matrix);

        printArray(matrix);

        printArrayDiagonal(matrix);


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


    private static void printArrayDiagonal(int[][] array){

        System.out.println("Элементы диоганали матрицы: ");
        System.out.print("[");

        for (int i = 0; i < array.length; i++) {

            if (i < array.length - 1) {
                System.out.print(array[i][i] + ", ");
            } else {
                System.out.print(array[i][i]);
            }

        }

        System.out.print("]");
    }

}
