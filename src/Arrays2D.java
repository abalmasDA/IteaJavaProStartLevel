public class Arrays2D {

    public static void main(String[] args) {
        int[][] array1 = {
                {3, 5, 7},
                {4, 1, 8},
                {2, 6, 3},
        };
        int[][] array2 = {
                {11, 2, 4},
                {24, 17, 14},
                {1, 4, 9},
        };
        int[][] arraySum = new int[3][3];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                arraySum[i][j] = array1[i][j] + array2[i][j];
                System.out.print(arraySum[i][j] + " ");
            }
            System.out.println();
        }


    }


}
