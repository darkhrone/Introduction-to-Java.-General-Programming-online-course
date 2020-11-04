package by.jonline.array_of_array;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ...,2n
// так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой.
// Построить такой квадрат

import java.util.Arrays;
import java.util.Scanner;

public class Task_16 {

    public static void main(String[] args) {

        int n;
        int limit;

        n = enterFromConsole("введите n - число строк/столбцов матрицы >> ");
        limit = getLimit(n);

        permutationGenerator(n * n, limit);

    }


    private static int enterFromConsole(String s) {

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


    public static int getLimit(int n) {

        return n * (n * n + 1) / 2;
    }


    public static int findMaxMobileElement(int[] permutation, int[] direction) {
        int index = -1;
        for (int i = 0; i < permutation.length; i++) {
            int nextIndex = i + direction[i];
            if (nextIndex >= 0 && nextIndex < permutation.length) {
                if (permutation[i] > permutation[nextIndex]) {
                    if (index == -1) {
                        index = i;
                    } else {
                        if (permutation[i] > permutation[index]) {
                            index = i;
                        }
                    }
                }
            }
        }
        return index;
    }

    public static void changeDirection(int[] permutation, int[] direction, int mobileElement) {
        for (int i = 0; i < permutation.length; i++) {
            if (permutation[i] > mobileElement) {
                direction[i] = direction[i] * (-1);
            }
        }
    }

    public static void swap(int[] permutation, int[] direction, int i, int j) {
        int permutationTemp = permutation[i];
        permutation[i] = permutation[j];
        permutation[j] = permutationTemp;

        int directionTemp = direction[i];
        direction[i] = direction[j];
        direction[j] = directionTemp;
    }

    public static void permutationGenerator(int n, int lim) {
        int[] permutation = new int[n];
        int[] direction = new int[n];


        int count = 0;
        int check = 0;
        int size = (int) Math.sqrt(permutation.length);
        int[] sums = new int[2 * size + 2];


        for (int i = 0; i < permutation.length; i++) {
            permutation[i] = i + 1;
            direction[i] = -1;
        }
        //System.out.println(Arrays.toString(permutation))
        // ___________________________________________________________________________________//

        int mobileElementIndex = findMaxMobileElement(permutation, direction);

        for (; mobileElementIndex != -1; ) {
            int mobileElement = permutation[mobileElementIndex];
            int nextIndex = mobileElementIndex + direction[mobileElementIndex];
            swap(permutation, direction, mobileElementIndex, nextIndex);
            changeDirection(permutation, direction, mobileElement);


            for (int m = 1; m <= size; m++) {

                sums[m - 1] = sumOfRow(permutation, m, size);


                for (int l = 0; l < size; l++) {

                    sums[l + size] = sumOfColumns(permutation, l, size);
                    if (sums[m - 1] != sums[l + size]) {
                        break;
                    }
                    if (m>1) {
                    break;
                    }

                }
            }

            sums[sums.length - 2] = sumOfDiag1(permutation, size);
            sums[sums.length - 1] = sumOfDiag2(permutation, size);


            for (int x = 0; x < sums.length; x++) {
                if (sums[x] == lim) {
                    count++;

                }

                if (count == sums.length) {
                    //System.out.println(count);
                    System.out.println(Arrays.toString(permutation));
                }

            }
            count = 0;


            mobileElementIndex = findMaxMobileElement(permutation, direction);
        }
//___________________________________________________________________________________//


    }


    public static int sumOfRow(int[] array, int init_position, int n) {
        int sum = 0;

        for (int i = init_position * n - n; i < init_position * n; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static int sumOfColumns(int[] array, int init_position, int n) {
        int sum = 0;

        for (int j = init_position; j < array.length; j += n) {
            sum += array[j];
        }

        return sum;
    }

    public static int sumOfDiag1(int[] array, int n) {
        int sum = 0;

        for (int i = 0; i < array.length; i += (n + 1)) {
            sum += array[i];
        }

        return sum;
    }

    public static int sumOfDiag2(int[] array, int n) {
        int sum = 0;

        for (int i = array.length - n; i > 0; i -= (n - 1)) {
            sum += array[i];
        }

        return sum;

    }

}