public class FibonacciSequence {

    public static void main(String[] args) {

        int initialNumber = 5;
        int endNumber = 15;
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
