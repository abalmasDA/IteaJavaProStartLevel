package week4.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Translator {
    public static Scanner scannerInputWords = new Scanner(System.in);
    static String[] wordsUkr = {"Дощ", "Вітер", "Сніг", "Сонце", "Гроза", "Молнія", "Торнадо", "Циклон", "Погода", "Температура"};

    public static void main(String[] args) {
        System.out.println("The translator can only translate the following 10 words, please enter one of them:");
        System.out.println(Arrays.toString(wordsUkr));
        String wordsTranslation = getVerificationWord();
        System.out.println(wordsTranslation);

    }

    public static String getVerificationWord() {
        String i = "0";
        String wordInput = scannerInputWords.next();
        String x = wordInput.substring(0, 1).toUpperCase() + wordInput.substring(1);
        scannerInputWords.close();
        if (wordsUkr[0].equals(x)) {
            i = "Дощ - Rain";
        } else if (wordsUkr[1].equals(x)) {
            i = "Вітер - Wind";
        } else if (wordsUkr[2].equals(x)) {
            i = "Сніг - Snow";
        } else if (wordsUkr[3].equals(x)) {
            i = "Сонце - Sun";
        } else if (wordsUkr[4].equals(x)) {
            i = "Гроза - Thunderstorm";
        } else if (wordsUkr[5].equals(x)) {
            i = "Молнія - Lightning";
        } else if (wordsUkr[6].equals(x)) {
            i = "Торнадо - Tornado";
        } else if (wordsUkr[7].equals(x)) {
            i = "Циклон - Cyclone";
        } else if (wordsUkr[8].equals(x)) {
            i = "Погода - Weather";
        } else if (wordsUkr[9].equals(x)) {
            i = "Температура - Temperature";
        } else {
            i = "You entered a word that is not in the translator";
        }
        return i;

    }

}




