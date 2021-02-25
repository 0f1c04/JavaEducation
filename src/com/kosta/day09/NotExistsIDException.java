package com.kosta.day09;

public class NotExistsIDException extends Exception {
    public NotExistsIDException() {
    }

    public NotExistsIDException(String message) {
        super(message);
    }
}
