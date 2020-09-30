package by.jonline.branch03;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Main {
    public static void main(String[] args) {

        double x_1 = 1.5;
        double y_1 = 1.5;

        double x_2 = 4.1;
        double y_2 = 4.1;

        double x_3 = 3.5;
        double y_3 = 3.5;

        if ((x_3 - x_1) / (x_2 - x_1) == (y_3 - y_1) / (y_2 - y_1)) //Точки 1, 2, 3 - лежат на одной прямой
        {
            System.out.println(" Точки А(х1,у1), В(х2,у2) и С(х3,у3) - лежат на одной прямой ");
        } else {
            System.out.println(" Точки А(х1,у1), В(х2,у2) и С(х3,у3) - НЕ лежат на одной прямой !");
        }
    }
}
