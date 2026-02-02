package ru.hzerr.cdp.type.domStorage;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("DOM Storage identifier.")
public class StorageId {

	@Description("Security origin for the storage.")
	private String securityOrigin;

	@Description("Represents a key by which DOM Storage keys its CachedStorageAreas")
	private String storageKey;

	@Required
	@Description("Whether the storage is local storage (not session storage).")
	private boolean isLocalStorage;

    public StorageId() {
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
	public boolean getIsLocalStorage() {
		return this.isLocalStorage;
	}
	public void setIsLocalStorage(boolean isLocalStorage) {
		this.isLocalStorage = isLocalStorage;
	}
}
