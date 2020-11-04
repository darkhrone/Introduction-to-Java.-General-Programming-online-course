package by.jonline.decomp_methods;

//Даны числа X, Y, Z, Т —длины сторон четырехугольника. Написать метод(методы) вычисленияего площади,
// если угол между сторонами длиной X и Y—прямой.

import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {

        int x;
        int y;
        int z;
        double w;
        int t;

        double p;
        double s1;
        double s2;

        System.out.println("Введите размеры сторон четырёхугольника: ");

        x = enterFromConsole("сторона x  >> ");
        y = enterFromConsole("сторона y >> ");
        z = enterFromConsole("сторона w >> ");
        t = enterFromConsole("сторона t >> ");


        s1 = squareOfTriangle90(x, y);
        System.out.println("Площадь первого трегольника = " + s1);
        w = hypotenuseOfTriangle90(x, y);
        System.out.println("Гипотенуза первого трегольника = " + w);
        p = semiperimeterOfTriangle2(z, t, w);
        System.out.println("Полупериметр второго трегольника = " + p);
        s2 = squareOfTriangle2(z, t, w, p);
        System.out.println("Площадь второго трегольника = " + s2);
        System.out.println("площадь четырёхугольника равна =" + (s1 + s2));


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

        if (value > 0) {

            return value;
        } else {
            System.out.print("Число должно быть больше 0 !!!");
            System.exit(0);
            return 0;
        }
    }

    public static double squareOfTriangle90(int a, int b) {
        double s;
        s = (double) 0.5 * a * b;
        return s;
    }

    public static double hypotenuseOfTriangle90(int a, int b) {
        double c;
        c = Math.sqrt(a * a + b * b);
        return c;
    }

    public static double semiperimeterOfTriangle2(int a, int b, double c) {
        double p;
        p = 0.5 * (a + b + c);
        return p;
    }

    public static double squareOfTriangle2(int a, int b, double c, double p) {
        double s;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }


}
