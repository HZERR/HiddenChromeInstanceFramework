package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.deviceAccess.DeviceRequestPromptedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DeviceAccessDeviceRequestPromptedEventProcessor extends AbstractChromeInstanceEventProcessor<DeviceRequestPromptedEvent> {

    public DeviceAccessDeviceRequestPromptedEventProcessor() {
        super("DeviceAccess.deviceRequestPrompted", DeviceRequestPromptedEvent.class);
    }

    @Override
    protected abstract void onEvent(DeviceRequestPromptedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DeviceAccess.deviceRequestPrompted"; }
}
