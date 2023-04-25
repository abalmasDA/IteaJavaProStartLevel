public class Rectangle {

    static String fillSymbols = "* ";
    static String emptySymbols = "  ";

    public static void main(String[] args) {

        //Output filled rectangle
        int rectangleHeight1 = 5;
        int rectangleWidth1 = 10;
        for (int i = 0; i < rectangleWidth1; i++) {
            for (int j = 0; j < rectangleHeight1; j++) {
                System.out.print(fillSymbols + " ");
            }
            System.out.print("\n");
        }


        System.out.println();


        //Output empty rectangle
        int rectangleWidth2 = 5;
        int rectangleHeight2 = 10;
        for (int i = 0; i < rectangleHeight2; i++) {
            for (int j = 0; j < rectangleWidth2; j++) {
                if (i == 0 || i == rectangleHeight2 - 1 || j == 0 || j == rectangleWidth2 - 1) {
                    System.out.print(fillSymbols);
                } else {
                    System.out.print(emptySymbols );
                }
            }
            System.out.print("\n");
        }
    }


}
