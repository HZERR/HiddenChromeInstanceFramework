package ru.hzerr.cdp.type.storage;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

public class StorageBucket {

	@Required
	private String storageKey;

	@Description("If not specified, it is the default bucket of the storageKey.")
	private String name;

    public StorageBucket() {
    }

	public String getStorageKey() {
		return this.storageKey;
	}
	public void setStorageKey(String storageKey) {
		this.storageKey = storageKey;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
