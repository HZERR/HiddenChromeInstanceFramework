package ru.hzerr.generated.systemInfo;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("Provides information about the GPU(s) on the system.")
public class GPUInfo {

	@Required
	@Description("The graphics devices on the system. Element 0 is the primary GPU.")
	private List<GPUDevice> devices;

	@Description("An optional dictionary of additional GPU related attributes.")
	private Object auxAttributes;

	@Description("An optional dictionary of graphics features and their status.")
	private Object featureStatus;

	@Required
	@Description("An optional array of GPU driver bug workarounds.")
	private String[] driverBugWorkarounds;

	@Required
	@Description("Supported accelerated video decoding capabilities.")
	private List<VideoDecodeAcceleratorCapability> videoDecoding;

	@Required
	@Description("Supported accelerated video encoding capabilities.")
	private List<VideoEncodeAcceleratorCapability> videoEncoding;

    public GPUInfo() {
    }

	public List<GPUDevice> getDevices() {
		return this.devices;
	}
	public void setDevices(List<GPUDevice> devices) {
		this.devices = devices;
	}
	public Object getAuxAttributes() {
		return this.auxAttributes;
	}
	public void setAuxAttributes(Object auxAttributes) {
		this.auxAttributes = auxAttributes;
	}
	public Object getFeatureStatus() {
		return this.featureStatus;
	}
	public void setFeatureStatus(Object featureStatus) {
		this.featureStatus = featureStatus;
	}
	public String[] getDriverBugWorkarounds() {
		return this.driverBugWorkarounds;
	}
	public void setDriverBugWorkarounds(String[] driverBugWorkarounds) {
		this.driverBugWorkarounds = driverBugWorkarounds;
	}
	public List<VideoDecodeAcceleratorCapability> getVideoDecoding() {
		return this.videoDecoding;
	}
	public void setVideoDecoding(List<VideoDecodeAcceleratorCapability> videoDecoding) {
		this.videoDecoding = videoDecoding;
	}
	public List<VideoEncodeAcceleratorCapability> getVideoEncoding() {
		return this.videoEncoding;
	}
	public void setVideoEncoding(List<VideoEncodeAcceleratorCapability> videoEncoding) {
		this.videoEncoding = videoEncoding;
	}
}
