package ru.hzerr.exceptions;

public class ChromeInstanceRuntimeException extends RuntimeException {

    public ChromeInstanceRuntimeException(String message) { super(message); }
    public ChromeInstanceRuntimeException(String message, Exception cause) { super(message, cause); }
}
