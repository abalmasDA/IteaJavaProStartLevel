/*Опишіть метод PowerA3(A, B), який обчислює третій ступінь числа A і повертає її до змінної B
(A – вхідний, B – вихідний параметр; обидва параметри є дійсними). За допомогою цієї процедури знайдіть третій ступінь п'яти зазначених чисел.
 */


public class Pow1 {

    public static double powerA3(double a, double b) {
        b = Math.pow(a, 3);
        return b;
    }

    public static void main(String[] args) {

        double value1 = 3;
        double value2 = 5;
        double value3 = 7;
        double value4 = 9;
        double value5 = 15;
        double param2 = 0;

        System.out.println(powerA3(value1, param2));
        System.out.println(powerA3(value2, param2));
        System.out.println(powerA3(value3, param2));
        System.out.println(powerA3(value4, param2));
        System.out.println(powerA3(value5, param2));

    }
}
