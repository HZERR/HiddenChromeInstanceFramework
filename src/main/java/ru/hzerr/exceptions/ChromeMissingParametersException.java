package ru.hzerr.exceptions;

public class ChromeMissingParametersException extends ChromeInstanceRuntimeException {

    public ChromeMissingParametersException(String message) { super(message); }
    public ChromeMissingParametersException(String message, Exception cause) { super(message, cause); }
}
