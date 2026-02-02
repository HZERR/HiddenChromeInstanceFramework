package ru.hzerr.generated.fetch;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Response HTTP header entry")
public class HeaderEntry {

	@Required
	private String name;

	@Required
	private String value;

    public HeaderEntry() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
