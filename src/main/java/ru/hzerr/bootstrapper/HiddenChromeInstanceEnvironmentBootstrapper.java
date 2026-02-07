package ru.hzerr.bootstrapper;

import ru.hzerr.exceptions.ChromeInstanceBootstrapperException;

public class HiddenChromeInstanceEnvironmentBootstrapper implements IHiddenChromeInstanceEnvironmentBootstrapper {

    private final IHiddenChromeInstanceEnvironmentBootstrapperOptions chromeInstanceEnvironmentBootstrapperOptions;

    public HiddenChromeInstanceEnvironmentBootstrapper(IHiddenChromeInstanceEnvironmentBootstrapperOptions chromeInstanceEnvironmentBootstrapperOptions) {
        this.chromeInstanceEnvironmentBootstrapperOptions = chromeInstanceEnvironmentBootstrapperOptions;
    }

    @Override
    public IHiddenChromeInstanceEnvironment bootstrap() throws ChromeInstanceBootstrapperException {
        if (chromeInstanceEnvironmentBootstrapperOptions == null) throw new ChromeInstanceBootstrapperException("IHiddenChromeInstanceEnvironmentBootstrapperOptions is missing");
        if (chromeInstanceEnvironmentBootstrapperOptions.getChromeInstanceLocation() == null) throw new ChromeInstanceBootstrapperException("chromeInstanceLocation is missing"); // todo: допилить загрузку по необходимости

        HiddenChromeInstanceEnvironment chromeInstanceEnvironment = new HiddenChromeInstanceEnvironment();
        chromeInstanceEnvironment.setChromeInstanceLocation(chromeInstanceEnvironmentBootstrapperOptions.getChromeInstanceLocation());
        return chromeInstanceEnvironment;
    }

    public static IHiddenChromeInstanceEnvironmentBootstrapper create(IHiddenChromeInstanceEnvironmentBootstrapperOptions chromeInstanceEnvironmentBootstrapperOptions) {
        return new HiddenChromeInstanceEnvironmentBootstrapper(chromeInstanceEnvironmentBootstrapperOptions);
    }
}
