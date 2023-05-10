import java.util.Scanner;

/**
 * Використовуючи IntelliJ IDEA, створіть клас Bank. Уявіть, що ви реалізуєте програму для банку, яка допомагає визначити, погасив клієнт кредит чи ні.
 * Припустимо, щомісячна сума платежу має становити 100 грн. Клієнт має виконати 7 платежів, але може платити рідше великими сумами.
 * Тобто може двома платежами по 300 і 400 грн закрити весь борг.
 * Створіть метод, який як аргумент прийматиме суму платежу, введену економістом банку.
 * Метод виводить на екран інформацію про стан кредиту (сума заборгованості, сума переплат, повідомлення про відсутність боргу).
 */

public class Bank {

    public static Scanner inputDataBankEmployee = new Scanner(System.in);
    final static String EXIT_MESSAGE = "Exit";


    static int initialAmountLoan = 700;
    static int inputPaymentAmount = 0;
    static int currentAmountDeposited = 0;


    public static void getStatusCredit(int amountReceived) {
        int amountLoanDebt = initialAmountLoan - amountReceived;
        System.out.println("The current amount of loan debt:" + amountLoanDebt);

        System.out.println("The current amount of money deposited on the loan: " + currentAmountDeposited);

        if (amountLoanDebt < currentAmountDeposited) {
            System.out.println("There is no debt on the loan");
        }
        System.out.println();

    }


    public static void main(String[] args) {

        while (true) {

            System.out.println("Enter the payment amount:");
            System.out.println("To stop the program, enter: " + EXIT_MESSAGE);
            String scanner = inputDataBankEmployee.next();

            if (scanner.equalsIgnoreCase(EXIT_MESSAGE)) {
                break;
            } else {
                inputPaymentAmount = Integer.parseInt(scanner);
                currentAmountDeposited += inputPaymentAmount;
                getStatusCredit(currentAmountDeposited);
            }

            if (currentAmountDeposited >= initialAmountLoan) {
                System.out.println("No loan debt");
                break;
            }

        }
        inputDataBankEmployee.close();

    }


}






