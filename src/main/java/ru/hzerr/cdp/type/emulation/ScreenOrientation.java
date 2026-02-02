package ru.hzerr.cdp.type.emulation;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;

@Description("Screen orientation.")
public class ScreenOrientation {

	@Required
	@Description("Orientation type.")
	@Enum({"portraitPrimary", "portraitSecondary", "landscapePrimary", "landscapeSecondary"})
	private String type;

	@Required
	@Description("Orientation angle.")
	private int angle;

    public ScreenOrientation() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAngle() {
		return this.angle;
	}
	public void setAngle(int angle) {
		this.angle = angle;
	}
}
