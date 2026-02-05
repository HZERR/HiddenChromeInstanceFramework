package ru.hzerr.cdp.event.bluetoothEmulation;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Event for when a characteristic operation of |type| to the characteristic respresented by |characteristicId| happened. |data| and |writeType| is expected to exist when |type| is write.")
@Event("characteristicOperationReceived")
public class CharacteristicOperationReceivedEvent {

	@Required
	private String characteristicId;

	@Required
	@TypeDescription("Indicates the various types of characteristic operation.")
	private String type;

	private byte[] data;

	@TypeDescription("Indicates the various types of characteristic write.")
	private String writeType;

    public CharacteristicOperationReceivedEvent() {
    }

	public String getCharacteristicId() {
		return this.characteristicId;
	}
	public void setCharacteristicId(String characteristicId) {
		this.characteristicId = characteristicId;
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
	public String getWriteType() {
		return this.writeType;
	}
	public void setWriteType(String writeType) {
		this.writeType = writeType;
	}
}
