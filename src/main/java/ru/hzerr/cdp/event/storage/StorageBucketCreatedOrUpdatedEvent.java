package ru.hzerr.cdp.event.storage;

import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.storage.StorageBucketInfo;

@Event("storageBucketCreatedOrUpdated")
public class StorageBucketCreatedOrUpdatedEvent {

	@Required
	private StorageBucketInfo bucketInfo;

    public StorageBucketCreatedOrUpdatedEvent() {
    }

	public StorageBucketInfo getBucketInfo() {
		return this.bucketInfo;
	}
	public void setBucketInfo(StorageBucketInfo bucketInfo) {
		this.bucketInfo = bucketInfo;
	}
}
