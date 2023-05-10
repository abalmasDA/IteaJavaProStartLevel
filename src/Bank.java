/**
 * Використовуючи IntelliJ IDEA, створіть клас Bank. Уявіть, що ви реалізуєте програму для банку, яка допомагає визначити, погасив клієнт кредит чи ні.
 * Припустимо, щомісячна сума платежу має становити 100 грн. Клієнт має виконати 7 платежів, але може платити рідше великими сумами.
 * Тобто може двома платежами по 300 і 400 грн закрити весь борг.
 * Створіть метод, який як аргумент прийматиме суму платежу, введену економістом банку.
 * Метод виводить на екран інформацію про стан кредиту (сума заборгованості, сума переплат, повідомлення про відсутність боргу).
 */

public class Bank {
    final int AMOUNT_DEBT = 700;


    public static void getStatusCredit(int amountReceived) {
        int amountDebt = 700;
        int currentlyDebtStatus = 0;


        if (currentlyDebtStatus >= amountDebt) {
            System.out.println("The loan is repaid, there is no debt");
        } else {
            int debtToPay = amountDebt - currentlyDebtStatus;
            System.out.println("it need to pay another " + debtToPay);
        }


    }


    public static void main(String[] args) {


    }


}
