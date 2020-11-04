package by.jonline.decomp_methods;

//Написать метод(методы)для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел

import java.util.Scanner;

public class Task_01 {

    public static void main(String[] args) {
        int a;
        int b;

        a = enterFromConsole("enter first number  >> ");
        b = enterFromConsole("enter second number >> ");

        int gcd = gcd(a, b);
        int lcm = lcm(a, b);
        System.out.println("Greatest common divisor >> " + gcd + "\nLeast common multiple = " + lcm);


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
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }

    public static int lcm(int x, int y) {        // Least common multiple
        return x * y / gcd(x, y);
    }

}