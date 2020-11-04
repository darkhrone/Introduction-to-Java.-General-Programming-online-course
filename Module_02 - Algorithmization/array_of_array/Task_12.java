package by.jonline.array_of_array;

import java.util.Random;

// Отсортировать строки матрицы по возрастанию и убыванию значений элементов

public class Task_12 {
    public static void main(String[] args) {
        int n;
        int m;
        int[][] array;

        n = createDim();
        m = createDim();

        array = new int[n][m];
        initArray(array);
        System.out.println("\nСгенерированна матрица размерностью " + n + " строк на " + m + " столбцов");
        printArray(array);

        System.out.println("\nCтроки отсортированы по возрастанию значений элементов");

        sortIncrease(array);
        printArray(array);

        System.out.println("\nCтроки отсортированы по убыванию значений элементов");

        sortDecrease(array);
        printArray(array);
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

    public static void sortIncrease(int[][] array) {
        int temp;
        boolean isSorted = false;

        for (int i = 0; i < array.length; i++) {

            while (!isSorted) {

                isSorted = true;

                for (int j = 1; j < array[i].length; j++) {

                    if (array[i][j] < array[i][j - 1]) {
                        temp = array[i][j - 1];
                        array[i][j - 1] = array[i][j];
                        array[i][j] = temp;

                        isSorted = false;
                    }

                }

            }
            isSorted = false;
        }

    }


    public static void sortDecrease(int[][] array) {
        int temp;
        boolean isSorted = false;

        for (int i = 0; i < array.length; i++) {

            while (!isSorted) {

                isSorted = true;

                for (int j = 1; j < array[i].length; j++) {

                    if (array[i][j] > array[i][j - 1]) {
                        temp = array[i][j];
                        array[i][j] = array[i][j - 1];
                        array[i][j - 1] = temp;

                        isSorted = false;
                    }

                }

            }
            isSorted = false;
        }

    }


}
