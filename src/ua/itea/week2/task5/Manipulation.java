package ua.itea.week2.task5;

public class Manipulation {
    public static void main(String[] args) {
        int x = 10;
        int y = 13;
        int z = 3;

        System.out.println(x += y - x++ * z);
        System.out.println(z = --x - y * 5);
        System.out.println(y /= x++ + 5 % z);
        System.out.println(z = x++ + y * 5);
        System.out.println(x = y - x++ * z);
    }
}
