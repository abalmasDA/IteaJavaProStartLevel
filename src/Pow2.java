
/**
 * Опишіть метод PowerA234(A, B, C, D), який обчислює другий, третій і четвертий ступінь числа A і повертає ці ступені відповідно до змінних B, C і D
 * (A – вхідний, B, C, D – вихідні параметри; усі параметри є дійсними).
 * За допомогою цієї процедури знайдіть другий, третій і четвертий ступені п'яти зазначених чисел.
 */


public class Pow2 {

    public static String powerA234(double a, double b, double c, double d) {
        b = Math.pow(a, 2);
        c = Math.pow(a, 3);
        d = Math.pow(a, 4);
        return "pow2 = " + b + " " + "pow3 = " + c + " " + "pow4 = " + d;
    }


    public static void main(String[] args) {

        double value1 = 3;
        double value2 = 5;
        double value3 = 7;
        double value4 = 9;
        double value5 = 15;
        double param2 = 0;

        System.out.println(powerA234(value1, param2, param2, param2));
        System.out.println(powerA234(value2, param2, param2, param2));
        System.out.println(powerA234(value3, param2, param2, param2));
        System.out.println(powerA234(value4, param2, param2, param2));
        System.out.println(powerA234(value5, param2, param2, param2));

    }


}
