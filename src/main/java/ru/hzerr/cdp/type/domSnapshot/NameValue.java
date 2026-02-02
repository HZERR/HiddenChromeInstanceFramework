package ru.hzerr.cdp.type.domSnapshot;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("A name/value pair.")
public class NameValue {

	@Required
	@Description("Attribute/property name.")
	private String name;

	@Required
	@Description("Attribute/property value.")
	private String value;

    public NameValue() {
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
