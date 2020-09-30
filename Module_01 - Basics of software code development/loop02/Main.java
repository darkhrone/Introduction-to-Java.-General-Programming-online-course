package by.jonline.loop02;

//Вычислить значения функции на отрезке [а,b] c шагом h;

public class Main {
    public static void main(String[] args) {

        double a;
        double b;
        double x;
        double y;
        double h;

        a = -2.5;
        b = 5.6;
        h = 0.25;

        for (x = a; x <= b; x += h) {

            System.out.print("x= " + x + ", ");

            if (x <= 2) {
                y = (-x);
                System.out.println("y =" + y);
            } else if (x > 2) {
                y = x;
                System.out.println("y =" + y);
            }

        }
    }
}
