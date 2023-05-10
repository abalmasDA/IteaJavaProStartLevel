/**
 * Використовуючи IntelliJ IDEA, створіть клас Calculator. Створіть метод з ім'ям calculate,
 * який приймає як параметри три цілих аргументи та виводить на екран середнє арифметичне значень аргументів.
 */

public class Calculator {

    public static double calculateAverage(int number1, int number2, int number3) {
        double numberAverage = (number1 + number2 + number3) / 3.0;
        return numberAverage;
    }

    public static void main(String[] args) {

        int number1 = 2;
        int number2 = 4;
        int number3 = 4;
        System.out.println(calculateAverage(number1, number2, number3));

    }


}
