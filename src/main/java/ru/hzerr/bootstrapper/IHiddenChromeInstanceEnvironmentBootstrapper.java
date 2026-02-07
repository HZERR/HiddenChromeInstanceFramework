package ru.hzerr.bootstrapper;

import ru.hzerr.exceptions.ChromeInstanceBootstrapperException;

public interface IHiddenChromeInstanceEnvironmentBootstrapper {

    IHiddenChromeInstanceEnvironment bootstrap() throws ChromeInstanceBootstrapperException;
}
