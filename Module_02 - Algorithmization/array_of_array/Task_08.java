package by.jonline.array_of_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// В числовой матрице поменять местами два любых столбца,
// т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
// а его элементы второго переместить в первый.Номера столбцов вводит пользователь с клавиатуры.
public class Task_08 {
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

        System.out.println("Введите номера столбцов для операции column swap >> ");

        k = enterFromConsole("введите # первого столбца матрицы >> ");

        p = enterFromConsole("введите # второго столбца матрицы >> ");

        swapColumn(matrix, k, p);

        System.out.println("матрица после замены столбцов " + k + " и " + p + ": ");
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


    private static void swapColumn(int[][] array, int k, int p) {

        int temp;

        for (int i = 0; i < array.length; i++) {

            temp = array[i][k];
            array[i][k] = array[i][p];
            array[i][p] = temp;

        }

    }


}
