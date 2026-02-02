package ru.hzerr.generated.indexedDB;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;

@Description("Key path.")
public class KeyPath {

	@Required
	@Description("Key path type.")
	@Enum({"null", "string", "array"})
	private String type;

	@Description("String value.")
	private String string;

	@Description("Array value.")
	private String[] array;

    public KeyPath() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getString() {
		return this.string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public String[] getArray() {
		return this.array;
	}
	public void setArray(String[] array) {
		this.array = array;
	}
}
