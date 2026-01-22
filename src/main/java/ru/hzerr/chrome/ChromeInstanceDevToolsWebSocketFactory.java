package ru.hzerr.chrome;

public class ChromeInstanceDevToolsWebSocketFactory implements IChromeInstanceDevToolsWebSocketFactory {

    @Override
    public ChromeInstanceDevToolsWebSocketListener create() {
        return new ChromeInstanceDevToolsWebSocketListener();
    }
}
