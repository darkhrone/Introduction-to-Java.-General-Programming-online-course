package by.jonline.array_of_array;

// Найти положительные элементы главной диагонали квадратной матрицы

import java.util.Random;

public class Task_10 {
    public static void main(String[] args) {

        int n;
        int[][] array;

        n = createDim();

        array = new int[n][n];

        initArray(array);

        System.out.println("Сгенерированна квадратная матрица размерностью " + n);
        print2DArray(array);
        System.out.println("Положительные элементы главной диагонали квадратной матрицы :");

        printEvenDiagElems(array);


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
                array[i][j] = 9 - random.nextInt(18);
            }
        }

    }


    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();

        }
    }


    private static void printEvenDiagElems(int[][] matrix) {


        for (int i = 0; i < matrix.length; i++) {


            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + " ");
            }

        }


    }


}
