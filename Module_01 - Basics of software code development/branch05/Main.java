package by.jonline.branch05;

// Вычислить значение функции F(x)

public class Main {
    public static void main(String[] args) {

        double[] array_x = {2.9, 3.1};
        double result;

        for (double tmpX : array_x) {
            result = (tmpX <= 3) ? (Math.pow(tmpX, 2) - 3 * tmpX + 9) : (1 / (Math.pow(tmpX, 3) + 2));
            System.out.println("F(x) = " + result);
        }
    }
}
