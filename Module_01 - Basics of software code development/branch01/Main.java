package by.jonline.branch01;

// Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным

public class Main {
    public static void main(String[] args) {

        int angle1 = 90;
        int angle2 = 80;

        int check = 180 - (angle1 + angle2);

        String answer = (check > 0 && angle1 == 90 ^ angle2 == 90 ^ check == 90) ? " Triangle is exist and it's a right triangle" :
                (check > 0) ? "Triangle is exist" : "Triangle isn't exist";

        System.out.println(answer);
    }
}
