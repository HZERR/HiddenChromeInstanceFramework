package ru.hzerr.cdp.event.domStorage;

import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.domStorage.StorageId;

@Event("domStorageItemRemoved")
public class DomStorageItemRemovedEvent {

	@Required
	private StorageId storageId;

	@Required
	private String key;

    public DomStorageItemRemovedEvent() {
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
}
