package ru.hzerr.parameters;

import org.apache.commons.lang3.ObjectUtils;
import ru.hzerr.bootstrapper.IHiddenChromeInstanceEnvironment;
import ru.hzerr.exceptions.ChromeMissingParametersException;
import ru.hzerr.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class HiddenChromeV144InstanceParameters extends ChromeInstanceParameters {

    private String userDataLocation;
    private String remoteDebuggingPort;
    private boolean noFirstRun;

    private HiddenChromeV144InstanceParameters(IHiddenChromeInstanceEnvironment chromeInstanceEnvironment) {
        super(chromeInstanceEnvironment);
    }

    public String getUserDataLocation() {
        return userDataLocation;
    }

    private HiddenChromeV144InstanceParameters withUserDataLocation(String userDataLocation) {
        this.userDataLocation = userDataLocation;
        return this;
    }

    public String getRemoteDebuggingPort() {
        return remoteDebuggingPort;
    }

    private HiddenChromeV144InstanceParameters withRemoteDebuggingPort(String remoteDebuggingPort) {
        this.remoteDebuggingPort = remoteDebuggingPort;
        return this;
    }

    public boolean isNoFirstRun() {
        return noFirstRun;
    }

    private HiddenChromeV144InstanceParameters withNoFirstRun(boolean noFirstRun) {
        this.noFirstRun = noFirstRun;
        return this;
    }

    @Override
    protected List<String> getArguments() {
        List<String> args = new ArrayList<>();
        args.add("--remote-debugging-port=" + remoteDebuggingPort);
        args.add("--user-data-dir=\"%s\"".formatted(userDataLocation));

        if (noFirstRun)
            args.add("--no-first-run");

        return args;
    }

    public static class HiddenChromeV144InstanceParametersBuilder implements IChromeInstanceParametersBuilder<HiddenChromeV144InstanceParameters> {

        private IHiddenChromeInstanceEnvironment chromeInstanceEnvironment;
        private String userDataLocation;
        private String remoteDebuggingPort;
        private boolean noFirstRun;

        private HiddenChromeV144InstanceParametersBuilder() {
        }

        public HiddenChromeV144InstanceParametersBuilder withChromeInstanceEnvironment(IHiddenChromeInstanceEnvironment chromeInstanceEnvironment) {
            this.chromeInstanceEnvironment = chromeInstanceEnvironment;
            return this;
        }

        public HiddenChromeV144InstanceParametersBuilder withUserDataLocation(String userDataLocation) {
            this.userDataLocation = userDataLocation;
            return this;
        }

        public HiddenChromeV144InstanceParametersBuilder withRemoteDebuggingPort(String remoteDebuggingPort) {
            this.remoteDebuggingPort = remoteDebuggingPort;
            return this;
        }

        public HiddenChromeV144InstanceParametersBuilder withNoFirstRun(boolean noFirstRun) {
            this.noFirstRun = noFirstRun;
            return this;
        }

        @Override
        public HiddenChromeV144InstanceParameters build() {
            if (ObjectUtils.isEmpty(chromeInstanceEnvironment)) throw new ChromeMissingParametersException("Chrome parameter 'chromeInstanceEnvironment' isn't provided");
            if (StringUtils.isEmpty(remoteDebuggingPort)) throw new ChromeMissingParametersException("Chrome parameter 'remoteDebuggingPort' isn't provided");
            if (StringUtils.isEmpty(userDataLocation)) throw new ChromeMissingParametersException("Chrome parameter 'userDataLocation' isn't provided");

            return new HiddenChromeV144InstanceParameters(chromeInstanceEnvironment)
                    .withRemoteDebuggingPort(remoteDebuggingPort)
                    .withUserDataLocation(userDataLocation)
                    .withNoFirstRun(noFirstRun);
        }

        public static HiddenChromeV144InstanceParametersBuilder create() {
            return new HiddenChromeV144InstanceParametersBuilder();
        }
    }
}
