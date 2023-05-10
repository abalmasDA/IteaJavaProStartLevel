/**
 * Використовуючи IntelliJ IDEA, створіть клас Calculator.
 * Створіть метод з ім'ям calculate, який приймає як параметри три цілочислові значення та повертає значення кожного аргументу, поділеного на 5.
 */

public class Calculator1 {

    public static String calculate(int number1, int number2, int number3) {
        double number1Divided = number1 / 5.0;
        double number2Divided = number2 / 5.0;
        double number3Divided = number3 / 5.0;
        return "Number1 divided by 5 = " + number1Divided + ", Number2 divided by 5 = " + number2Divided + ", Number3 divided by 5 = " + number3Divided;
    }

    public static void main(String[] args) {
        int number1 = 46;
        int number2 = 57;
        int number3 = 10;

        System.out.println(calculate(number1, number2, number3));

    }
}
