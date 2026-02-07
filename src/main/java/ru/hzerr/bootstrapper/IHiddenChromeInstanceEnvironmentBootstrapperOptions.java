package ru.hzerr.bootstrapper;

import java.nio.file.Path;

@SuppressWarnings("SpellCheckingInspection")
public interface IHiddenChromeInstanceEnvironmentBootstrapperOptions {

    IHiddenChromeInstanceUlixeeDownloadOptions getChromeInstanceUlixeeDownloadOptions();
    Path getChromeInstanceDownloadLocation();
    Path getChromeInstanceLocation();
}
