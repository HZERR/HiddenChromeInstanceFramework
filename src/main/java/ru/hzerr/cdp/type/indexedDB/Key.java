package ru.hzerr.cdp.type.indexedDB;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;
import java.util.List;

@Description("Key.")
public class Key {

	@Required
	@Description("Key type.")
	@Enum({"number", "string", "date", "array"})
	private String type;

	@Description("Number value.")
	private Number number;

	@Description("String value.")
	private String string;

	@Description("Date value.")
	private Number date;

	@Description("Array value.")
	private List<Key> array;

    public Key() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Number getNumber() {
		return this.number;
	}
	public void setNumber(Number number) {
		this.number = number;
	}
	public String getString() {
		return this.string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public Number getDate() {
		return this.date;
	}
	public void setDate(Number date) {
		this.date = date;
	}
	public List<Key> getArray() {
		return this.array;
	}
	public void setArray(List<Key> array) {
		this.array = array;
	}
}
