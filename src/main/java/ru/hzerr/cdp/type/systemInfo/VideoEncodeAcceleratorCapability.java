package ru.hzerr.cdp.type.systemInfo;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Describes a supported video encoding profile with its associated maximum resolution and maximum framerate.")
public class VideoEncodeAcceleratorCapability {

	@Required
	@Description("Video codec profile that is supported, e.g H264 Main.")
	private String profile;

	@Required
	@Description("Maximum video dimensions in pixels supported for this |profile|.")
	private Size maxResolution;

	@Required
	@Description("Maximum encoding framerate in frames per second supported for this |profile|, as fraction's numerator and denominator, e.g. 24/1 fps, 24000/1001 fps, etc.")
	private int maxFramerateNumerator;

	@Required
	private int maxFramerateDenominator;

    public VideoEncodeAcceleratorCapability() {
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
	public int getMaxFramerateNumerator() {
		return this.maxFramerateNumerator;
	}
	public void setMaxFramerateNumerator(int maxFramerateNumerator) {
		this.maxFramerateNumerator = maxFramerateNumerator;
	}
	public int getMaxFramerateDenominator() {
		return this.maxFramerateDenominator;
	}
	public void setMaxFramerateDenominator(int maxFramerateDenominator) {
		this.maxFramerateDenominator = maxFramerateDenominator;
	}
}
