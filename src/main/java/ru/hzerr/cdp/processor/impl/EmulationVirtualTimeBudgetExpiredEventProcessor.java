package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.emulation.VirtualTimeBudgetExpiredEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class EmulationVirtualTimeBudgetExpiredEventProcessor extends AbstractChromeInstanceEventProcessor<VirtualTimeBudgetExpiredEvent> {

    public EmulationVirtualTimeBudgetExpiredEventProcessor() {
        super("Emulation.virtualTimeBudgetExpired", VirtualTimeBudgetExpiredEvent.class);
    }

    @Override
    protected abstract void onEvent(VirtualTimeBudgetExpiredEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Emulation.virtualTimeBudgetExpired"; }
}
