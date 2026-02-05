package ru.hzerr.cdp.processor;

import tools.jackson.databind.JsonNode;

public interface IChromeInstanceEventProcessor {

    void handle(JsonNode event);
    String getEventName();
}
