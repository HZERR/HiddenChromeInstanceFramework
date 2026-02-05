package ru.hzerr.cdp.event.storage;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Description("A cache has been added/deleted.")
@Event("cacheStorageListUpdated")
public class CacheStorageListUpdatedEvent {

	@Required
	@Description("Origin to update.")
	private String origin;

	@Required
	@Description("Storage key to update.")
	private String storageKey;

	@Required
	@Description("Storage bucket to update.")
	private String bucketId;

    public CacheStorageListUpdatedEvent() {
    }

	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getStorageKey() {
		return this.storageKey;
	}
	public void setStorageKey(String storageKey) {
		this.storageKey = storageKey;
	}
	public String getBucketId() {
		return this.bucketId;
	}
	public void setBucketId(String bucketId) {
		this.bucketId = bucketId;
	}
}
