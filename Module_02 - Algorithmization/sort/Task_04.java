package by.jonline.sort;

// Сортировка  обменами. Дана  последовательность  чисел a1<=a2<=...<=an.
// Требуется  переставить  числа  в порядке  возрастания.
// Для  этого  сравниваются  два  соседних  числа a(i) и a(i+1).  Если a(i) > a(i+1),  то  делается перестановка.
// Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
// Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

import java.util.Random;

public class Task_04 {
    public static void main(String[] args) {


        int n;
        int count;
        int[] array;

        Random random = new Random();
        n = 5 + random.nextInt(15);

        array = new int[n];
        System.out.println("Исходная последовательность (возрастающая):");

        initArray(array);
        print(array);

        System.out.println();
        //selectionSort(array);
        count = bubbleSort(array);


        System.out.println("Итоговая последовательность (убывающая): ");
        print(array);

        System.out.println("Количество перестановок: " + count);

    }

    public static void initArray(int[] array) {

        if (array == null) {
            return;
        }

        Random random = new Random();

        array[0] = random.nextInt(10);

        for (int i = 1; i < array.length; i++) {

            array[i] = 1 + random.nextInt(10) + array[i - 1];

        }
    }


    public static void print(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }


    public static int bubbleSort(int[] array) {
        int temp;
        boolean isSorted = false;
        int count;

        count = 0;

        for (int j = 0; j < array.length; j++) {

            while (!isSorted) {

                isSorted = true;

                for (int i = 1; i < array.length; i++) {

                    if (array[i] > array[i - 1]) {
                        temp = array[i - 1];
                        array[i - 1] = array[i];
                        array[i] = temp;
                        count++;
                        isSorted = false;
                    }

                }

            }

        }
        return count;
    }

}

