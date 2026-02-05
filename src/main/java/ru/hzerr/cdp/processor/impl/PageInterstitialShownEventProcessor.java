package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.InterstitialShownEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageInterstitialShownEventProcessor extends AbstractChromeInstanceEventProcessor<InterstitialShownEvent> {

    public PageInterstitialShownEventProcessor() {
        super("Page.interstitialShown", InterstitialShownEvent.class);
    }

    @Override
    protected abstract void onEvent(InterstitialShownEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.interstitialShown"; }
}
