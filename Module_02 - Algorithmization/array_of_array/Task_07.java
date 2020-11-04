package by.jonline.array_of_array;

//Сформировать квадратную матрицу порядка N по правилу:

//  A[i,j] = sin((i*i - j*j) / N)

// и подсчитать количество положительных элементов в ней.

import java.util.Arrays;
import java.util.Scanner;

public class Task_07 {

    public static void main(String[] args) {

        int n;
        double[][] matrix;

        n = enterFromConsole("введите n - число строк/столбцов матрицы >> ");

        matrix = new double[n][n];

        System.out.println("Заполненная матрица: ");
        initArray(matrix);

        printArray(matrix);

        System.out.println("Количество положительных элементов : " + calcPosElem(matrix));

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


    private static void initArray(double[][] array) {
        double roundOff;
        double a;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                a = Math.sin((i * i - j * j) / array.length);
                roundOff = (double) Math.round(a * 100) / 100;
                array[i][j] = roundOff;
            }
        }

    }


    private static void printArray(double[][] array) {

        for (double[] row : array) {
            System.out.print(Arrays.toString(row));
            System.out.println();
        }

    }


    private static int calcPosElem(double[][] array) {
        int count;

        count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    count++;
                }
            }
        }

        return count;
    }

}
