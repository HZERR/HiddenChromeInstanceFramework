package ru.hzerr.cdp.event.storage;

import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Event("storageBucketDeleted")
public class StorageBucketDeletedEvent {

	@Required
	private String bucketId;

    public StorageBucketDeletedEvent() {
    }

	public String getBucketId() {
		return this.bucketId;
	}
	public void setBucketId(String bucketId) {
		this.bucketId = bucketId;
	}
}
