package ru.hzerr.cdp.type.runtime;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Object internal property descriptor. This property isn't normally visible in JavaScript code.")
public class InternalPropertyDescriptor {

	@Required
	@Description("Conventional property name.")
	private String name;

	@Description("The value associated with the property.")
	private RemoteObject value;

    public InternalPropertyDescriptor() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public RemoteObject getValue() {
		return this.value;
	}
	public void setValue(RemoteObject value) {
		this.value = value;
	}
}
