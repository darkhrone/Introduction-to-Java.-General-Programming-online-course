package by.jonline.loop04;

// Составить программу нахождения произведения квадратов первых двухсот чисел;

public class Main {
    public static void main(String[] args) {

        int s = 1;

        for (int i = 1; i <= 200; i++) {
            System.out.print(s + " * " + (i * i) + " = ");
            s = s * (i * i);
            System.out.println(s);

            if (s < 0) {
                System.out.println("На шаге № " + i + " превышено допустимое значение для целочисленного типа");
                break;
            }

        }

    }

}




