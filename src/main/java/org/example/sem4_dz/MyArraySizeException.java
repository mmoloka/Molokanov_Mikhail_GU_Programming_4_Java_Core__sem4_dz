package org.example.sem4_dz;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {

    private String message;

    public MyArraySizeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
