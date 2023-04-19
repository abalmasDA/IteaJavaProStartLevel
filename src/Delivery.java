import java.util.Scanner;

public class Delivery {
    static Scanner scannerInputClients = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the number of clients:  ");
        int numberClients = scannerInputClients.nextInt();
        int factorial = 1;

        do {
            factorial *= numberClients;
            numberClients--;
        } while (numberClients > 0);

        System.out.println("Possible delivery routes: " + factorial);
        scannerInputClients.close();

    }


}
