package ru.hzerr.cdp.event.emulation;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;

@Experimental
@Description("Notification sent after the virtual time budget for the current VirtualTimePolicy has run out.")
@Event("virtualTimeBudgetExpired")
public class VirtualTimeBudgetExpiredEvent {


    public VirtualTimeBudgetExpiredEvent() {
    }

}
