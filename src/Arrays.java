public class Arrays {

    public static void main(String[] args) {

        int[] array = {5, 7, 1, 2, 89, 56, 77, 45, 89, 25};

        int arrayNumberElements = 0;
        for (int i = 0; i < array.length; i++) {
            arrayNumberElements++;
        }
        for (int i = arrayNumberElements - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }


    }

}
