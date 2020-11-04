package by.jonline.array;

// Дан целочисленный массив с количеством элементов п.
// Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
// Примечание. Дополнительный массив не использовать.

import java.util.Arrays;
import java.util.Random;

public class Task_10 {
    public static void main(String[] args) {

        int n;
        int[] array;

        Random rand = new Random();
        n = rand.nextInt(30);

        array = new int[n];
        initArray(array);
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));

        deleteOdd(array);
        System.out.println("     Изменённый массив: " + Arrays.toString(array));
    }

    public static void initArray(int[] array) {

        int min = 1;
        int max = 20;

        if (array == null) {
            return;
        }

        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = min + rnd.nextInt(max - min + 1);

        }

    }


    public static void deleteOdd(int[] array) {

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

    }
}
