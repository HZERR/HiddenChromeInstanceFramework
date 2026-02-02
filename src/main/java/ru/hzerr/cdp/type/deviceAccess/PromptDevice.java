package ru.hzerr.cdp.type.deviceAccess;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Device information displayed in a user prompt to select a device.")
public class PromptDevice {

	@Required
	@TypeDescription("A device id.")
	private String id;

	@Required
	@Description("Display name as it appears in a device request user prompt.")
	private String name;

    public PromptDevice() {
    }

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
