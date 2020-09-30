package by.jonline.linear03;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Main {
    public static void main(String[] args) {

        double x = 1;
        double y = 1;

        double result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

        System.out.println(result);
    }
}
