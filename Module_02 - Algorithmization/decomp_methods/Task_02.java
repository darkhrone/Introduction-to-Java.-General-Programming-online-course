package by.jonline.decomp_methods;

// Написать метод (методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;

        int gcd2;
        int gcd3;
        int gcd4;

        String answer;

        a = enterFromConsole("enter first number  >> ");
        b = enterFromConsole("enter second number >> ");
        c = enterFromConsole("enter third number >> ");
        d = enterFromConsole("enter fourth number >> ");

        gcd2 = gcd(a, b);
        gcd3 = gcd(gcd2, c);
        gcd4 = gcd(gcd3, d);

        answer = ((gcd2 <= gcd3) && (gcd2 <= gcd4)) ? "Greatest common divisor = " + gcd2 :
                ((gcd3 <= gcd2) && (gcd3 <= gcd4)) ? "Greatest common divisor = " + gcd3 :
                        "Greatest common divisor = " + gcd4;

        System.out.println(answer);

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

    public static int gcd(int x, int y) {         // Greatest common divisor

        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

}

