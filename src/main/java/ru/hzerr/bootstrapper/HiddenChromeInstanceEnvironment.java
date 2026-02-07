package ru.hzerr.bootstrapper;

import java.nio.file.Path;

public class HiddenChromeInstanceEnvironment implements IHiddenChromeInstanceEnvironment {

    private Path chromeInstanceLocation;

    public HiddenChromeInstanceEnvironment() {
    }

    public void setChromeInstanceLocation(Path chromeInstanceLocation) {
        this.chromeInstanceLocation = chromeInstanceLocation;
    }

    @Override
    public Path getChromeInstanceLocation() {
        return chromeInstanceLocation;
    }
}
