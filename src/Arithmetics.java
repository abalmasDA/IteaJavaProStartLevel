import java.util.Scanner;

public class Arithmetics {

    static Scanner scannerInputData = new Scanner(System.in);
    static final String INVALID_INPUT_NUMBER = "Your enter wrong format number, try again:";
    static final String INVALID_INPUT_OPERATION = "Your enter wrong operation, try again:";
    static final String DIVISION_BY_ZERO = "You can't divide by zero, enter number again";
    static final String OUTPUT_RESULT = "Result: ";

    public static double Adding(double operand1, double operand2) {
        return operand1 + operand2;
    }

    public static double Subtraction(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public static double Multiplication(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public static double Division(double operand1, double operand2) {
        double division = 0;
        while (true) {
            if (operand2 == 0) {
                while (true) {
                    System.out.println(DIVISION_BY_ZERO);
                    if (getOperand() != 0) break;
                }
            } else {
                division = operand1 / operand2;
            }
            return division;
        }
    }

    public static double getOperand() {
        System.out.print("Please, input number:");
        double number = 0;
        while (true) {
            if (scannerInputData.hasNextDouble()) {
                number = scannerInputData.nextDouble();
                break;
            } else {
                scannerInputData.next();
                System.out.print(INVALID_INPUT_NUMBER);
            }
        }
        return number;
    }

    public static char getOperation() {
        System.out.print("You need to choose one operation +, -, *, /,:");
        char sign;
        while (true) {
            if (scannerInputData.hasNext()) {
                sign = scannerInputData.next().charAt(0);
                if ((sign == '+') | (sign == '-') | (sign == '*') | (sign == '/')) break;
                System.out.print(INVALID_INPUT_OPERATION);
            }
        }
        return sign;
    }


    public static void calculation(double operand1, double operand2, char operation) {
        switch (operation) {
            case '+':
                System.out.println(OUTPUT_RESULT + Adding(operand1, operand2));
                break;
            case '-':
                System.out.println(OUTPUT_RESULT + Subtraction(operand1, operand2));
                break;
            case '*':
                System.out.println(OUTPUT_RESULT + Multiplication(operand1, operand2));
                break;
            case '/':
                System.out.println(OUTPUT_RESULT + Division(operand1, operand2));
                break;
        }
    }


    public static void main(String[] args) {
        calculation(getOperand(), getOperand(), getOperation());
        scannerInputData.close();
    }
}
