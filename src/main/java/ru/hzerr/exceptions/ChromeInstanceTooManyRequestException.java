package ru.hzerr.exceptions;

public class ChromeInstanceTooManyRequestException extends ChromeInstanceRuntimeException {

    public ChromeInstanceTooManyRequestException(String message) {
        super(message);
    }

    public ChromeInstanceTooManyRequestException(String message, Exception cause) {
        super(message, cause);
    }
}
