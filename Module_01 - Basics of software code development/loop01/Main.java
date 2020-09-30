package by.jonline.loop01;

//пользователь вводит любое целое положительное число, а программа суммирует все числа от 1 до введенного пользователем числа.

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите число >> ");

        int number = sc.nextInt();
        int sumOfNums = 0;
        int totalSum = 0;

        for (int i = 1; i <= number; i++) {

            sumOfNums += i;

            if (sumOfNums > 0) {
                totalSum = sumOfNums;
            } else {
                System.out.println("ПРОИЗОШЛО ПЕРЕПОЛНЕНИЕ ТИПА int");
                System.out.println("ВВОДИМОЕ ЧИСЛО НЕ ДОЛЖНО ПРЕВЫШАТЬ " + (i - 1));
                break;
            }
        }

        System.out.println("\nСумма всех чисел = " + totalSum);
    }
}
