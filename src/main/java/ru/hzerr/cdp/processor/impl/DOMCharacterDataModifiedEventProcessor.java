package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.dom.CharacterDataModifiedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMCharacterDataModifiedEventProcessor extends AbstractChromeInstanceEventProcessor<CharacterDataModifiedEvent> {

    public DOMCharacterDataModifiedEventProcessor() {
        super("DOM.characterDataModified", CharacterDataModifiedEvent.class);
    }

    @Override
    protected abstract void onEvent(CharacterDataModifiedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOM.characterDataModified"; }
}
