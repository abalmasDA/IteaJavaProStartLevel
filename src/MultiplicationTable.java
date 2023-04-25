public class MultiplicationTable {
    final static int NUMBER = 7;
    final static int POWER_OF_NUMBER = 20;

    public static void main(String[] args) {

        for (int i = 1; i <= POWER_OF_NUMBER; i++) {

            System.out.printf("%d * %d = %d;\n", NUMBER, i, NUMBER * i);
        }

    }
}
