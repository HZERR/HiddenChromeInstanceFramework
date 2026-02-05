package ru.hzerr.cdp.processor;

import ru.hzerr.utils.JsonUtils;
import tools.jackson.databind.JsonNode;

public abstract class AbstractChromeInstanceEventProcessor<T> implements IChromeInstanceEventProcessor {

    private final String name;
    private final Class<T> clazz;

    public AbstractChromeInstanceEventProcessor(String name, Class<T> eventType) {
        this.name = name;
        this.clazz = eventType;
    }

    @Override
    public void handle(JsonNode payload) {
        try {
            T event = JsonUtils.readValue(payload, clazz);
            onEvent(event);
        } catch (Exception e) {
            onEventProcessingException(e);
        }
    }

    protected abstract void onEvent(T event) throws Exception;
    protected abstract void onEventProcessingException(Exception e);

    public String getName() {
        return name;
    }

    public Class<T> getEventType() {
        return clazz;
    }
}
