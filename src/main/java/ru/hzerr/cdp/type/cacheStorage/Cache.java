package ru.hzerr.cdp.type.cacheStorage;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.storage.StorageBucket;

@Description("Cache identifier.")
public class Cache {

	@Required
	@Description("An opaque unique id of the cache.")
	@TypeDescription("Unique identifier of the Cache object.")
	private String cacheId;

	@Required
	@Description("Security origin of the cache.")
	private String securityOrigin;

	@Required
	@Description("Storage key of the cache.")
	private String storageKey;

	@Description("Storage bucket of the cache.")
	private StorageBucket storageBucket;

	@Required
	@Description("The name of the cache.")
	private String cacheName;

    public Cache() {
    }

	public String getCacheId() {
		return this.cacheId;
	}
	public void setCacheId(String cacheId) {
		this.cacheId = cacheId;
	}
	public String getSecurityOrigin() {
		return this.securityOrigin;
	}
	public void setSecurityOrigin(String securityOrigin) {
		this.securityOrigin = securityOrigin;
	}
	public String getStorageKey() {
		return this.storageKey;
	}
	public void setStorageKey(String storageKey) {
		this.storageKey = storageKey;
	}
	public StorageBucket getStorageBucket() {
		return this.storageBucket;
	}
	public void setStorageBucket(StorageBucket storageBucket) {
		this.storageBucket = storageBucket;
	}
	public String getCacheName() {
		return this.cacheName;
	}
	public void setCacheName(String cacheName) {
		this.cacheName = cacheName;
	}
}
