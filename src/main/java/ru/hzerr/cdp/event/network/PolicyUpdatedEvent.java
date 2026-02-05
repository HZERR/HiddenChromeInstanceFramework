package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;

@Experimental
@Description("Fired once security policy has been updated.")
@Event("policyUpdated")
public class PolicyUpdatedEvent {


    public PolicyUpdatedEvent() {
    }

}
