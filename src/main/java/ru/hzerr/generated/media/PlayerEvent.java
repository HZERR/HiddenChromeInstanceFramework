package ru.hzerr.generated.media;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Corresponds to kMediaEventTriggered")
public class PlayerEvent {

	@Required
	private Number timestamp;

	@Required
	private String value;

    public PlayerEvent() {
    }

	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
