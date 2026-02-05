package ru.hzerr.cdp.event.bluetoothEmulation;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Event for when a GATT operation of |type| to the peripheral with |address| happened.")
@Event("gattOperationReceived")
public class GattOperationReceivedEvent {

	@Required
	private String address;

	@Required
	@TypeDescription("Indicates the various types of GATT event.")
	private String type;

    public GattOperationReceivedEvent() {
    }

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
