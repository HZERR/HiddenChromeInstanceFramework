package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.domStorage.DomStorageItemUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMStorageDomStorageItemUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<DomStorageItemUpdatedEvent> {

    public DOMStorageDomStorageItemUpdatedEventProcessor() {
        super("DOMStorage.domStorageItemUpdated", DomStorageItemUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(DomStorageItemUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOMStorage.domStorageItemUpdated"; }
}
