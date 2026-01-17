package ru.hzerr.parameters;

import java.util.ArrayList;
import java.util.List;

public abstract class ChromeInstanceParameters {

    protected String chromeInstanceLocation;

    protected ChromeInstanceParameters(String chromeInstanceLocation) {
        this.chromeInstanceLocation = chromeInstanceLocation;
    }

    protected abstract List<String> getArguments();

    public final List<String> getCommands() {
        List<String> commands = new ArrayList<>();
        commands.add(chromeInstanceLocation);
        commands.addAll(getArguments());
        return commands;
    }
}
