package ru.hzerr.chrome;

import okhttp3.WebSocket;
import org.jetbrains.annotations.NotNull;
import ru.hzerr.model.base.BaseChromeCommandResponse;
import ru.hzerr.model.base.BaseChromeEvent;

public interface IChromeInstanceDevToolsWebSocketListener {

    void onMessage(@NotNull WebSocket webSocket, BaseChromeEvent chromeEvent);
    void onMessage(@NotNull WebSocket webSocket, BaseChromeCommandResponse chromeCommandResponse);
}
