package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.domStorage.DomStorageItemsClearedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMStorageDomStorageItemsClearedEventProcessor extends AbstractChromeInstanceEventProcessor<DomStorageItemsClearedEvent> {

    public DOMStorageDomStorageItemsClearedEventProcessor() {
        super("DOMStorage.domStorageItemsCleared", DomStorageItemsClearedEvent.class);
    }

    @Override
    protected abstract void onEvent(DomStorageItemsClearedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOMStorage.domStorageItemsCleared"; }
}
