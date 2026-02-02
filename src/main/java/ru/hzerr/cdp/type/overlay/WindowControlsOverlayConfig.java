package ru.hzerr.cdp.type.overlay;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Configuration for Window Controls Overlay")
public class WindowControlsOverlayConfig {

	@Required
	@Description("Whether the title bar CSS should be shown when emulating the Window Controls Overlay.")
	private boolean showCSS;

	@Required
	@Description("Selected platforms to show the overlay.")
	private String selectedPlatform;

	@Required
	@Description("The theme color defined in app manifest.")
	private String themeColor;

    public WindowControlsOverlayConfig() {
    }

	public boolean getShowCSS() {
		return this.showCSS;
	}
	public void setShowCSS(boolean showCSS) {
		this.showCSS = showCSS;
	}
	public String getSelectedPlatform() {
		return this.selectedPlatform;
	}
	public void setSelectedPlatform(String selectedPlatform) {
		this.selectedPlatform = selectedPlatform;
	}
	public String getThemeColor() {
		return this.themeColor;
	}
	public void setThemeColor(String themeColor) {
		this.themeColor = themeColor;
	}
}
