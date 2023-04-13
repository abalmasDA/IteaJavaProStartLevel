package ua.itea.week4.task3;

import java.util.Scanner;

public class Interval {

    static Scanner scannerInput = new Scanner(System.in);

    public static void main(String[] args) {

        int number = getNumber();
        int result = range(number);

    }

    public static int getNumber() {
        System.out.print("Please, input one number from 1 to 100:");
        int i = 0;
        while (true) {
            if (scannerInput.hasNextInt()) {
                i = scannerInput.nextInt();
                if (i >= 0 && i <= 100) {
                    break;
                } else {
                    System.out.print("You entered the number is not in the range from 1 to 100, please try again:");
                }
            } else {
                scannerInput.next();
                System.out.print("You entered the wrong number format, please try again:");
            }
        }
        return i;
    }

    public static int range(int number) {

        int k=0;

        if (number >= 0 && number <= 14) {
            k = number;
            System.out.println("Your number is between 0 and 14");

        } else if (number >= 15 && number <= 35) {
            k = number;
            System.out.println("Your number is between 15 and 35");

        } else if (number >= 36 && number <= 50) {
            k = number;
            System.out.println("Your number is between 36 and 50");

        } else if (number >= 50 && number <= 100) {
            k = number;
            System.out.println("Your number is between 50 and 100");
        }
        return k;
    }


}