package com.felipemoreira.domain.exceptions;

public class NoStackTrraceException extends RuntimeException {

    public NoStackTrraceException(final String message) {
        this(message, null);
    }

    public NoStackTrraceException(final String message, final Throwable cause) {
        super(message, cause, true, false);
    }
}
