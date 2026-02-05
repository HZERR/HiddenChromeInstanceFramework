package ru.hzerr.cdp.event.bluetoothEmulation;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Event for when a descriptor operation of |type| to the descriptor respresented by |descriptorId| happened. |data| is expected to exist when |type| is write.")
@Event("descriptorOperationReceived")
public class DescriptorOperationReceivedEvent {

	@Required
	private String descriptorId;

	@Required
	@TypeDescription("Indicates the various types of descriptor operation.")
	private String type;

	private byte[] data;

    public DescriptorOperationReceivedEvent() {
    }

	public String getDescriptorId() {
		return this.descriptorId;
	}
	public void setDescriptorId(String descriptorId) {
		this.descriptorId = descriptorId;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public byte[] getData() {
		return this.data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
}
