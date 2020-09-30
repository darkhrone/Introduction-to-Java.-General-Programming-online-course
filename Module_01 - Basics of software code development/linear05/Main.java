package by.jonline.linear05;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.

public class Main {
    public static void main(String[] args) {

        int T = 9060;

        int HH = T / 3600;
        int MM = (T - HH * 3600) / 60;
        int SS = T - HH * 3600 - MM * 60;

        System.out.println(HH + "ч " + MM + "м " + SS+"c ");

    }
}
