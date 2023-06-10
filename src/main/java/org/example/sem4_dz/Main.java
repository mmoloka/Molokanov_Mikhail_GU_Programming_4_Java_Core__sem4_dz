package org.example.sem4_dz;

public class Main {

    public static void main(String[] args) {

        MyArray myArray = new MyArray(4, 4);
        String[][] myFilledArray = null;

        try {
            myFilledArray = myArray.fillMatrixOfStrings(myArray.createMatrixOfStrings());
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }

        myArray.printMatrixOfStrings(myFilledArray);

        try {
            System.out.println(myArray.sumOfArray(myFilledArray));
        } catch (MyArraySizeException s) {
            System.out.println(s.getMessage());
        } catch (MyArrayDataException d) {
            System.out.printf("Значение элемента матрицы [%d][%d] не является числовым.",
                    d.getLine(), d.getColumn());
        }
    }
}
