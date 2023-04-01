package ua.itea.week2.task8;
import java.util.Scanner;
public class Volume {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        double radius;
        double height;
        System.out.println("Input radius and height of cylinder (in format double):");
              while (true) {
            if (Scanner.hasNextDouble()) {
                radius = Scanner.nextDouble();
                height = Scanner.nextDouble();
                break;
            } else {
                Scanner.next();
                System.out.print("Your enter wrong format, try again:");
            }
        }

        double areaSurfaceCylinder = 2 * Math.PI * radius * (radius + height);
        double volumeCylinder = Math.PI * Math.pow(radius, 2) * height;

        System.out.println("areaSurfaceCylinder = " + areaSurfaceCylinder);
        System.out.println("volumeCylinder = " + volumeCylinder);
    }
}
