package ru.hzerr.bootstrapper;

import java.nio.file.Path;

@SuppressWarnings("SpellCheckingInspection")
public class HiddenChromeInstanceEnvironmentBootstrapperOptions implements IHiddenChromeInstanceEnvironmentBootstrapperOptions {

    private IHiddenChromeInstanceUlixeeDownloadOptions chromeInstanceUlixeeDownloadOptions;
    private Path chromeInstanceDownloadLocation;
    private Path chromeInstanceLocation;

    private HiddenChromeInstanceEnvironmentBootstrapperOptions() {
    }

    @Override
    public IHiddenChromeInstanceUlixeeDownloadOptions getChromeInstanceUlixeeDownloadOptions() {
        return chromeInstanceUlixeeDownloadOptions;
    }

    private HiddenChromeInstanceEnvironmentBootstrapperOptions withChromeInstanceUlixeeDownloadOptions(IHiddenChromeInstanceUlixeeDownloadOptions chromeInstanceUlixeeDownloadOptions) {
        this.chromeInstanceUlixeeDownloadOptions = chromeInstanceUlixeeDownloadOptions;
        return this;
    }

    @Override
    public Path getChromeInstanceDownloadLocation() {
        return chromeInstanceDownloadLocation;
    }

    private HiddenChromeInstanceEnvironmentBootstrapperOptions withChromeInstanceDownloadLocation(Path chromeInstanceDownloadLocation) {
        this.chromeInstanceDownloadLocation = chromeInstanceDownloadLocation;
        return this;
    }

    @Override
    public Path getChromeInstanceLocation() {
        return chromeInstanceLocation;
    }

    private HiddenChromeInstanceEnvironmentBootstrapperOptions withChromeInstanceLocation(Path chromeInstanceLocation) {
        this.chromeInstanceLocation = chromeInstanceLocation;
        return this;
    }

    public static class HiddenChromeInstanceEnvironmentBootstrapperOptionsBuilder implements IHiddenChromeInstanceEnvironmentBootstrapperOptionsBuilder<HiddenChromeInstanceEnvironmentBootstrapperOptions> {

        private IHiddenChromeInstanceUlixeeDownloadOptions chromeInstanceUlixeeDownloadOptions;
        private Path chromeInstanceDownloadLocation;
        private Path chromeInstanceLocation;

        public HiddenChromeInstanceEnvironmentBootstrapperOptionsBuilder withChromeInstanceUlixeeDownloadOptions(IHiddenChromeInstanceUlixeeDownloadOptions chromeInstanceUlixeeDownloadOptions) {
            this.chromeInstanceUlixeeDownloadOptions = chromeInstanceUlixeeDownloadOptions;
            return this;
        }

        public HiddenChromeInstanceEnvironmentBootstrapperOptionsBuilder withChromeInstanceDownloadLocation(Path chromeInstanceDownloadLocation) {
            this.chromeInstanceDownloadLocation = chromeInstanceDownloadLocation;
            return this;
        }

        public HiddenChromeInstanceEnvironmentBootstrapperOptionsBuilder withChromeInstanceLocation(Path chromeInstanceLocation) {
            this.chromeInstanceLocation = chromeInstanceLocation;
            return this;
        }

        @Override
        public HiddenChromeInstanceEnvironmentBootstrapperOptions build() {
            return new HiddenChromeInstanceEnvironmentBootstrapperOptions()
                    .withChromeInstanceUlixeeDownloadOptions(chromeInstanceUlixeeDownloadOptions)
                    .withChromeInstanceDownloadLocation(chromeInstanceDownloadLocation)
                    .withChromeInstanceLocation(chromeInstanceLocation);
        }

        public static HiddenChromeInstanceEnvironmentBootstrapperOptionsBuilder create() {
            return new HiddenChromeInstanceEnvironmentBootstrapperOptionsBuilder();
        }
    }
}
