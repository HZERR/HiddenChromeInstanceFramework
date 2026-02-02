package ru.hzerr.generated.emulation;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Enum;

public class DevicePosture {

	@Required
	@Description("Current posture of the device")
	@Enum({"continuous", "folded"})
	private String type;

    public DevicePosture() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
