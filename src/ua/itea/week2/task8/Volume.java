package ua.itea.week2.task8;

import java.util.Scanner;

public class Volume {

    public static void main(String[] args) {
        Scanner Scaner = new Scanner(System.in);

        System.out.println("Input radius of cylinder:");
        double radius = Scaner.nextDouble();
        System.out.println("Input height of cylinder:");
        double height = Scaner.nextDouble();
        double areaSurfaceCylinder = 2 * Math.PI * radius * (radius + height);
        double VolumeCylinder = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("areaSurfaceCylinder = " + areaSurfaceCylinder);
        System.out.println("VolumeCylinder = " + VolumeCylinder);
    }
}
