public class Number {

    static int a = 10;
    static int b = 12;
    static int sum = 0;

    public static void main(String[] args) {

        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
