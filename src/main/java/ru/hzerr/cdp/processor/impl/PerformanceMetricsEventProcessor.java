package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.performance.MetricsEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PerformanceMetricsEventProcessor extends AbstractChromeInstanceEventProcessor<MetricsEvent> {

    public PerformanceMetricsEventProcessor() {
        super("Performance.metrics", MetricsEvent.class);
    }

    @Override
    protected abstract void onEvent(MetricsEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Performance.metrics"; }
}
