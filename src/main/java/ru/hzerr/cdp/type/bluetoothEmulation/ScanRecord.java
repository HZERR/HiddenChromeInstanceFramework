package ru.hzerr.cdp.type.bluetoothEmulation;

import ru.hzerr.annotation.Description;
import java.util.List;

@Description("Stores the byte data of the advertisement packet sent by a Bluetooth device.")
public class ScanRecord {

	private String name;

	private String[] uuids;

	@Description("Stores the external appearance description of the device.")
	private int appearance;

	@Description("Stores the transmission power of a broadcasting device.")
	private int txPower;

	@Description("Key is the company identifier and the value is an array of bytes of manufacturer specific data.")
	private List<ManufacturerData> manufacturerData;

    public ScanRecord() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getUuids() {
		return this.uuids;
	}
	public void setUuids(String[] uuids) {
		this.uuids = uuids;
	}
	public int getAppearance() {
		return this.appearance;
	}
	public void setAppearance(int appearance) {
		this.appearance = appearance;
	}
	public int getTxPower() {
		return this.txPower;
	}
	public void setTxPower(int txPower) {
		this.txPower = txPower;
	}
	public List<ManufacturerData> getManufacturerData() {
		return this.manufacturerData;
	}
	public void setManufacturerData(List<ManufacturerData> manufacturerData) {
		this.manufacturerData = manufacturerData;
	}
}
