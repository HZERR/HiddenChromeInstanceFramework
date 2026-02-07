package ru.hzerr.exceptions;

public class ChromeInstanceSpecificationCreationException extends ChromeInstanceRuntimeException {

    public ChromeInstanceSpecificationCreationException(String message) {
        super(message);
    }

    public ChromeInstanceSpecificationCreationException(String message, Exception cause) {
        super(message, cause);
    }
}
