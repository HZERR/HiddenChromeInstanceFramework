package ru.hzerr.cdp.event.domStorage;

import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.domStorage.StorageId;

@Event("domStorageItemsCleared")
public class DomStorageItemsClearedEvent {

	@Required
	private StorageId storageId;

    public DomStorageItemsClearedEvent() {
    }

	public StorageId getStorageId() {
		return this.storageId;
	}
	public void setStorageId(StorageId storageId) {
		this.storageId = storageId;
	}
}
