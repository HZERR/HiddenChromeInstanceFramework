package ru.hzerr.generated.bluetoothEmulation;

import ru.hzerr.annotation.Description;

@Description("Describes the properties of a characteristic. This follows Bluetooth Core Specification BT 4.2 Vol 3 Part G 3.3.1. Characteristic Properties.")
public class CharacteristicProperties {

	private boolean broadcast;

	private boolean read;

	private boolean writeWithoutResponse;

	private boolean write;

	private boolean notify;

	private boolean indicate;

	private boolean authenticatedSignedWrites;

	private boolean extendedProperties;

    public CharacteristicProperties() {
    }

	public boolean getBroadcast() {
		return this.broadcast;
	}
	public void setBroadcast(boolean broadcast) {
		this.broadcast = broadcast;
	}
	public boolean getRead() {
		return this.read;
	}
	public void setRead(boolean read) {
		this.read = read;
	}
	public boolean getWriteWithoutResponse() {
		return this.writeWithoutResponse;
	}
	public void setWriteWithoutResponse(boolean writeWithoutResponse) {
		this.writeWithoutResponse = writeWithoutResponse;
	}
	public boolean getWrite() {
		return this.write;
	}
	public void setWrite(boolean write) {
		this.write = write;
	}
	public boolean getNotify() {
		return this.notify;
	}
	public void setNotify(boolean notify) {
		this.notify = notify;
	}
	public boolean getIndicate() {
		return this.indicate;
	}
	public void setIndicate(boolean indicate) {
		this.indicate = indicate;
	}
	public boolean getAuthenticatedSignedWrites() {
		return this.authenticatedSignedWrites;
	}
	public void setAuthenticatedSignedWrites(boolean authenticatedSignedWrites) {
		this.authenticatedSignedWrites = authenticatedSignedWrites;
	}
	public boolean getExtendedProperties() {
		return this.extendedProperties;
	}
	public void setExtendedProperties(boolean extendedProperties) {
		this.extendedProperties = extendedProperties;
	}
}
