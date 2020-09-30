package by.jonline.loop08;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число 1:");
        int a = Math.abs(Integer.parseInt(reader.readLine()));

        System.out.println("Введите число 2:");
        int b = Math.abs(Integer.parseInt(reader.readLine()));

        int valueB = b;

        while (a > 0) {

            int c = a % 10;
            a /= 10;

            while (b > 0) {

                if (b % 10 == c) {
                    System.out.println("Число " + c + " есть в обоих числах");
                }
                b /= 10;
            }
            b = valueB;
        }
     }
}
