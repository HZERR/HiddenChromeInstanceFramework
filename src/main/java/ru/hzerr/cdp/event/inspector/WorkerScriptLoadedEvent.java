package ru.hzerr.cdp.event.inspector;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;

@Experimental
@Description("Fired on worker targets when main worker script and any imported scripts have been evaluated.")
@Event("workerScriptLoaded")
public class WorkerScriptLoadedEvent {


    public WorkerScriptLoadedEvent() {
    }

}
