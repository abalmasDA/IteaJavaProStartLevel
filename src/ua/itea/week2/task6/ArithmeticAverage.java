package ua.itea.week2.task6;

import java.util.Scanner;

public class ArithmeticAverage {

    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.println("Input integer number 1:");
        int number1 = numbers.nextInt();
        System.out.println("Input integer number 2:");
        int number2 = numbers.nextInt();
        System.out.println("Input integer number 3:");
        int number3 = numbers.nextInt();
        double arithmeticAverage = (double) (number1 + number2 + number3) / 3;

        System.out.println("Arithmetic Average = " + arithmeticAverage);


    }
}
