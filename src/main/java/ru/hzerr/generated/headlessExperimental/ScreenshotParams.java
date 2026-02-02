package ru.hzerr.generated.headlessExperimental;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Enum;

@Description("Encoding options for a screenshot.")
public class ScreenshotParams {

	@Description("Image compression format (defaults to png).")
	@Enum({"jpeg", "png", "webp"})
	private String format;

	@Description("Compression quality from range [0..100] (jpeg and webp only).")
	private int quality;

	@Description("Optimize image encoding for speed, not for resulting size (defaults to false)")
	private boolean optimizeForSpeed;

    public ScreenshotParams() {
    }

	public String getFormat() {
		return this.format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public int getQuality() {
		return this.quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public boolean getOptimizeForSpeed() {
		return this.optimizeForSpeed;
	}
	public void setOptimizeForSpeed(boolean optimizeForSpeed) {
		this.optimizeForSpeed = optimizeForSpeed;
	}
}
