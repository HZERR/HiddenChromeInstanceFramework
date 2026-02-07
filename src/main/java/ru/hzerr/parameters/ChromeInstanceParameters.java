package ru.hzerr.parameters;

import ru.hzerr.bootstrapper.IHiddenChromeInstanceEnvironment;

import java.util.ArrayList;
import java.util.List;

public abstract class ChromeInstanceParameters {

    protected IHiddenChromeInstanceEnvironment chromeInstanceEnvironment;

    protected ChromeInstanceParameters(IHiddenChromeInstanceEnvironment chromeInstanceEnvironment) {
        this.chromeInstanceEnvironment = chromeInstanceEnvironment;
    }

    protected abstract List<String> getArguments();

    public final List<String> getCommands() {
        List<String> commands = new ArrayList<>();
        commands.add(chromeInstanceEnvironment.getChromeInstanceLocation().toString());
        commands.addAll(getArguments());
        return commands;
    }
}
