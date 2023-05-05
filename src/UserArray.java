public class UserArray {

//    public static int[] addingLastNumberArray(int[] array, int additionalLastNumber) {
//        int[] arrayAdd = new int[array.length + 1];
//        for (int i = 0; i <= array.length; i++) {
//            if (i == array.length) {
//                arrayAdd[i] = additionalLastNumber;
//                System.out.print(arrayAdd[i] + " ");
//            } else {
//                arrayAdd[i] = array[i];
//                System.out.print(arrayAdd[i] + " ");
//            }
//        }
//        return arrayAdd;
//    }

//    public static int[] addingFirstNumberArray(int[] array, int additionalFirstValue) {
//        int[] arrayFirstNumberAdd = new int[array.length + 1];
//        for (int i = 0; i <= array.length; i++) {
//            if (i == 0) {
//                arrayFirstNumberAdd[i] = additionalFirstValue;
//                System.out.print(arrayFirstNumberAdd[i] + " ");
//            } else {
//                arrayFirstNumberAdd[i] = array[i - 1];
//                System.out.print(arrayFirstNumberAdd[i] + " ");
//            }
//        }
//        return arrayFirstNumberAdd;
//    }


    static final int ADDITIONAL_LENGTH = 1;

    public static int[] increaseArrayLength(int[] source) {
        int[] result = new int[source.length + ADDITIONAL_LENGTH];
        for (int i = 0; i < source.length; i++) {
            result[i] = source[i];
        }
        return result;
    }

    public static int[] addingFirstNumberArray(int[] source, int additionalFirstValue) {
        int[] result = increaseArrayLength(source);
        for (int i = 1; i <= source.length; i++) {
            result[i] = source[i - 1];
        }
        result[0] = additionalFirstValue;
        return result;
    }


    public static void main(String[] args) {
//        int[] arrayData = {5, 4, 7, 8, 4};
//        int additionalLastNumber = 9;
//        addingLastNumberArray(arrayData, additionalLastNumber);

//        System.out.println();
//
//        int[] array = {4, 45, 782, 47, 66, 32, 95};
//        int additionalFirstValue = 10;
//        addingFirstNumberArray(array, additionalFirstValue);

        int[] sourceListOne = {1, 2, 3, 4, 5};
        int[] increasedArray = increaseArrayLength(sourceListOne);

//        System.out.println(Arrays.toString(increasedArray));

        int[] sourceListTwo = {1, 2, 3, 4, 5, 6, 7};
        int additionalFirstValue = 42;
        int[] shiftedArray = addingFirstNumberArray(sourceListTwo, additionalFirstValue);

//        System.out.println(Arrays.toString(shiftedArray));


    }

}
