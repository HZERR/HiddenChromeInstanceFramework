package ru.hzerr.cdp.event.deviceAccess;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;
import ru.hzerr.cdp.type.deviceAccess.PromptDevice;

@Description("A device request opened a user prompt to select a device. Respond with the selectPrompt or cancelPrompt command.")
@Event("deviceRequestPrompted")
public class DeviceRequestPromptedEvent {

	@Required
	@TypeDescription("Device request id.")
	private String id;

	@Required
	private List<PromptDevice> devices;

    public DeviceRequestPromptedEvent() {
    }

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<PromptDevice> getDevices() {
		return this.devices;
	}
	public void setDevices(List<PromptDevice> devices) {
		this.devices = devices;
	}
}
