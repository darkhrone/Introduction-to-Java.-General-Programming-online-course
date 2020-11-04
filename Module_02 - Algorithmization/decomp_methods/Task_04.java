package by.jonline.decomp_methods;

//На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие
//между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Task_04 {
    public static void main(String[] args) throws IOException {

        int nums;
        int n;
        double[] array;
        double[] distanceArray;

        do {
            nums = enterFromConsole("Введите количество точек n >>  ");

            if (nums < 3) {
                System.out.println("n должно быть БОЛЬШЕ 2 !!!");
            }

        } while (nums < 3);

        n = nums * 2;

        array = createArray(n);
        System.out.println("Координаты точек >>  " +
                Arrays.toString(array));

        distanceArray = calcDistanceArray(array);
        System.out.println("Расстояние между точками >>  " + Arrays.toString(distanceArray));

        printMax(distanceArray);

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


    public static double[] createArray(int n) throws IOException {

        double[] array = new double[n];
        String msg;
        int count1;
        int count2;

        count1 = 1;
        count2 = 0;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                msg = ("введите x координату точки " + count1 + " >>  ");
                count2++;
            } else {
                msg = ("введите y координату точки " + count1 + " >>  ");
                count2++;
            }

            array[i] = enterFromConsole(msg);

            if (count2 == 2) {
                count1++;
                count2 = 0;
                System.out.println();
            }

        }

        return array;
    }


    public static double[] calcDistanceArray(double[] array) {
        int n = array.length;
        double[] distance = new double[n / 2 - 1];
        int count = 0;
        for (int i = 0; i < n - 3; i += 2) {           //измеряем расстояние между точками и заносим в новый массив

            double x = (Math.pow((array[i + 2] - array[i]), 2.0));
            double y = (Math.pow((array[i + 3] - array[i + 1]), 2.0));
            double z = Math.sqrt(x + y);

            distance[count] = z;
            count++;
        }

        return distance;
    }


    public static void printMax(double distance[]) {

        double max = distance[0];
        int max_index = 0;
        for (int i = 1; i < distance.length; i++) {
            if (max < distance[i]) {
                max = distance[i];
                max_index = i;
            }
        }
        System.out.println("Максимальное расстояние между точками " + max);
        System.out.println("Максимальное расстояние между точками " + (max_index + 1) + " и " + (max_index + 2));
    }
}