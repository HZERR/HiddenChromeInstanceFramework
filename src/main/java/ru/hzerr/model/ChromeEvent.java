package ru.hzerr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.StringJoiner;

public class ChromeEvent<T> {

    private String sessionId;
    private String method;
    @JsonProperty("params")
    private T payload;

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getMethod() { return method; }
    public void setMethod(String method) { this.method = method; }

    public T getPayload() { return payload; }
    public void setPayload(T payload) { this.payload = payload; }

    @Override
    public String toString() {
        return new StringJoiner(", ", ChromeEvent.class.getSimpleName() + "[", "]")
                .add("sessionId='" + sessionId + "'")
                .add("method='" + method + "'")
                .add("payload=" + payload)
                .toString();
    }
}
