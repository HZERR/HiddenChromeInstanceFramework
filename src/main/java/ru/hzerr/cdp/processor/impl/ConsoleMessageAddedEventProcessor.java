package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.console.MessageAddedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class ConsoleMessageAddedEventProcessor extends AbstractChromeInstanceEventProcessor<MessageAddedEvent> {

    public ConsoleMessageAddedEventProcessor() {
        super("Console.messageAdded", MessageAddedEvent.class);
    }

    @Override
    protected abstract void onEvent(MessageAddedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Console.messageAdded"; }
}
