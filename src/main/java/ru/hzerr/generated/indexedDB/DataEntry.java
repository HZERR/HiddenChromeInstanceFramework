package ru.hzerr.generated.indexedDB;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.generated.runtime.RemoteObject;

@Description("Data entry.")
public class DataEntry {

	@Required
	@Description("Key object.")
	private RemoteObject key;

	@Required
	@Description("Primary key object.")
	private RemoteObject primaryKey;

	@Required
	@Description("Value object.")
	private RemoteObject value;

    public DataEntry() {
    }

	public RemoteObject getKey() {
		return this.key;
	}
	public void setKey(RemoteObject key) {
		this.key = key;
	}
	public RemoteObject getPrimaryKey() {
		return this.primaryKey;
	}
	public void setPrimaryKey(RemoteObject primaryKey) {
		this.primaryKey = primaryKey;
	}
	public RemoteObject getValue() {
		return this.value;
	}
	public void setValue(RemoteObject value) {
		this.value = value;
	}
}
