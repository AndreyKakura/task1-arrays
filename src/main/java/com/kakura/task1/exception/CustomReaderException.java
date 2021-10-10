package com.kakura.task1.exception;

public class CustomReaderException extends Exception {

    public CustomReaderException() {
        super();
    }

    public CustomReaderException(String message) {
        super(message);
    }

    public CustomReaderException(Exception e) {
        super(e);
    }

    public CustomReaderException(String message, Exception e) {
        super(message, e);
    }
}
