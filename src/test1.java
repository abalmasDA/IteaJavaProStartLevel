import java.util.Arrays;

public class test1 {


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


        int[] sourceListOne = {1, 2, 3, 4, 5};
        int[] increasedArray = increaseArrayLength(sourceListOne);

        System.out.println(Arrays.toString(increasedArray));

        int[] sourceListTwo = {1, 2, 3, 4, 5, 6, 7};
        int additionalFirstValue = 42;
        int[] shiftedArray = addingFirstNumberArray(sourceListTwo, additionalFirstValue);

        System.out.println(increasedArray);

        System.out.println(Arrays.toString(shiftedArray));


    }
}