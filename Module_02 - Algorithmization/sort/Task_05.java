package by.jonline.sort;

// Сортировка вставками.Дана последовательность чисел a1,a2,... an. Требуется переставить числа в порядке возрастания.
// Делается это следующим образом. Пусть a1,a2,... ai - упорядоченная последовательность, т. е. a1<=a2<=...<=an.
// Берется  следующее  число a(i+1) и вставляется  в  последовательность  так,  чтобы  новая последовательность
// была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до nне будут перебраны.
// Примечание.Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
// Двоичный поиск оформить в виде отдельной функции.


import java.util.Random;

public class Task_05 {

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
        insertionSort(array);
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


    public static void insertionSort(int[] array) {

        for (int k = 1; k < array.length; k++) {
            int newElement = array[k];
            int index;
            index = binarySearch(array, 0, k, newElement);
            if (index < 0) {
                index = -(index) - 1;
            }

            for (int n = k; n > index; n--) {
                array[n] = array[n - 1];
            }
            array[index] = newElement;
        }
    }


    private static int binarySearch(int[] a, int fromIndex, int toIndex, int value) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < value)
                low = mid + 1;
            else if (midVal > value)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }


}



