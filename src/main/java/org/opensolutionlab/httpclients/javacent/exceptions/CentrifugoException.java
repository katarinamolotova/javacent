package org.opensolutionlab.httpclients.javacent.exceptions;

public class CentrifugoException extends RuntimeException {
    private String message;

    public CentrifugoException(final String message) {
        super(message);
    }
}
