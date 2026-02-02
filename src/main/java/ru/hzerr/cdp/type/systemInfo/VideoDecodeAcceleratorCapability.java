package ru.hzerr.cdp.type.systemInfo;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Describes a supported video decoding profile with its associated minimum and maximum resolutions.")
public class VideoDecodeAcceleratorCapability {

	@Required
	@Description("Video codec profile that is supported, e.g. VP9 Profile 2.")
	private String profile;

	@Required
	@Description("Maximum video dimensions in pixels supported for this |profile|.")
	private Size maxResolution;

	@Required
	@Description("Minimum video dimensions in pixels supported for this |profile|.")
	private Size minResolution;

    public VideoDecodeAcceleratorCapability() {
    }

	public String getProfile() {
		return this.profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public Size getMaxResolution() {
		return this.maxResolution;
	}
	public void setMaxResolution(Size maxResolution) {
		this.maxResolution = maxResolution;
	}
	public Size getMinResolution() {
		return this.minResolution;
	}
	public void setMinResolution(Size minResolution) {
		this.minResolution = minResolution;
	}
}
