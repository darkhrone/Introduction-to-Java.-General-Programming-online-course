package by.jonline.decomp_methods;

// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9

public class Task_07 {

    public static void main(String[] args) {

        int sum;
        int f;
        sum = 0;

        for (int i = 1; i < 10; i += 2) {
            System.out.print("!" + i);
            f = factorial(i);

            sum += f;
            System.out.println(" = " + f);
            //System.out.println(" сумма = " + sum);
        }

        System.out.println("сумма факториалов всех нечетных чисел от 1 до 9 = " + sum);
    }

    public static int factorial(int i) {

        int f = 1;

        for (int j = 1; j <= i; j++) {
            f *= j;
        }

        return f;
    }

}
