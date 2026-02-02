package ru.hzerr.ex;

public class ChromeInstanceSpecificationCreationException extends ChromeInstanceRuntimeException {

    public ChromeInstanceSpecificationCreationException(String message) {
        super(message);
    }

    public ChromeInstanceSpecificationCreationException(String message, Exception cause) {
        super(message, cause);
    }
}
