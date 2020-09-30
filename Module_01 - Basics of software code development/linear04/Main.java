package by.jonline.linear04;

//    Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//    дробную и целую части числа и вывести полученное значение числа

public class Main {
    public static void main(String[] args) {

        double R = 987.789;

        int tmp1 = (int) R;         // number before dot
        double tmp2 = R - tmp1;     // number after dot

        double result = Math.round(tmp2 * 1000) + (double)tmp1 / 1000;
        System.out.println(R + "\n" + result);

    }
}