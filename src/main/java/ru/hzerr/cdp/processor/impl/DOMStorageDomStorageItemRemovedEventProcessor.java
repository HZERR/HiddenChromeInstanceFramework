package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.domStorage.DomStorageItemRemovedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMStorageDomStorageItemRemovedEventProcessor extends AbstractChromeInstanceEventProcessor<DomStorageItemRemovedEvent> {

    public DOMStorageDomStorageItemRemovedEventProcessor() {
        super("DOMStorage.domStorageItemRemoved", DomStorageItemRemovedEvent.class);
    }

    @Override
    protected abstract void onEvent(DomStorageItemRemovedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOMStorage.domStorageItemRemoved"; }
}
