package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.bluetoothEmulation.GattOperationReceivedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class BluetoothEmulationGattOperationReceivedEventProcessor extends AbstractChromeInstanceEventProcessor<GattOperationReceivedEvent> {

    public BluetoothEmulationGattOperationReceivedEventProcessor() {
        super("BluetoothEmulation.gattOperationReceived", GattOperationReceivedEvent.class);
    }

    @Override
    protected abstract void onEvent(GattOperationReceivedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "BluetoothEmulation.gattOperationReceived"; }
}
