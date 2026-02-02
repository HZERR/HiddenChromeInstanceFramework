package ru.hzerr.generated.backgroundService;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("A key-value pair for additional event information to pass along.")
public class EventMetadata {

	@Required
	private String key;

	@Required
	private String value;

    public EventMetadata() {
    }

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
