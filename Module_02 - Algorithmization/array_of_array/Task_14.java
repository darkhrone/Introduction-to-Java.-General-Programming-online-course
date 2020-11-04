package by.jonline.array_of_array;

// Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
// причем в каждом столбце число единиц равно номеру столбца

import java.util.Random;

public class Task_14 {

    public static void main(String[] args) {
        int m;
        int n;
        int[][] array;

        do {
            m = createDim();
            n = createDim();
        } while (m < n);


        array = new int[m][n];
        initArray(array);
        System.out.println("\nСгенерированна матрица размерностью " + m + " строк на " + n + " столбцов");
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
            for (int j = i + 1; j < array[i].length; j++) {
                array[i][j] = 1;
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


}
