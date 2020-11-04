package by.jonline.decomp_methods;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        int gcd2;
        int gcd3;
        String answer;

        a = enterFromConsole("enter first number  >> ");
        b = enterFromConsole("enter second number >> ");
        c = enterFromConsole("enter third number >> ");

        gcd2 = gcd(a, b);
        gcd3 = gcd(gcd2, c);

        answer = ((gcd2 & gcd3) == 1) ?
                "The numbers " + a + " " + b + " " + c + " " + "is a mutually prime " :
                "The numbers " + a + " " + b + " " + c + " " + "isn't a mutually prime ";

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

    public static int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }
}
