package org.centrifugo.exceptions;

public class CentrifugoException extends RuntimeException {
    private String message;

    public CentrifugoException(final String message) {
        super(message);
    }
}
