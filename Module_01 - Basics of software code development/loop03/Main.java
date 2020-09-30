package by.jonline.loop03;

// Найти сумму квадратов первых ста чисел.

public class Main {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i * i;
            String msg = (i>1) ? ("Сумма квадратов первых " + i +" чисел = "+ sum) : ("Квадрат 1 = " + sum);
            System.out.println(msg);
        }

    }
}


