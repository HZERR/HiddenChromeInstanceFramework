package ru.hzerr.generated.runtime;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Object property descriptor.")
public class PropertyDescriptor {

	@Required
	@Description("Property name or symbol description.")
	private String name;

	@Description("The value associated with the property.")
	private RemoteObject value;

	@Description("True if the value associated with the property may be changed (data descriptors only).")
	private boolean writable;

	@Description("A function which serves as a getter for the property, or `undefined` if there is no getter (accessor descriptors only).")
	private RemoteObject get;

	@Description("A function which serves as a setter for the property, or `undefined` if there is no setter (accessor descriptors only).")
	private RemoteObject set;

	@Required
	@Description("True if the type of this property descriptor may be changed and if the property may be deleted from the corresponding object.")
	private boolean configurable;

	@Required
	@Description("True if this property shows up during enumeration of the properties on the corresponding object.")
	private boolean enumerable;

	@Description("True if the result was thrown during the evaluation.")
	private boolean wasThrown;

	@Description("True if the property is owned for the object.")
	private boolean isOwn;

	@Description("Property symbol object, if the property is of the `symbol` type.")
	private RemoteObject symbol;

    public PropertyDescriptor() {
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
	public boolean getWritable() {
		return this.writable;
	}
	public void setWritable(boolean writable) {
		this.writable = writable;
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
	public boolean getConfigurable() {
		return this.configurable;
	}
	public void setConfigurable(boolean configurable) {
		this.configurable = configurable;
	}
	public boolean getEnumerable() {
		return this.enumerable;
	}
	public void setEnumerable(boolean enumerable) {
		this.enumerable = enumerable;
	}
	public boolean getWasThrown() {
		return this.wasThrown;
	}
	public void setWasThrown(boolean wasThrown) {
		this.wasThrown = wasThrown;
	}
	public boolean getIsOwn() {
		return this.isOwn;
	}
	public void setIsOwn(boolean isOwn) {
		this.isOwn = isOwn;
	}
	public RemoteObject getSymbol() {
		return this.symbol;
	}
	public void setSymbol(RemoteObject symbol) {
		this.symbol = symbol;
	}
}
