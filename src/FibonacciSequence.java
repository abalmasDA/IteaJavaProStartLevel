import java.util.Scanner;

public class FibonacciSequence {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter initial number fibonacci sequence:");
        int initialNumber = scanner.nextInt();
        System.out.print("Enter end number fibonacci sequence:");
        int endNumber = scanner.nextInt();
        int[] arrayFibonacci = new int[endNumber];
        arrayFibonacci[0] = 0;
        arrayFibonacci[1] = 1;

        // fill array
        for (int i = 2; i < arrayFibonacci.length; ++i) {
            arrayFibonacci[i] = arrayFibonacci[i - 1] + arrayFibonacci[i - 2];

        }

        // output the value in the required range
        for (int i = initialNumber; i < arrayFibonacci.length; ++i) {
            System.out.print(arrayFibonacci[i] + " ");
        }
    }
}
