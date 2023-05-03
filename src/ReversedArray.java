public class ReversedArray {

    public static int[] myReverse(int[] arrayData) {
        int[] reverseOutput = new int[arrayData.length];
        for (int i = arrayData.length - 1, j = 0; i >= 0; i--, j++) {
            reverseOutput[j] = arrayData[i];
            System.out.print(reverseOutput[j] + " ");
        }
        return reverseOutput;
    }

    public static int[] subArray(int[] array, int index, int count) {
        int[] subArray = new int[count];
        for (int i = index, j = 0; j <= count - 1; i++, j++) {
            if (i <= array.length - 1) {
                subArray[j] = array[i];
                System.out.print(subArray[j] + " ");
            } else {
                subArray[j] = 1;
                System.out.print(subArray[j] + " ");
            }
        }
        return subArray;
    }

    public static void main(String[] args) {
        int[] arrayData = {1, 2, 5, 45, 77};
        myReverse(arrayData);

        System.out.println();
        int[] array = {2, 2, 5, 4, 2, 3, 4, 5, 4, 2};
        int arrayIndex = 5;
        int arrayCount = 25;
        subArray(array, arrayIndex, arrayCount);


    }
}
