package ru.hzerr.exceptions;

public class ChromeIllegalStateException extends ChromeInstanceRuntimeException {

    public ChromeIllegalStateException(String message) { super(message); }
    public ChromeIllegalStateException(String message, Exception cause) { super(message, cause); }
}
