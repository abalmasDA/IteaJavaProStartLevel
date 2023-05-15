import java.util.Arrays;

/**
 * Створити клас "Матриця".
 * Клас повинен мати такі змінні:
 * 1. двовимірний масив речових чисел;
 * 2. кількість рядків та стовпців у матриці.
 * Клас повинен мати такі методи:
 * 1. додавання двовимірного масиву до двовимірного масиву;
 * 2. множення двовимірного масиву на число;
 * 3. виведення на друк обʼєкту Матриця;
 * 4. виведення на друк двовимірного масив після операцій над ним;
 * 5. множення двовимірного масиву на двовимірний масив.
 */

public class Matrix {
    private double[][] someMatrix;
    private int matrixRows;
    private int matrixColumns;

    public Matrix(int matrixRows, int matrixColumns) {
        this.matrixRows = matrixRows;
        this.matrixColumns = matrixColumns;
        this.someMatrix = new double[matrixRows][matrixColumns];
    }


    public void addingMatrix(double[][] matrixToAdding) {
        for (int i = 0; i < matrixToAdding.length; i++) {
            for (int j = 0; j < matrixToAdding.length; j++) {
                this.someMatrix[i][j] = this.someMatrix[i][j] + matrixToAdding[i][j];
            }
        }
    }


    public void multiplicationMatrixByNumber(double numberToMultiplication) {
        for (int i = 0; i < this.someMatrix.length; i++) {
            for (int j = 0; j < this.someMatrix.length; j++) {
                this.someMatrix[i][j] = this.someMatrix[i][j] * numberToMultiplication;
            }
        }
    }


    public void multiplicationMatrixByMatrix(double[][] matrixToMultiplication) {
        for (int i = 0; i < matrixToMultiplication.length; i++) {
            for (int j = 0; j < matrixToMultiplication.length; j++) {
                this.someMatrix[i][j] = this.someMatrix[i][j] * matrixToMultiplication[i][j];
            }
        }
    }


    @Override
    public String toString() {
        return "Matrix{" +
                "someMatrix=" + Arrays.deepToString(this.someMatrix) +
                ", matrixRows= " + matrixRows +
                ", matrixColumns= " + matrixColumns +
                '}';
    }

    public static void main(String[] args) {

        double[][] matrixTestMethod = {
                {1.5, 5.58, 5.6},
                {2.4, 88.7, 41.1},
                {1.9, 8.58, 5.7}
        };
        double numberToMultiplicationTestMethod = 5.0;


        Matrix matrixObjectClassMatrix = new Matrix(3, 3);
        System.out.println(matrixObjectClassMatrix);


        matrixObjectClassMatrix.addingMatrix(matrixTestMethod);
        System.out.println(matrixObjectClassMatrix);


        matrixObjectClassMatrix.multiplicationMatrixByNumber(numberToMultiplicationTestMethod);
        System.out.println(matrixObjectClassMatrix);

        matrixObjectClassMatrix.multiplicationMatrixByMatrix(matrixTestMethod);
        System.out.println(matrixObjectClassMatrix);


    }




}





