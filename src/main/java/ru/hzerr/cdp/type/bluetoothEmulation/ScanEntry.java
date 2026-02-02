package ru.hzerr.cdp.type.bluetoothEmulation;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Stores the advertisement packet information that is sent by a Bluetooth device.")
public class ScanEntry {

	@Required
	private String deviceAddress;

	@Required
	private int rssi;

	@Required
	private ScanRecord scanRecord;

    public ScanEntry() {
    }

	public String getDeviceAddress() {
		return this.deviceAddress;
	}
	public void setDeviceAddress(String deviceAddress) {
		this.deviceAddress = deviceAddress;
	}
	public int getRssi() {
		return this.rssi;
	}
	public void setRssi(int rssi) {
		this.rssi = rssi;
	}
	public ScanRecord getScanRecord() {
		return this.scanRecord;
	}
	public void setScanRecord(ScanRecord scanRecord) {
		this.scanRecord = scanRecord;
	}
}
