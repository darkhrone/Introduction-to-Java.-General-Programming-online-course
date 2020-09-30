package by.jonline.linear06;

//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:

public class Main {
    public static void main(String[] args) {

        int x = -4;
        int y = -3;

        boolean b = ((x <= 2 && x >= -2 && y <= 4 && y >= 0) ||
                (x <= 4 && x >= -4 && y <= 0 && y >= -3)) ? true : false;
        System.out.println(b);
    }
}
