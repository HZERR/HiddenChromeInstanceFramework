package ru.hzerr.chrome;

import ru.hzerr.exceptions.ChromeConnectionException;
import ru.hzerr.exceptions.ChromeLaunchException;
import ru.hzerr.exceptions.ChromeShutdownException;

public interface IChromeDevToolsLifecycle extends AutoCloseable {

    void launch() throws ChromeLaunchException;
    void connect() throws ChromeConnectionException;
    void close() throws ChromeShutdownException;
}
