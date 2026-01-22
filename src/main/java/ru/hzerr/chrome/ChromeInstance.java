package ru.hzerr.chrome;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;
import ru.hzerr.ex.*;
import ru.hzerr.model.base.BaseChromeCommandResponse;
import ru.hzerr.model.base.BaseChromeEvent;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class ChromeInstance implements IChromeDevToolsLifecycle {

    protected static final String CHROME_DEVTOOLS_PROTOCOL_SPECIFICATION = "http://localhost:%s/json/protocol";
    protected static final String CHROME_DEVTOOLS_VERSION = "http://localhost:%s/json/version";

    private Process chromeInstanceProcess;
    private OkHttpClient chromeInstanceDevToolsClient;
    private WebSocket chromeInstanceDevToolsWebSocket;
    private ChromeInstanceDevToolsWebSocketListener chromeInstanceDevToolsWebSocketListener;
    private IChromeInstanceDevToolsWebSocketFactory chromeInstanceDevToolsWebSocketFactory = new ChromeInstanceDevToolsWebSocketFactory();

    public ChromeInstance() {
    }

    @Override
    public void launch() throws ChromeLaunchException {
        try {
            chromeInstanceProcess = new ProcessBuilder(getCommands()).start();
        } catch (Exception e) {
            throw new ChromeLaunchException("Failed to launch chrome at: ", e);
        }
    }

    @Override
    public void connect() throws ChromeConnectionException {
        try {
            this.chromeInstanceDevToolsClient = new OkHttpClient.Builder()
                    .connectTimeout(Duration.ofSeconds(60))
                    .readTimeout(Duration.ofSeconds(0))
                    .build();
            this.chromeInstanceDevToolsWebSocketListener = chromeInstanceDevToolsWebSocketFactory.create();
            this.chromeInstanceDevToolsWebSocket = chromeInstanceDevToolsClient.newWebSocket(new Request.Builder().url(getConnectionEndpoint()).build(), chromeInstanceDevToolsWebSocketListener);
        } catch (Exception e) {
            throw new ChromeConnectionException("Failed to establish a connection to Chrome DevTools endpoint", e);
        }
    }

    public void invokeMethod(String method) {
        if (chromeInstanceDevToolsWebSocket != null) {
            chromeInstanceDevToolsWebSocket.send(method);
        } else
            throw new ChromeIllegalStateException("INSERT HERE"); // todo
    }

    public BaseChromeCommandResponse getDevToolsResponse(long id) {
        return chromeInstanceDevToolsWebSocketListener.getResponse(id);
    }

    public List<BaseChromeEvent> getDevToolsEvents(String method) {
        return chromeInstanceDevToolsWebSocketListener.getEvents(method);
    }

    protected abstract String getConnectionEndpoint() throws ChromeInstanceException;
    protected abstract List<String> getCommands();

    @Override
    public void close() throws ChromeShutdownException {
        if (chromeInstanceProcess == null || !chromeInstanceProcess.isAlive()) {
            return;
        }

        if (chromeInstanceDevToolsWebSocket != null) {
            try {
                boolean closed = chromeInstanceDevToolsWebSocket.close(1000, "Chrome Instance");
                if (!closed) {
                    chromeInstanceDevToolsWebSocket.cancel();
                }
            } catch (Exception e) {
                throw new ChromeShutdownException("Failed to close chrome instance websocket", e);
            }
            chromeInstanceDevToolsWebSocket = null;
            chromeInstanceDevToolsWebSocketListener = null;
        }

        if (chromeInstanceDevToolsClient != null) {
            try {
                ExecutorService chromeInstanceDevToolsClientExecutorService = chromeInstanceDevToolsClient.dispatcher().executorService();
                chromeInstanceDevToolsClientExecutorService.shutdown();
                try {
                    if (!chromeInstanceDevToolsClientExecutorService.awaitTermination(60, TimeUnit.SECONDS)) {
                        chromeInstanceDevToolsClientExecutorService.shutdownNow();
                    }
                } catch (InterruptedException ie) {
                    chromeInstanceDevToolsClientExecutorService.shutdownNow();
                    Thread.currentThread().interrupt();
                }
                chromeInstanceDevToolsClient.connectionPool().evictAll();
                try {
                    Cache chromeInstanceDevToolsClientCache = chromeInstanceDevToolsClient.cache();
                    if (chromeInstanceDevToolsClientCache != null) {
                        chromeInstanceDevToolsClientCache.close();
                    }
                } catch (IOException ignored) {}
            } catch (Exception e) {
                throw new ChromeShutdownException("Failed to close chrome instance client", e);
            }
            chromeInstanceDevToolsClient = null;
        }

        ProcessHandle chromeInstanceProcessHandle = chromeInstanceProcess.toHandle();
        try {
            chromeInstanceProcessHandle.destroy();
            boolean gracefulShutdownCompleted = chromeInstanceProcess.waitFor(60, TimeUnit.SECONDS);
            if (!gracefulShutdownCompleted) {
                chromeInstanceProcessHandle.destroyForcibly();
                chromeInstanceProcess.waitFor(60, TimeUnit.SECONDS);
                if (chromeInstanceProcessHandle.isAlive()) {
                    throw new ChromeShutdownException("Chrome process could not be terminated");
                }
            }

            List<ProcessHandle> descendants = chromeInstanceProcessHandle.descendants().toList();
            List<CompletableFuture<ProcessHandle>> descendantFutures = descendants.stream()
                    .filter(ProcessHandle::isAlive)
                    .map(process -> {
                        process.destroy();
                        return process.onExit();
                    })
                    .toList();

            CompletableFuture<Void> allDescendantsExit = CompletableFuture.allOf(descendantFutures.toArray(new CompletableFuture[0]));
            allDescendantsExit.orTimeout(60, TimeUnit.SECONDS)
                    .exceptionally(ex -> null)
                    .join();

            descendants.forEach(process -> {
                if (process.isAlive()) {
                    process.destroyForcibly();
                }
            });
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();

            chromeInstanceProcessHandle.destroyForcibly();

            throw new ChromeShutdownException("Chrome shutdown interrupted", e);
        } finally {
            chromeInstanceProcess = null;
        }
    }

    protected boolean isStopped() {
        return chromeInstanceProcess == null || !chromeInstanceProcess.isAlive();
    }

    protected boolean isRunning() {
        return chromeInstanceProcess != null && chromeInstanceProcess.isAlive();
    }

    public void setChromeInstanceDevToolsWebSocketFactory(IChromeInstanceDevToolsWebSocketFactory chromeInstanceDevToolsWebSocketFactory) {
        this.chromeInstanceDevToolsWebSocketFactory = chromeInstanceDevToolsWebSocketFactory;
    }
}
