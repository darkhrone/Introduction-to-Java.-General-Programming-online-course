package by.jonline.array_of_array;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

import java.util.Random;

public class Task_15 {
    public static void main(String[] args) {
        int m;
        int n;
        int[][] array;
        int max;

        m = createDim();
        n = createDim();

        array = new int[m][n];
        initArray(array);
        System.out.println("\nСгенерированна матрица размерностью " + m + " строк на " + n + " столбцов");
        printArray(array);

        System.out.println();
        max = searchMax(array);
        System.out.println("Наибольший элемент матрицы: " + max);

        System.out.println("\nМатрица после замены всех нечётных чисел на число " + max);
        replaceOdds(array, max);
        printArray(array);
    }


    public static int createDim() {
        int a;

        Random random = new Random();
        a = 5 + random.nextInt(25);

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

    public static int searchMax(int[][] array) {
        int max;

        max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] > max) {
                    max = array[i][j];
                }

            }
        }

        return max;
    }





    public static void replaceOdds(int[][] array, int num) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] % 2 != 0) {
                    array[i][j] = num;
                }

            }
        }

    }


}
