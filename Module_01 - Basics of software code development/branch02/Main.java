package by.jonline.branch02;

// Найти max{min(a, b), min(c, d)}.

public class Main {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int c = 4;
        int d = 9;

        int min1, min2, max;

        min1 = (a >= b) ? b : a;
        System.out.println("min(" + a + "," + b + ") = " + min1);

        min2 = (c >= d) ? d : c;
        System.out.println("min(" + c + "," + d + ") = " + min2);

        max = (min1 >= min2) ? min1 : min2;
        System.out.println("max{min(" + a + "," + b + "), min(" + c + "," + d +")} = " + max);
}
}
