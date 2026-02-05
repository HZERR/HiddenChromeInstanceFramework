package ru.hzerr.cdp.event.dom;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;

@Description("Fired when `Document` has been totally updated. Node ids are no longer valid.")
@Event("documentUpdated")
public class DocumentUpdatedEvent {


    public DocumentUpdatedEvent() {
    }

}
