package ru.hzerr.cdp.event.inspector;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;

@Description("Fired when debugging target has reloaded after crash")
@Event("targetReloadedAfterCrash")
public class TargetReloadedAfterCrashEvent {


    public TargetReloadedAfterCrashEvent() {
    }

}
