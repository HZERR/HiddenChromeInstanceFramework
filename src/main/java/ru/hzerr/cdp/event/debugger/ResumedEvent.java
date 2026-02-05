package ru.hzerr.cdp.event.debugger;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;

@Description("Fired when the virtual machine resumed execution.")
@Event("resumed")
public class ResumedEvent {


    public ResumedEvent() {
    }

}
