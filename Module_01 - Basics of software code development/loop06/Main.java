package by.jonline.loop06;

// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int int_ch;

        System.out.println("Введите символ >>");

        Scanner sc = new Scanner(System.in);

        while (!sc.hasNext("end")) {

            char ch = sc.next().charAt(0);
            int_ch = ch;
            System.out.println("символ \'" + ch + "\' соответствует численному значению " + int_ch);
            System.out.println("Для завершения работы введите end, для продолжения введите следующий символ >>");

        }

    }

}

