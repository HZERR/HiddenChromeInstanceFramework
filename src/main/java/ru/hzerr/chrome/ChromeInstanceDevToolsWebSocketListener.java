package ru.hzerr.chrome;

import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.hzerr.ex.ChromeInstanceException;
import ru.hzerr.ex.ChromeInstanceResponseParsableException;
import ru.hzerr.model.base.BaseChromeCommandResponse;
import ru.hzerr.model.base.BaseChromeEvent;
import ru.hzerr.utils.JsonUtils;
import tools.jackson.core.JacksonException;
import tools.jackson.databind.JsonNode;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ChromeInstanceDevToolsWebSocketListener extends WebSocketListener implements IChromeInstanceDevToolsWebSocketListener {

    private final Map<String, List<BaseChromeEvent>> chromeInstanceEvents = new ConcurrentHashMap<>();
    private final Map<Long, BaseChromeCommandResponse> chromeInstanceResponses = new ConcurrentHashMap<>();
    private static final Logger logger = LogManager.getLogger(ChromeInstanceDevToolsWebSocketListener.class);

    public ChromeInstanceDevToolsWebSocketListener() {
        super();
    }

    @Override
    public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
        super.onOpen(webSocket, response);
    }

    @Override
    public void onMessage(@NotNull WebSocket webSocket, @NotNull String text) {
//        logger.debug("✅ Получено сообщение! {}", text);
        try {
            JsonNode chromeInstanceResponseAsJsonNode = JsonUtils.readTree(text);
            if (chromeInstanceResponseAsJsonNode.has("id")) {
                onMessage(webSocket, JsonUtils.readValue(text, BaseChromeCommandResponse.class));
                return;
            }

            if (chromeInstanceResponseAsJsonNode.has("method")) {
                onMessage(webSocket, JsonUtils.readValue(text, BaseChromeEvent.class));
                return;
            }

            if (chromeInstanceResponseAsJsonNode.has("error")) {
                onFailure(webSocket, new ChromeInstanceException(text), null);
                return;
            }

            onParsingFailure(webSocket, new ChromeInstanceResponseParsableException("Failed to parse chrome instance response: %s".formatted(text)));
        } catch (JacksonException je) {
            onParsingFailure(webSocket, new ChromeInstanceResponseParsableException("Failed to parse chrome instance response: %s".formatted(text), je));
        }
    }

    @Override
    public void onMessage(@NotNull WebSocket webSocket, @NotNull ByteString bytes) {
        super.onMessage(webSocket, bytes);
    }

    @Override
    public void onClosing(@NotNull WebSocket webSocket, int code, @NotNull String reason) {
        super.onClosing(webSocket, code, reason);
    }

    @Override
    public void onClosed(@NotNull WebSocket webSocket, int code, @NotNull String reason) {
        super.onClosed(webSocket, code, reason);
    }

    @Override
    public void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable t, @Nullable Response response) {
        super.onFailure(webSocket, t, response);

        logger.error("✅ Ошибка взаимодействия!", t);
    }

    public void onParsingFailure(@NotNull WebSocket webSocket, @NotNull Throwable throwable) {
        logger.error("✅ Ошибка парсинга!", throwable);
    }

    @Override
    public void onMessage(@NotNull WebSocket webSocket, BaseChromeEvent chromeEvent) {
        chromeInstanceEvents.computeIfAbsent(chromeEvent.getMethod(), newMethod -> new CopyOnWriteArrayList<>()).add(chromeEvent);

        logger.debug("✅ Получено событие! {}", chromeEvent);
    }

    @Override
    public void onMessage(@NotNull WebSocket webSocket, BaseChromeCommandResponse chromeCommandResponse) {
        chromeInstanceResponses.put(chromeCommandResponse.getId(), chromeCommandResponse);

        logger.debug("✅ Получен ответ браузера! {}", chromeCommandResponse);
    }

    public BaseChromeCommandResponse getResponse(long id) {
        return chromeInstanceResponses.get(id);
    }

    public List<BaseChromeEvent> getEvents(String method) {
        return chromeInstanceEvents.get(method);
    }
}
