package ru.hzerr.generated.runtime;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Experimental
@Description("Object private field descriptor.")
public class PrivatePropertyDescriptor {

	@Required
	@Description("Private property name.")
	private String name;

	@Description("The value associated with the private property.")
	private RemoteObject value;

	@Description("A function which serves as a getter for the private property, or `undefined` if there is no getter (accessor descriptors only).")
	private RemoteObject get;

	@Description("A function which serves as a setter for the private property, or `undefined` if there is no setter (accessor descriptors only).")
	private RemoteObject set;

    public PrivatePropertyDescriptor() {
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
	public RemoteObject getGet() {
		return this.get;
	}
	public void setGet(RemoteObject get) {
		this.get = get;
	}
	public RemoteObject getSet() {
		return this.set;
	}
	public void setSet(RemoteObject set) {
		this.set = set;
	}
}
