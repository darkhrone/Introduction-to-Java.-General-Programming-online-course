package by.jonline.linear02;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Main {
    public static void main(String[] args) {

        double a = 6.0;
        double b = 1.0;
        double c = 2.0;

        double temp1;
        double temp2;
        double res;

        temp1 = (b + Math.sqrt(b * b + 4.0 * a * c)) / 2.0 * a;
        temp2 = a * a * a * c + Math.pow(b, (-2.0));
        res = temp1 - temp2;

        System.out.println("result = " + res);
    }
}
