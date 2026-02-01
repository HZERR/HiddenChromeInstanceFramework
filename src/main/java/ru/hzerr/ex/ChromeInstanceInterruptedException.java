package ru.hzerr.ex;

public class ChromeInstanceInterruptedException extends ChromeInstanceRuntimeException {

    public ChromeInstanceInterruptedException(String message) {
        super(message);
    }

    public ChromeInstanceInterruptedException(String message, Exception cause) {
        super(message, cause);
    }
}
