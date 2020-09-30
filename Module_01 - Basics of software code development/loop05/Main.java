package by.jonline.loop05;

 /* Даны  числовой  ряд  и  некоторое  число  е.  Найти  сумму  тех  членов ряда,  модуль  которых  больше
 или  равен заданному е. Общий член ряда имеет вид: a(n-ый) = 1/2(в степени n)+1/3(в степени n) */

public class Main {
    public static void main(String[] args) {

        int n = 100;
        double sum = 0.0;
        double e = 0.001;

        for (int i = 1; i <= n; i++) {

            double a = 1.0 / Math.pow(2.0, i);
            double b = 1.0 / Math.pow(3.0, i);

            if ((Math.abs(a) >= e) || (Math.abs(b) >= e)) {
                sum += (a + b);
                System.out.println(i);
                System.out.print(a + " + ");
                System.out.print(b + " = ");
                System.out.println(a + b);
                System.out.println("sum = sum + (a + b) = " + sum);
            } else break;
        }

        System.out.println("Искомая сумма ряда: " + sum);

    }

}

