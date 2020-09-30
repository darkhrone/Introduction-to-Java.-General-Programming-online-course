package by.jonline.branch04;

// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double A = enterFromConsole("Enter the value of size A >> ");
        double B = enterFromConsole("Enter the value of size B >> ");

        double x = enterFromConsole("Enter the value of brick side x >> ");
        double y = enterFromConsole("Enter the value of brick side y >> ");
        double z = enterFromConsole("Enter the value of brick side z >> ");

        if ((A > x || A > y || A > z) && (B > x || B > y || A > z)) {
            System.out.printf("Кирпич со сторонами x = %.2f, y = %.2f, z = %.2f пройдёт через прямоугольное отверстие" +
                    " с размером сторон A = %.2f, и B = %.2f", x, y, z, A, B);
        } else {
            System.out.print("BRICK SHALL NOT PASS!!!");
        }
    }

    public static double enterFromConsole(String s) {
        double value;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print(s);

        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.println(s);
        }

        value = sc.nextDouble();
        return value;
    }
}
