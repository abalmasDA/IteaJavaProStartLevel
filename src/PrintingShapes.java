public class PrintingShapes {

    public static void main(String[] args) {

        //Output rectangle
        int rectangleHeight = 7;
        int rectangleWidth = 5;
        for (int i = 0; i < rectangleWidth; i++) {
            for (int j = 0; j < rectangleHeight; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        //Output right triangle
        int triangleSide = 5;
        for (int i = 0; i <= triangleSide; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        //Output equilateral triangle
        int triangleSide1 = 7;
        for (int i = 1; i <= triangleSide1; i++) {
            for (int j = triangleSide1; j > i; --j) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; ++j) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Output rhombus
        int rhombusSide = 7;
        for (int i = 1; i <= rhombusSide; i++) {
            for (int j = rhombusSide; j > i; --j) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; ++j) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = rhombusSide; i >= 1; --i) {
            for (int j = rhombusSide; j > i; --j) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; ++j) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
