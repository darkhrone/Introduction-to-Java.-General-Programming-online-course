package by.jonline.decomp_methods;

//Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
// которое меньше максимального элемента массива, но больше всех других элементов)

import java.util.Random;

public class Task_05 {
    public static void main(String[] args) {

        int n = 10;
        int[] array = new int[n];
        initArray(array);

        System.out.print("массив A[N]: { ");
        printArray(array);

        System.out.println();

        System.out.println(" искомое число >> " + findSecondMax(array));
    }


    public static void initArray(int[] array) {
        if (array == null) {
            return;
        }

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
    }


    public static int findSecondMax(int[] array) {

        for (int j = 0; j < 2; j++) {                       // для нахождения 2х максимальных чисел
            for (int i = 1; i < array.length; i++) {        // делаем 2а прохода сортировки пузырьком
                if (array[i] < array[i - 1]) {
                    int tmp;
                    tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;

                }
            }
        }
        return array[array.length - 2];
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println(" }");
    }

}
