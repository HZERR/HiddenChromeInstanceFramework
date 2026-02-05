package ru.hzerr.cdp.processor;

public interface EventProcessingHandler<T> {

    void onEvent(T event) throws Exception;
}
