import java.util.Random;
import java.util.Scanner;

public class CustomerArray {
    public static Scanner inputNumberArray = new Scanner(System.in);

    public static void main(String[] args) {

        //create array (user input array size)
        System.out.print("Please, input arrayData size:");
        int arraySize = inputNumberArray.nextInt();
        int[] arrayData = new int[arraySize];

        //fill array (random number type int from 0 to 1000)
        for (int i = 0; i < arrayData.length; i++) {
            int randomNumber = new Random().nextInt(100);
            arrayData[i] = randomNumber;
        }

        //output arrayData
        System.out.print("arrayData: ");
        for (int i = 0; i < arrayData.length; i++) {
            System.out.print(arrayData[i] + " ");
        }
        System.out.println();


        // output max number of arrayData
        int maxValue = arrayData[0];
        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i] > maxValue)
                maxValue = arrayData[i];
        }
        System.out.println("Max number of arrayData = " + maxValue);


        // output max number of arrayData
        int minValue = arrayData[0];
        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i] < minValue)
                minValue = arrayData[i];
        }
        System.out.println("Min number of arrayData = " + minValue);


        // output total sum of all elements of the arrayData
        int totalSumElements = 0;
        for (int i = 0; i < arrayData.length; i++) {
            totalSumElements += arrayData[i];
        }
        System.out.println("Total sum of all elements of the arrayData = " + totalSumElements);


        // output average of the arrayData (there may be loss of precision due to data type int.)
        int numberElementsArray = 0;
        int sumElementsArray = 0;
        int averageElementsArray = 0;
        for (int i = 0; i < arrayData.length; i++) {
            numberElementsArray++;
        }
        for (int i = 0; i < arrayData.length; i++) {
            sumElementsArray += arrayData[i];

        }
        averageElementsArray = sumElementsArray / numberElementsArray;
        System.out.println("Average of the arrayData = " + averageElementsArray);


        // output odd values of the arrayData
        System.out.print("Odd values of the arrayData: ");
        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i] % 2 != 0)
                System.out.print(arrayData[i] + " ");

        }


    }


}
