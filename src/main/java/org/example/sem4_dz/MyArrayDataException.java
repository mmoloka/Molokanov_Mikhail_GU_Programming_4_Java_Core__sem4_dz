package org.example.sem4_dz;

public class MyArrayDataException extends NumberFormatException {

    private int line;
    private int column;

    public MyArrayDataException(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
}
