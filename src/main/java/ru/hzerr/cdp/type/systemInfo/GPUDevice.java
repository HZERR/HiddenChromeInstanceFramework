package ru.hzerr.cdp.type.systemInfo;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Describes a single graphics processor (GPU).")
public class GPUDevice {

	@Required
	@Description("PCI ID of the GPU vendor, if available; 0 otherwise.")
	private Number vendorId;

	@Required
	@Description("PCI ID of the GPU device, if available; 0 otherwise.")
	private Number deviceId;

	@Description("Sub sys ID of the GPU, only available on Windows.")
	private Number subSysId;

	@Description("Revision of the GPU, only available on Windows.")
	private Number revision;

	@Required
	@Description("String description of the GPU vendor, if the PCI ID is not available.")
	private String vendorString;

	@Required
	@Description("String description of the GPU device, if the PCI ID is not available.")
	private String deviceString;

	@Required
	@Description("String description of the GPU driver vendor.")
	private String driverVendor;

	@Required
	@Description("String description of the GPU driver version.")
	private String driverVersion;

    public GPUDevice() {
    }

	public Number getVendorId() {
		return this.vendorId;
	}
	public void setVendorId(Number vendorId) {
		this.vendorId = vendorId;
	}
	public Number getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(Number deviceId) {
		this.deviceId = deviceId;
	}
	public Number getSubSysId() {
		return this.subSysId;
	}
	public void setSubSysId(Number subSysId) {
		this.subSysId = subSysId;
	}
	public Number getRevision() {
		return this.revision;
	}
	public void setRevision(Number revision) {
		this.revision = revision;
	}
	public String getVendorString() {
		return this.vendorString;
	}
	public void setVendorString(String vendorString) {
		this.vendorString = vendorString;
	}
	public String getDeviceString() {
		return this.deviceString;
	}
	public void setDeviceString(String deviceString) {
		this.deviceString = deviceString;
	}
	public String getDriverVendor() {
		return this.driverVendor;
	}
	public void setDriverVendor(String driverVendor) {
		this.driverVendor = driverVendor;
	}
	public String getDriverVersion() {
		return this.driverVersion;
	}
	public void setDriverVersion(String driverVersion) {
		this.driverVersion = driverVersion;
	}
}
