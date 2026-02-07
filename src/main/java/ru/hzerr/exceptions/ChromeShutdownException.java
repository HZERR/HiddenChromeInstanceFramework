package ru.hzerr.exceptions;

public class ChromeShutdownException extends ChromeInstanceException {

    public ChromeShutdownException(String message) { super(message); }
    public ChromeShutdownException(String message, Exception cause) { super(message, cause); }
}
