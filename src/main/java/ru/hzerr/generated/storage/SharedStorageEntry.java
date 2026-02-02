package ru.hzerr.generated.storage;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Struct for a single key-value pair in an origin's shared storage.")
public class SharedStorageEntry {

	@Required
	private String key;

	@Required
	private String value;

    public SharedStorageEntry() {
    }

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
