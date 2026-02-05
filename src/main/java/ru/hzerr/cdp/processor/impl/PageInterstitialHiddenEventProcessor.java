package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.InterstitialHiddenEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageInterstitialHiddenEventProcessor extends AbstractChromeInstanceEventProcessor<InterstitialHiddenEvent> {

    public PageInterstitialHiddenEventProcessor() {
        super("Page.interstitialHidden", InterstitialHiddenEvent.class);
    }

    @Override
    protected abstract void onEvent(InterstitialHiddenEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.interstitialHidden"; }
}
