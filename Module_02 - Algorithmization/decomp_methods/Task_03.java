package by.jonline.decomp_methods;

//Вычислить  площадь  правильного  шестиугольника  со  стороной  а,  используя методвычисления  площади треугольника.

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {

        double area;
        double a;

        a = enterFromConsole("enter the hexagon side length >> ");

        area = hexagonArea(a);

        System.out.println("area of a hexagon = " + area);

    }

    public static double enterFromConsole(String s) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        double value;
        System.out.print(s);

        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.println(s);
        }

        value = sc.nextDouble();
        return value;
    }

    public static double hexagonArea(double a) {

        double ar = (3.0 * Math.sqrt(3.0) / 2.0) * a * a;

        return ar;

    }
}
