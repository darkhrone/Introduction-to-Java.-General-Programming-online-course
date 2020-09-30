package by.jonline.loop07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

// Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
// m и n вводятся с клавиатуры

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter first number");
        int m = Integer.parseInt(reader.readLine());

        System.out.println("enter second number");
        int n = Integer.parseInt(reader.readLine());

        final long startTime = System.currentTimeMillis();  // start time  value

        int counter = 0;

        for (int i = m; i <= n; i++) {

            counter++;

            if (counter == 10) {
                System.out.println();
                System.out.println((char) 27 + "[31m__________________________________________________________________" +
                        "_____________________________________________________________________________________________" +
                        "_______________________________________________________________________ " + (char) 27 + "[0m");
                counter = 0;
            }

            for (int j = 2; j <= n; j++) {
                if ((i % j == 0) && (i != j)) {
                    System.out.print(i + " " + j + "\t\t");
                }
            }

        }

        System.out.println();

        final long endTime = System.currentTimeMillis();    // stop time  value
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");
    }
}

