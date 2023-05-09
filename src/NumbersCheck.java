/* Використовуючи IntelliJ IDEA, створіть клас NumbersCheck. Напишіть метод, який визначатиме:
1) чи є введене число позитивним, чи негативним;
2) чи є воно простим (використовуйте техніку перебору значень).
Просте число – це натуральне число, яке ділиться на 1 й саме на себе. Щоби визначити просте число чи ні, варто знайти всі його цілі дільники.
Якщо дільників більше 2-х, то воно не просте;
3) чи ділиться воно на 2, 5, 3, 6, 9 без залишку.*/

public class NumbersCheck {

    public static void checkIsPositiveNegativeNumber(int numberToCheck) {
        if (numberToCheck > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }


    public static void checkIsPrimeNumber(int numberToCheck) {
        boolean primeNumber = false;
        if (numberToCheck < 2) {
            primeNumber = false;
        } else {
            primeNumber = true;
        }
        for (int j = 2; j <= numberToCheck / 2; j++) {
            if (numberToCheck % j == 0) {
                primeNumber = false;
                break;
            }
        }
        if (primeNumber) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }


    public static void checkDivisibleNumber(int numberToCheck) {

        if (numberToCheck % 2 == 0) {
            System.out.println("number is divisible by 2");
        }


        if (((numberToCheck % 5) == 5) | ((numberToCheck % 5) == 0)) {
            System.out.println("number is divisible by 5");
        }


        int sumNumber = 0;
        for (int i = numberToCheck; i != 0; i /= 10) {
            sumNumber += (i % 10);
        }
        if (sumNumber % 3 == 0) {
            System.out.println("number is divisible by 3");
        }


        if (((sumNumber % 3) == 0) && ((numberToCheck % 2) == 0)) {
            System.out.println("number is divisible by 6");
        }


        int sumNumber1 = 0;
        for (int i = numberToCheck; numberToCheck != 0; numberToCheck /= 10) {
            sumNumber += (numberToCheck % 10);
        }
        if (sumNumber % 9 == 0) {
            System.out.println("number is divisible by 9");
        }


    }


    public static void main(String[] args) {

        int number = 282;

        checkIsPositiveNegativeNumber(number);
        checkIsPrimeNumber(number);
        checkDivisibleNumber(number);


    }

}
