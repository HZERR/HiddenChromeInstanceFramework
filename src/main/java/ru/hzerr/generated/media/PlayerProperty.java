package ru.hzerr.generated.media;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Corresponds to kMediaPropertyChange")
public class PlayerProperty {

	@Required
	private String name;

	@Required
	private String value;

    public PlayerProperty() {
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
