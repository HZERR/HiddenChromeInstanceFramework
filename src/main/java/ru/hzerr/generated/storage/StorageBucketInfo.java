package ru.hzerr.generated.storage;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Description;

public class StorageBucketInfo {

	@Required
	private StorageBucket bucket;

	@Required
	private String id;

	@Required
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number expiration;

	@Required
	@Description("Storage quota (bytes).")
	private Number quota;

	@Required
	private boolean persistent;

	@Required
	private String durability;

    public StorageBucketInfo() {
    }

	public StorageBucket getBucket() {
		return this.bucket;
	}
	public void setBucket(StorageBucket bucket) {
		this.bucket = bucket;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Number getExpiration() {
		return this.expiration;
	}
	public void setExpiration(Number expiration) {
		this.expiration = expiration;
	}
	public Number getQuota() {
		return this.quota;
	}
	public void setQuota(Number quota) {
		this.quota = quota;
	}
	public boolean getPersistent() {
		return this.persistent;
	}
	public void setPersistent(boolean persistent) {
		this.persistent = persistent;
	}
	public String getDurability() {
		return this.durability;
	}
	public void setDurability(String durability) {
		this.durability = durability;
	}
}
