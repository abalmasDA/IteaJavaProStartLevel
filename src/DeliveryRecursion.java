/**
 * Є N клієнтів, яким компанія-виробник має доставити товар. Скільки є можливих маршрутів доставлення товару з урахуванням того,
 * що товар доставлятиме одна машина? Використовуючи IntelliJ IDEA, створіть клас Delivery. Напишіть програму, яка розраховуватиме та
 * виводитиме на екран кількість можливих варіантів доставлення товару. Для розв'язку задачі, використовуйте факторіал N!, що розраховується рекурсією.
 * Поясніть, чому не рекомендується використовувати рекурсію для розрахунку факторіала. Вкажіть слабкі місця цього підходу.
 */


public class DeliveryRecursion {

    final public static int FACTORIAL01 = 1;

    public static int getPossibleDeliveryOptions(int numberClients) {
        int possibleDeliveryOptions;
        if (numberClients == 0 || numberClients == 1) {
            return FACTORIAL01;
        }
        possibleDeliveryOptions = numberClients * getPossibleDeliveryOptions(numberClients - 1);
        return possibleDeliveryOptions;
    }

    public static void main(String[] args) {
        int numberClients = 7;
        if (numberClients < 0) {
            System.out.println("You cannot calculate possible delivery options for negative number clients");
        } else {
            System.out.println("Possible delivery options for " + numberClients + " clients is " + getPossibleDeliveryOptions(numberClients));
        }
    }
}
