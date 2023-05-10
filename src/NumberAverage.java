/**
 * Створіть три перевантажені методи для пошуку середнього арифметичного числа з 3, 4, 5 змінних,
 * створіть метод для пошуку мінімального, максимального та середнього значень серед цих трьох методів.
 */


public class NumberAverage {


    static int number1 = 4000;
    static int number2 = 451;
    static int number3 = 57;
    static int number4 = 1152;
    static int number5 = 890;


    public static double getAverageNumber(int number1, int number2, int number3) {
        double averageNumber3 = (number1 + number2 + number3) / 3.0;
        return averageNumber3;
    }

    public static double getAverageNumber(int number1, int number2, int number3, int number4) {
        double averageNumber4 = (number1 + number2 + number3 + number4) / 4.0;
        return averageNumber4;
    }

    public static double getAverageNumber(int number1, int number2, int number3, int number4, int number5) {
        double averageNumber5 = (number1 + number2 + number3 + number4 + number5) / 5.0;
        return averageNumber5;
    }


    public static String getExtremumAverageValue() {
        double maxValue = Math.max(getAverageNumber(number1, number2, number3), Math.max(getAverageNumber(number1, number2, number3, number4), getAverageNumber(number1, number2, number3, number4, number5)));
        double minValue = Math.min(getAverageNumber(number1, number2, number3), Math.min(getAverageNumber(number1, number2, number3, number4), getAverageNumber(number1, number2, number3, number4, number5)));
        double averageValue = (getAverageNumber(number1, number2, number3) + getAverageNumber(number1, number2, number3, number4) + getAverageNumber(number1, number2, number3, number4, number5)) - (maxValue + minValue);
        return "maxValue = " + maxValue + ", minValue = " + minValue + ", averageValue = " + averageValue;
    }


    public static void main(String[] args) {
        System.out.println(getExtremumAverageValue());

    }

}
