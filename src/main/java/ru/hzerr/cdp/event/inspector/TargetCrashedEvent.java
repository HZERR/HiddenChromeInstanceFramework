package ru.hzerr.cdp.event.inspector;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;

@Description("Fired when debugging target has crashed")
@Event("targetCrashed")
public class TargetCrashedEvent {


    public TargetCrashedEvent() {
    }

}
