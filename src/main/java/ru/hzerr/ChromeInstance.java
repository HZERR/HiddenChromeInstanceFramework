package ru.hzerr;

import ru.hzerr.ex.ChromeLaunchException;
import ru.hzerr.ex.ChromeShutdownException;

import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class ChromeInstance implements IChrome {

    protected static final String CHROME_DEVTOOLS_PROTOCOL_SPECIFICATION = "http://localhost:%s/json/protocol";
    protected static final String CHROME_DEVTOOLS_VERSION = "http://localhost:%s/json/version";

    private Process chromeInstanceProcess;

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

    protected abstract List<String> getCommands();

    @Override
    public void close() throws ChromeShutdownException {
        if (chromeInstanceProcess == null || !chromeInstanceProcess.isAlive()) {
            return;
        }

        try {
            chromeInstanceProcess.destroy();
            boolean gracefulShutdownCompleted = chromeInstanceProcess.waitFor(60, TimeUnit.SECONDS);
            if (!gracefulShutdownCompleted) {
                chromeInstanceProcess.destroyForcibly();
                chromeInstanceProcess.waitFor(60, TimeUnit.SECONDS);
                if (chromeInstanceProcess.isAlive()) {
                    throw new ChromeShutdownException("Chrome process could not be terminated");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();

            chromeInstanceProcess.destroyForcibly();

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
}
