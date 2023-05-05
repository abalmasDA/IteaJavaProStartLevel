
//Використовуючи IntelliJ IDEA, створіть клас Conversion. Напишіть програму, яка конвертуватиме валюти. Користувач вводить:
//        1)      суму грошей у певній валюті;
//        2)      курс конвертації в іншу валюту.
//        Організуйте виведення результату операції конвертування валюти на екран.

import java.util.Arrays;
import java.util.Scanner;

public class ConversionCurrency {
    public static Scanner scannerInputData = new Scanner(System.in);
    static final String[] POSSIBLE_CURRENCY_IN_CONVERTER = {"Hryvnia", "Dollar", "Euro", "Pound sterling"};
    static final String NO_MATCH_MESSAGE = "You entered currency that is not in the converter";
    static final String INVALID_INPUT_NUMBER = "Your enter wrong format number, try again:";

    public static String getCurrencyToConvert(String[] currencyToConvert) {
        System.out.println(Arrays.toString(POSSIBLE_CURRENCY_IN_CONVERTER));
        System.out.println("Please input currency to convert:");
        String currency = scannerInputData.next();
        for (int i = 0; i < POSSIBLE_CURRENCY_IN_CONVERTER.length; i++) {
            if (POSSIBLE_CURRENCY_IN_CONVERTER[i].equalsIgnoreCase(currency)) {
                return POSSIBLE_CURRENCY_IN_CONVERTER[i];
            }
        }
        return NO_MATCH_MESSAGE;
    }

    public static double getAmountToConvert() {
        System.out.print("Please, input amount to convert:");
        double amount = 0;
        while (true) {
            if (scannerInputData.hasNextDouble()) {
                amount = scannerInputData.nextDouble();
                break;
            } else {
                scannerInputData.next();
                System.out.print(INVALID_INPUT_NUMBER);
            }
        }
        return amount;
    }

    public static void main(String[] args) {
        String currencyToConvert = getCurrencyToConvert(POSSIBLE_CURRENCY_IN_CONVERTER);
        double amountToConvert = getAmountToConvert();

        switch (currencyToConvert) {
            case "Hryvnia":
                System.out.println(amountToConvert + " Hryvnia = " + (amountToConvert * 0.027) + " Dollar");
                System.out.println(amountToConvert + " Hryvnia = " + (amountToConvert * 0.024) + " Euro");
                System.out.println(amountToConvert + " Hryvnia = " + (amountToConvert * 0.021) + " Pound Sterling");
                break;
            case "Dollar":
                System.out.println(amountToConvert + " Dollar = " + (amountToConvert * 37) + " Hryvnia");
                System.out.println(amountToConvert + " Dollar = " + (amountToConvert * 0.91) + " Euro");
                System.out.println(amountToConvert + " Dollar = " + (amountToConvert * 0.79) + " Pound Sterling");
                break;
            case "Euro":
                System.out.println(amountToConvert + " Euro = " + (amountToConvert * 41) + " Hryvnia");
                System.out.println(amountToConvert + " Euro = " + (amountToConvert * 1.1) + " Dollar");
                System.out.println(amountToConvert + " Euro = " + (amountToConvert * 0.87) + " Pound Sterling");
                break;
            case "Pound sterling":
                System.out.println(amountToConvert + " Pound sterling = " + (amountToConvert * 47) + " Hryvnia");
                System.out.println(amountToConvert + " Pound sterling = " + (amountToConvert * 1.26) + " Dollar");
                System.out.println(amountToConvert + " Pound sterling = " + (amountToConvert * 1.15) + " Euro");
                break;

        }


    }

}
