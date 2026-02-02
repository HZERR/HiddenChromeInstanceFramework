package ru.hzerr.generated.css;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

public class CSSComputedStyleProperty {

	@Required
	@Description("Computed style property name.")
	private String name;

	@Required
	@Description("Computed style property value.")
	private String value;

    public CSSComputedStyleProperty() {
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
