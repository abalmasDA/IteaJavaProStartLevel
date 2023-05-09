public class Calculator {

    public static double calculateAverage(int number1, int number2, int number3) {
        double numberAverage = (number1 + number2 + number3) / 3;
        return numberAverage;
    }

    public static void main(String[] args) {

        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        System.out.println(calculateAverage(number1, number2, number3));

    }


}
