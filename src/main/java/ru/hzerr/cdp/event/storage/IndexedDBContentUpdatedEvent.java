package ru.hzerr.cdp.event.storage;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Description("The origin's IndexedDB object store has been modified.")
@Event("indexedDBContentUpdated")
public class IndexedDBContentUpdatedEvent {

	@Required
	@Description("Origin to update.")
	private String origin;

	@Required
	@Description("Storage key to update.")
	private String storageKey;

	@Required
	@Description("Storage bucket to update.")
	private String bucketId;

	@Required
	@Description("Database to update.")
	private String databaseName;

	@Required
	@Description("ObjectStore to update.")
	private String objectStoreName;

    public IndexedDBContentUpdatedEvent() {
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
	public String getDatabaseName() {
		return this.databaseName;
	}
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	public String getObjectStoreName() {
		return this.objectStoreName;
	}
	public void setObjectStoreName(String objectStoreName) {
		this.objectStoreName = objectStoreName;
	}
}
