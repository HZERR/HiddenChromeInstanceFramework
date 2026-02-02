package ru.hzerr.cdp.type.storage;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Usage for a storage type.")
public class UsageForType {

	@Required
	@Description("Name of storage type.")
	@TypeDescription("Enum of possible storage types.")
	private String storageType;

	@Required
	@Description("Storage usage (bytes).")
	private Number usage;

    public UsageForType() {
    }

	public String getStorageType() {
		return this.storageType;
	}
	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}
	public Number getUsage() {
		return this.usage;
	}
	public void setUsage(Number usage) {
		this.usage = usage;
	}
}
