package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.domStorage.DomStorageItemAddedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMStorageDomStorageItemAddedEventProcessor extends AbstractChromeInstanceEventProcessor<DomStorageItemAddedEvent> {

    public DOMStorageDomStorageItemAddedEventProcessor() {
        super("DOMStorage.domStorageItemAdded", DomStorageItemAddedEvent.class);
    }

    @Override
    protected abstract void onEvent(DomStorageItemAddedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOMStorage.domStorageItemAdded"; }
}
