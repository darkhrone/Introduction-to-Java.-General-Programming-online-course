package by.jonline.array_of_array;

//Сформировать квадратную матрицу порядка n по заданному образцу(n-четное):
//  1   2   3   ...   n
//  n  n-1 n-2  ...   1
//  1   2   3   ...   n
//  n  n-1 n-2  ...   1
//    ...
//  n  n-1 n-2  ...   1


import java.util.Arrays;
import java.util.Scanner;

public class Task_04 {

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
            for (int j = 0; j < array[i].length; j++) {

                if (i % 2 == 0) {
                    array[i][j] = j + 1;
                } else {
                    array[i][j] = array[i].length - j;
                }

            }
        }

    }


    private static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }


}
