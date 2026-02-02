package ru.hzerr.generated.bluetoothEmulation;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Stores the manufacturer data")
public class ManufacturerData {

	@Required
	@Description("Company identifier https://bitbucket.org/bluetooth-SIG/public/src/main/assigned_numbers/company_identifiers/company_identifiers.yaml https://usb.org/developers")
	private int key;

	@Required
	@Description("Manufacturer-specific data")
	private byte[] data;

    public ManufacturerData() {
    }

	public int getKey() {
		return this.key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public byte[] getData() {
		return this.data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
}
