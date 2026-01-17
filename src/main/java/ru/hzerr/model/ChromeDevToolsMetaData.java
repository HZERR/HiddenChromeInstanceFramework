package ru.hzerr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.StringJoiner;

public class ChromeDevToolsMetaData {

    @JsonProperty("Browser")
    private String chromeVersion;
    @JsonProperty("V8-Version")
    private String chromeJavaScriptEngineVersion;
    @JsonProperty("Protocol-Version")
    private String chromeDevToolsProtocolVersion;
    @JsonProperty("WebKit-Version")
    private String chromeWebKitEngineVersion;
    @JsonProperty("webSocketDebuggerUrl")
    private String chromeDevToolsWebSocketUrl;
    @JsonProperty("User-Agent")
    private String chromeUserAgent;

    public String getChromeVersion() {
        return chromeVersion;
    }

    public void setChromeVersion(String chromeVersion) {
        this.chromeVersion = chromeVersion;
    }

    public String getChromeJavaScriptEngineVersion() {
        return chromeJavaScriptEngineVersion;
    }

    public void setChromeJavaScriptEngineVersion(String chromeJavaScriptEngineVersion) {
        this.chromeJavaScriptEngineVersion = chromeJavaScriptEngineVersion;
    }

    public String getChromeDevToolsProtocolVersion() {
        return chromeDevToolsProtocolVersion;
    }

    public void setChromeDevToolsProtocolVersion(String chromeDevToolsProtocolVersion) {
        this.chromeDevToolsProtocolVersion = chromeDevToolsProtocolVersion;
    }

    public String getChromeWebKitEngineVersion() {
        return chromeWebKitEngineVersion;
    }

    public void setChromeWebKitEngineVersion(String chromeWebKitEngineVersion) {
        this.chromeWebKitEngineVersion = chromeWebKitEngineVersion;
    }

    public String getChromeDevToolsWebSocketUrl() {
        return chromeDevToolsWebSocketUrl;
    }

    public void setChromeDevToolsWebSocketUrl(String chromeDevToolsWebSocketUrl) {
        this.chromeDevToolsWebSocketUrl = chromeDevToolsWebSocketUrl;
    }

    public String getChromeUserAgent() {
        return chromeUserAgent;
    }

    public void setChromeUserAgent(String chromeUserAgent) {
        this.chromeUserAgent = chromeUserAgent;
    }

    @Override
    public String toString() {
        return new StringJoiner(", \n\t", ChromeDevToolsMetaData.class.getSimpleName() + " [\n\t", "\n]")
                .add("chromeVersion='" + chromeVersion + "'")
                .add("chromeJavaScriptEngineVersion='" + chromeJavaScriptEngineVersion + "'")
                .add("chromeDevToolsProtocolVersion='" + chromeDevToolsProtocolVersion + "'")
                .add("chromeWebKitEngineVersion='" + chromeWebKitEngineVersion + "'")
                .add("chromeDevToolsWebSocketUrl='" + chromeDevToolsWebSocketUrl + "'")
                .add("chromeUserAgent='" + chromeUserAgent + "'")
                .toString();
    }
}
