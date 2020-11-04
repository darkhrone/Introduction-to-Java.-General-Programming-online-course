package by.jonline.array_of_array;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
//Определить, какой столбец содержит максимальную сумму.

import java.util.Arrays;
import java.util.Random;

public class Task_09 {
    public static void main(String[] args) {

        int n;
        int m;
        int[][] array;
        int[] result;

        n = createDim();
        m = createDim();

        array = new int[n][m];
        initArray(array);
        System.out.println("Сгенерированна матрица размерностью " + n + " строк на " + m + " столбцов");
        printArray(array);

        result = maxSumColumn(array);
        System.out.println("Столбец #" + result[0] + " имеет максимальную сумму равную " + result[1]);
        System.out.println("P.S. нумерация начинается с 0");

    }

    public static int createDim() {
        int a;

        Random random = new Random();
        a = 2 + random.nextInt(8);

        return a;

    }


    public static void initArray(int[][] array) {

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 10 + random.nextInt(89);
            }
        }

    }


    public static void printArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }


    private static int[] maxSumColumn(int[][] matrix) {

        int sum;
        int max_sum;
        int max_sum_pos;
        int[] result = new int[2];

        sum = 0;
        max_sum = 0;
        max_sum_pos = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }

            if (max_sum < sum) {
                max_sum = sum;
                max_sum_pos = j;
            }

            sum = 0;
        }

        result[0] = max_sum_pos;
        result[1] = max_sum;

        return result;
    }


}

