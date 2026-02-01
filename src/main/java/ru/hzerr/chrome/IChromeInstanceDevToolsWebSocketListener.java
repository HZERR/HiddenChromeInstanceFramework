package ru.hzerr.chrome;

import okhttp3.WebSocket;
import org.jetbrains.annotations.NotNull;
import ru.hzerr.model.base.BaseChromeInstanceResponse;
import ru.hzerr.model.base.BaseChromeEvent;

import java.time.Duration;

public interface IChromeInstanceDevToolsWebSocketListener {

    void onMessage(@NotNull WebSocket webSocket, BaseChromeEvent chromeEvent);
    void onMessage(@NotNull WebSocket webSocket, BaseChromeInstanceResponse chromeCommandResponse);
    BaseChromeInstanceResponse waitForResponse(long id, Duration timeout);
}
