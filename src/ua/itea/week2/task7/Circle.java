package ua.itea.week2.task7;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner Radius = new Scanner(System.in);

        final double Pi = 3.1415926536;
        double radius = Radius.nextDouble();
        double circleArea = Pi * Math.pow(radius, 2);
        System.out.println(circleArea);


    }
}
