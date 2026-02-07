package ru.hzerr.exceptions;

public class ChromeInstanceResponseNotFoundException extends ChromeInstanceRuntimeException {

    public ChromeInstanceResponseNotFoundException(String message) {
        super(message);
    }

    public ChromeInstanceResponseNotFoundException(String message, Exception cause) {
        super(message, cause);
    }
}
