package org.example.sem4_dz;

import java.util.Scanner;

public class MyArray {

    public final int SIZE = 4;
    int numberOfLines;
    int numberOfColumns;

    public MyArray(int numberOfLines, int numberOfColumns) {
        this.numberOfLines = numberOfLines;
        this.numberOfColumns = numberOfColumns;
    }

    public String[][] createMatrixOfStrings() {
        if (numberOfLines < 1 || numberOfColumns < 1) {
            throw new MyArraySizeException("Размер матрицы не может быть меньше 1 !");
        }

        return new String[numberOfLines][numberOfColumns];
    }

    public String[][] fillMatrixOfStrings(String[][] matrix) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Введите числовое значение элемента матрицы [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextLine();
            }
        }
        sc.close();
        return matrix;
    }

    public void printMatrixOfStrings(String[][] matrix) {
        if (matrix != null) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "  ");
                }
                System.out.println();
            }
        }

    }

    public int sumOfArray(String[][] matrix) {
        int sum = 0;
        if (matrix == null) throw new MyArraySizeException("");
        if (matrix.length == 0 || (matrix.length != SIZE && matrix[0].length != SIZE))
            throw new MyArraySizeException("Размер входного массива не соответствует условию.");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.print("Сумма элементов матрицы: ");
        return sum;
    }
}
