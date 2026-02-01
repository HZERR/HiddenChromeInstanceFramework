package ru.hzerr.model;

import okhttp3.WebSocket;
import org.jetbrains.annotations.NotNull;
import ru.hzerr.chrome.ChromeInstanceDevToolsWebSocketListener;
import ru.hzerr.chrome.IChromeInstanceDevToolsWebSocketListener;
import ru.hzerr.model.base.BaseChromeInstanceResponse;
import ru.hzerr.model.base.BaseChromeEvent;

public class SimpleChromeInstanceDevToolsWebSocketListener extends ChromeInstanceDevToolsWebSocketListener implements IChromeInstanceDevToolsWebSocketListener {

    @Override
    public void onMessage(@NotNull WebSocket webSocket, BaseChromeEvent chromeEvent) {

    }

    @Override
    public void onMessage(@NotNull WebSocket webSocket, BaseChromeInstanceResponse chromeCommandResponse) {

    }
}
