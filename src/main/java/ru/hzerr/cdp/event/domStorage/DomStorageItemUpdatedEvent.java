package ru.hzerr.cdp.event.domStorage;

import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.domStorage.StorageId;

@Event("domStorageItemUpdated")
public class DomStorageItemUpdatedEvent {

	@Required
	private StorageId storageId;

	@Required
	private String key;

	@Required
	private String oldValue;

	@Required
	private String newValue;

    public DomStorageItemUpdatedEvent() {
    }

	public StorageId getStorageId() {
		return this.storageId;
	}
	public void setStorageId(StorageId storageId) {
		this.storageId = storageId;
	}
	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getOldValue() {
		return this.oldValue;
	}
	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}
	public String getNewValue() {
		return this.newValue;
	}
	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}
}
