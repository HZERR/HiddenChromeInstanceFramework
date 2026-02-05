package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.bluetoothEmulation.CharacteristicOperationReceivedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class BluetoothEmulationCharacteristicOperationReceivedEventProcessor extends AbstractChromeInstanceEventProcessor<CharacteristicOperationReceivedEvent> {

    public BluetoothEmulationCharacteristicOperationReceivedEventProcessor() {
        super("BluetoothEmulation.characteristicOperationReceived", CharacteristicOperationReceivedEvent.class);
    }

    @Override
    protected abstract void onEvent(CharacteristicOperationReceivedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "BluetoothEmulation.characteristicOperationReceived"; }
}
