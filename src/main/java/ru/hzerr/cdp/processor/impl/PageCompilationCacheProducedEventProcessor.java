package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.CompilationCacheProducedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageCompilationCacheProducedEventProcessor extends AbstractChromeInstanceEventProcessor<CompilationCacheProducedEvent> {

    public PageCompilationCacheProducedEventProcessor() {
        super("Page.compilationCacheProduced", CompilationCacheProducedEvent.class);
    }

    @Override
    protected abstract void onEvent(CompilationCacheProducedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.compilationCacheProduced"; }
}
