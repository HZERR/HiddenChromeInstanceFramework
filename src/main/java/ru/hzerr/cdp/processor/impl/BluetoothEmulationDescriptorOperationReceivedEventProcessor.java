package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.bluetoothEmulation.DescriptorOperationReceivedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class BluetoothEmulationDescriptorOperationReceivedEventProcessor extends AbstractChromeInstanceEventProcessor<DescriptorOperationReceivedEvent> {

    public BluetoothEmulationDescriptorOperationReceivedEventProcessor() {
        super("BluetoothEmulation.descriptorOperationReceived", DescriptorOperationReceivedEvent.class);
    }

    @Override
    protected abstract void onEvent(DescriptorOperationReceivedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "BluetoothEmulation.descriptorOperationReceived"; }
}
