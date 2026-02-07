package ru.hzerr.bootstrapper;

@SuppressWarnings("SpellCheckingInspection")
public class HiddenChromeInstanceUlixeeDownloadOptions {

    private HiddenChromeInstanceUlixeePlatform platform;
    private String version;

    private HiddenChromeInstanceUlixeeDownloadOptions() {
    }

    public HiddenChromeInstanceUlixeePlatform getPlatform() {
        return platform;
    }

    public HiddenChromeInstanceUlixeeDownloadOptions withPlatform(HiddenChromeInstanceUlixeePlatform platform) {
        this.platform = platform;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public HiddenChromeInstanceUlixeeDownloadOptions withVersion(String version) {
        this.version = version;
        return this;
    }

    public static HiddenChromeInstanceUlixeeDownloadOptions create() {
        return new HiddenChromeInstanceUlixeeDownloadOptions();
    }
}
