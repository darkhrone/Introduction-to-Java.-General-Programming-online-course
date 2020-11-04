package by.jonline.sort;

/*
   Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
   Делается это следующим образом: сравниваются два соседних элемента ai и a(i + 1).
   Если ai <= a(i + 1), то продвигаются на один элемент вперед.
   Если ai > a(i + 1), то производится перестановка и сдвигаются на один элемент назад.
   Составить алгоритм этой сортировки.
 */

import java.util.Random;

public class Task_06 {
    public static void main(String[] args) {


        int n;
        int[] array;

        Random random = new Random();
        n = 5 + random.nextInt(15);

        array = new int[n];
        System.out.println("Исходная последовательность :");

        initArray(array);
        print(array);

        System.out.println();
        System.out.println("Итоговая последовательность :");
        shellSort(array);
        print(array);

    }

    public static void initArray(int[] array) {

        if (array == null) {
            return;
        }

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = 9 + random.nextInt(89);

        }
    }


    public static void print(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }


    public static void shellSort(int[] array) {
        int inner, outer;
        int temp;

        int h = 1;
        // ищем начальное значение h
        while (h <= array.length / 3) {
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        }

        while (h > 0) {
            //сдвигаемся на 1 шаг, для h-сортировки следующей группы элементов
            for (outer = h; outer < array.length; outer++) {
                temp = array[outer];
                inner = outer;
                //сортируем массив с шагом h
                while (inner > h - 1 && array[inner - h] >= temp) {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            //на каждом шаге уменьшаем h
            h = (h - 1) / 3;
        }
    }
}
