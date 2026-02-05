package ru.hzerr.chrome;

import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.hzerr.cdp.processor.IChromeInstanceEventProcessor;
import ru.hzerr.ex.ChromeInstanceException;
import ru.hzerr.ex.ChromeInstanceInterruptedException;
import ru.hzerr.ex.ChromeInstanceResponseNotFoundException;
import ru.hzerr.ex.ChromeInstanceResponseParsableException;
import ru.hzerr.model.base.BaseChromeInstanceResponse;
import ru.hzerr.model.base.BaseChromeEvent;
import ru.hzerr.utils.JsonUtils;
import tools.jackson.core.JacksonException;
import tools.jackson.databind.JsonNode;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class ChromeInstanceDevToolsWebSocketListener extends WebSocketListener implements IChromeInstanceDevToolsWebSocketListener {

    private static final Logger logger = LogManager.getLogger(ChromeInstanceDevToolsWebSocketListener.class);

    private final Map<String, List<BaseChromeEvent>> chromeInstanceEvents = new ConcurrentHashMap<>();
    private final BlockingQueue<BaseChromeInstanceResponse> chromeInstanceCommandResponses = new LinkedBlockingQueue<>();
    private final Map<String, List<IChromeInstanceEventProcessor>> chromeInstanceEventProcessors = new ConcurrentHashMap<>();

    @Deprecated
    private final Map<Long, BaseChromeInstanceResponse> chromeInstanceResponses = new ConcurrentHashMap<>();

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
            JsonNode chromeInstanceResponseAsJsonNode = JsonUtils.readValueAsJsonNode(text);
            if (chromeInstanceResponseAsJsonNode.has("id")) {
                onMessage(webSocket, JsonUtils.readValue(text, BaseChromeInstanceResponse.class));
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
        logger.debug("✅ Получено событие! {}", chromeEvent);
        chromeInstanceEvents.computeIfAbsent(chromeEvent.getMethod(), newMethod -> new CopyOnWriteArrayList<>()).add(chromeEvent);
        List<IChromeInstanceEventProcessor> processors = chromeInstanceEventProcessors.getOrDefault(chromeEvent.getMethod(), Collections.emptyList());
        if (CollectionUtils.isNotEmpty(processors)) {
            for (IChromeInstanceEventProcessor processor : processors) {
                processor.handle(chromeEvent.getPayload());
            }
        }
    }

    @Override
    public void onMessage(@NotNull WebSocket webSocket, BaseChromeInstanceResponse chromeCommandResponse) {
        chromeInstanceResponses.put(chromeCommandResponse.getId(), chromeCommandResponse);
        chromeInstanceCommandResponses.offer(chromeCommandResponse);

        logger.debug("✅ Получен ответ браузера! {}", chromeCommandResponse);
    }

    @Override
    public BaseChromeInstanceResponse waitForResponse(long id, Duration timeout) {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + timeout.toMillis();

        while (System.currentTimeMillis() < endTime) {
            try {
                long remainingTime = endTime - System.currentTimeMillis();
                if (remainingTime <= 0) {
                    break;
                }

                BaseChromeInstanceResponse response = chromeInstanceCommandResponses.poll(remainingTime, TimeUnit.MILLISECONDS);
                if (response != null && response.getId() == id) {
                    return response;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new ChromeInstanceInterruptedException(e.getMessage(), e);
            }
        }

        throw new ChromeInstanceResponseNotFoundException("Chrome instance did not receive a response for command '%s' within %s milliseconds".formatted(id, timeout.toMillis()));
    }

    public void registerChromeInstanceEventProcessor(IChromeInstanceEventProcessor chromeInstanceEventProcessor) {
        chromeInstanceEventProcessors.computeIfAbsent(chromeInstanceEventProcessor.getEventName(), e -> new CopyOnWriteArrayList<>()).add(chromeInstanceEventProcessor);
    }

    public void unregisterChromeInstanceEventProcessors(String eventName) {
        chromeInstanceEventProcessors.remove(eventName);
    }

    @Deprecated
    public BaseChromeInstanceResponse getResponse(long id) {
        return chromeInstanceResponses.get(id);
    }

    @Deprecated
    public List<BaseChromeEvent> getEvents(String method) {
        return chromeInstanceEvents.get(method);
    }
}
