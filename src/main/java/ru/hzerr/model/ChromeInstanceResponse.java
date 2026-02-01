package ru.hzerr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.StringJoiner;

public class ChromeInstanceResponse<R, E> {

    private long id;
    private String sessionId;
    private R result;
    @JsonProperty("error")
    private ChromeExceptionMetaData<E> chromeExceptionMetaData;

    public ChromeInstanceResponse() {
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public R getResult() { return result; }
    public void setResult(R result) { this.result = result; }

    public ChromeExceptionMetaData<E> getChromeExceptionMetaData() { return chromeExceptionMetaData; }
    public void setChromeExceptionMetaData(ChromeExceptionMetaData<E> chromeExceptionMetaData) { this.chromeExceptionMetaData = chromeExceptionMetaData; }

    public boolean isSuccess() {
        return chromeExceptionMetaData == null;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ChromeInstanceResponse.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("sessionId='" + sessionId + "'")
                .add("result=" + result)
                .add("chromeExceptionMetaData=" + chromeExceptionMetaData)
                .toString();
    }
}
