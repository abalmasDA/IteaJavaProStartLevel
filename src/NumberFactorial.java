

public class NumberFactorial {


    public static void main(String[] args) {


        int n = 5;
        double factorial = 1;
        double sum = 0;

        for (int i = 1; i < n; i++) {
            factorial *= i;
            sum += 1 / (factorial);
        }
        System.out.println(sum);

    }


}
