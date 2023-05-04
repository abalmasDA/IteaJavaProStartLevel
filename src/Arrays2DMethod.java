public class Arrays2DMethod {

    public static int[][] additionArray(int[][] array1, int[][] array2) {

        int[][] arraySum = new int[3][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                arraySum[i][j] = array1[i][j] + array2[i][j];
                System.out.print(arraySum[i][j] + " ");
            }
            System.out.println();
        }
        return arraySum;
    }

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

        additionArray(array1, array2);


    }


}
