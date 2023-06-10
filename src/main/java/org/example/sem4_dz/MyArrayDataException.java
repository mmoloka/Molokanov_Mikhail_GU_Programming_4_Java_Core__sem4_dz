package org.example.sem4_dz;

public class MyArrayDataException extends NumberFormatException {

    int line;
    int column;

    public MyArrayDataException(int line, int column) {
        this.line = line;
        this.column = column;
    }
}
