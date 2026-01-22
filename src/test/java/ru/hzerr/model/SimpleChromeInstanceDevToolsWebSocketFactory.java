package ru.hzerr.model;

import ru.hzerr.chrome.ChromeInstanceDevToolsWebSocketListener;
import ru.hzerr.chrome.IChromeInstanceDevToolsWebSocketFactory;

public class SimpleChromeInstanceDevToolsWebSocketFactory implements IChromeInstanceDevToolsWebSocketFactory {

    @Override
    public ChromeInstanceDevToolsWebSocketListener create() {
        return new SimpleChromeInstanceDevToolsWebSocketListener();
    }
}
