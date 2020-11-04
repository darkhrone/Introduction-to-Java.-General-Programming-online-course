package by.jonline.array;
//Дана  последовательность  целых  чисел a1,a2,a3... an.
// Образовать  новую  последовательность,  выбросив  из исходной те члены, которые равны min(a1,a2,a3,...an)


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {

        int n;
        int min;
        int count;

        int[] arrayN;
        int[] array_WO_Min;

        n = enterFromConsole("введите n - количество элементов последовательности a(n) >> ");

        arrayN = new int[n];

        initArray(arrayN);

        System.out.println(Arrays.toString(arrayN));

        min = minElement(arrayN);

        count = countMin(arrayN, min);

        System.out.println("Минимальный элемент последовательности: " + min + "\nПовторяется " + count + " раз(-а)");

        shiftArrElems(arrayN, min);

        array_WO_Min = createNewArray(arrayN, count);
        System.out.println("Количество элементов новой последовательности: " + array_WO_Min.length);

        System.out.println("Новая последовательность: " + Arrays.toString(array_WO_Min));

    }


    public static int enterFromConsole(String s) {

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


    public static void initArray(int[] array) {

        int min = -5;
        int max = 10;

        if (array == null) {
            return;
        }

        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = min + rnd.nextInt(max - min + 1);

        }

    }


    public static int minElement(int[] array) {

        int min;
        min = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }

        }

        return min;
    }

    public static int countMin(int[] array, int min) {
        int count;
        count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == min) {
                count++;
            }

        }

        return count;
    }

    public static int[] shiftArrElems(int[] array, int min) {

        for (int i = 0; i < array.length; ) {

            if (array[i] == min) {

                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }

            }

            if (array[i] != min) {
                i++;
            }

        }
        return array;
    }

    public static int[] createNewArray(int[] array, int count) {

        int[] newArray;
        newArray = new int[array.length - count];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }

}
