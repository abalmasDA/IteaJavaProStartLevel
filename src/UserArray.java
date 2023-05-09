public class UserArray {

    public static int[] addingLastNumberArray(int[] array, int additionalLastNumber) {
        int[] arrayAdd = new int[array.length + 1];
        for (int i = 0; i <= array.length; i++) {
            if (i == array.length) {
                arrayAdd[i] = additionalLastNumber;
                System.out.print(arrayAdd[i] + " ");
            } else {
                arrayAdd[i] = array[i];
                System.out.print(arrayAdd[i] + " ");
            }
        }
        return arrayAdd;
    }

    public static int[] addingFirstNumberArray(int[] array, int additionalFirstValue) {
        int[] arrayFirstNumberAdd = new int[array.length + 1];
        for (int i = 0; i <= array.length; i++) {
            if (i == 0) {
                arrayFirstNumberAdd[i] = additionalFirstValue;
                System.out.print(arrayFirstNumberAdd[i] + " ");
            } else {
                arrayFirstNumberAdd[i] = array[i - 1];
                System.out.print(arrayFirstNumberAdd[i] + " ");
            }
        }
        return arrayFirstNumberAdd;
    }






    public static void main(String[] args) {
        int[] arrayData = {5, 4, 7, 8, 4};
        int additionalLastNumber = 9;
        addingLastNumberArray(arrayData, additionalLastNumber);

        System.out.println();

        int[] array = {4, 45, 782, 47, 66, 32, 95};
        int additionalFirstValue = 10;
        addingFirstNumberArray(array, additionalFirstValue);






    }

}
