package ru.hzerr.exceptions;

public class ChromeConnectionException extends ChromeInstanceException {

    public ChromeConnectionException(String message) { super(message); }
    public ChromeConnectionException(String message, Exception cause) { super(message, cause); }
}
