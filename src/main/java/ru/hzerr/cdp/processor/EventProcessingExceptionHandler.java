package ru.hzerr.cdp.processor;

public interface EventProcessingExceptionHandler {

    void onEventProcessingException(Exception e);
}
