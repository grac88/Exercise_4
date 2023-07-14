package com.max.idea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите а[" + i +"] = ");
            array[i] = scanner.nextInt();
        }
        double result = 0;
        for (double d : array) {
            result += d;
        }
        double average = result / array.length;
        System.out.println("Среднее арифметическое = " + average);

        double result1 = average / 2;
        double result2 = (int)Math.floor(result1);

        if (result2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
