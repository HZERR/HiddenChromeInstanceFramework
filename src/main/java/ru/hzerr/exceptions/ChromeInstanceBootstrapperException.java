package ru.hzerr.exceptions;

public class ChromeInstanceBootstrapperException extends ChromeInstanceRuntimeException {

    public ChromeInstanceBootstrapperException(String message) {
        super(message);
    }

    public ChromeInstanceBootstrapperException(String message, Exception cause) {
        super(message, cause);
    }
}
