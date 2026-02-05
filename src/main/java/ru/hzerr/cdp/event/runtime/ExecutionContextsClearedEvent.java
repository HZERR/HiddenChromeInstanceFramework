package ru.hzerr.cdp.event.runtime;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;

@Description("Issued when all executionContexts were cleared in browser")
@Event("executionContextsCleared")
public class ExecutionContextsClearedEvent {


    public ExecutionContextsClearedEvent() {
    }

}
