package by.jonline.array_of_array;

//Сформировать квадратную матрицу порядка n по заданному образцу(n-четное):
//  1   1   1   ...  1   1   1
//  2   2   2   ...  2   2   0
//  3   3   3   ...  3   0   0
//    ...               ...
// n-1 n-1  0   ...  0   0   0
//  n   0   0   ...  0   0   0


import java.util.Arrays;
import java.util.Scanner;

public class Task_05 {

    public static void main(String[] args) {

        int n;
        int[][] matrix;

        n = enterFromConsole("введите n - число строк/столбцов матрицы >> ");

        matrix = new int[n][n];

        System.out.println("Заполненная матрица: ");
        initArray(matrix);

        printArray(matrix);

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

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - i; j++) {
                array[i][j] = i + 1;
            }
        }

    }


    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


}
