package ua.itea;

public class SumMin {

    public static void main(String[] args) {
        int a = 7;
        int b = 15;
        int sum = 0;

        for (int i = (a + 1); i < b; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers: " + sum);


        for (int i = a + 1; i < b; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
    }

}
