package by.jonline.array_of_array;

//Матрицу 10x20 заполнить случайными числами от 0 до 15.
//Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.

import java.util.Random;

public class Task_11 {

    public static void main(String[] args) {

        int[][] array = new int[10][20];


        initArray(array);

        printArray(array);

        System.out.println();
        printRow5(array);

    }

    private static void initArray(int[][] array) {

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(15);
            }
        }

    }

    public static void printArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();

        }
    }

    public static void printRow5(int[][] array) {
        int rowIndex;
        int count;
        int count2;

        count = 0;
        count2 = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] == 5) {
                    count++;
                }

            }
            if (count > 2) {
                count2++;
                System.out.println("В ряду #" + i + " число 5 встречается " + count + " раз(-а).");
            }
            count = 0;
        }

        if (count2 == 0) {
            System.out.println("Ни в одном ряду число 5 не встречается более двух раз.");
        }

    }

}



