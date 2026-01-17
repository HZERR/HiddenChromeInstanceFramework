package ru.hzerr.parameters;

import ru.hzerr.ex.ChromeMissingParametersException;
import ru.hzerr.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class HiddenChromeV144InstanceParameters extends ChromeInstanceParameters {

    private String userDataLocation;
    private String remoteDebuggingPort;
    private boolean noFirstRun;

    private HiddenChromeV144InstanceParameters(String chromeInstanceLocation) {
        super(chromeInstanceLocation);
    }

    public String getUserDataLocation() {
        return userDataLocation;
    }

    public HiddenChromeV144InstanceParameters withUserDataLocation(String userDataLocation) {
        this.userDataLocation = userDataLocation;
        return this;
    }

    public String getRemoteDebuggingPort() {
        return remoteDebuggingPort;
    }

    public HiddenChromeV144InstanceParameters withRemoteDebuggingPort(String remoteDebuggingPort) {
        this.remoteDebuggingPort = remoteDebuggingPort;
        return this;
    }

    public HiddenChromeV144InstanceParameters withNoFirstRun(boolean noFirstRun) {
        this.noFirstRun = noFirstRun;
        return this;
    }

    @Override
    protected List<String> getArguments() {
        List<String> args = new ArrayList<>();
        if (StringUtils.isEmpty(remoteDebuggingPort)) throw new ChromeMissingParametersException("Chrome parameter 'remoteDebuggingPort' isn't provided");
        if (StringUtils.isEmpty(userDataLocation)) throw new ChromeMissingParametersException("Chrome parameter 'userDataLocation' isn't provided");

        args.add("--remote-debugging-port=" + remoteDebuggingPort);
        args.add("--user-data-dir=\"%s\"".formatted(userDataLocation));

        if (noFirstRun)
            args.add("--no-first-run");

        return args;
    }

    public static HiddenChromeV144InstanceParameters create(String chromeInstanceLocation) {
        return new HiddenChromeV144InstanceParameters(chromeInstanceLocation);
    }
}
