package ru.hzerr.generated.fileSystem;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

public class BucketFileSystemLocator {

	@Required
	@Description("Storage key")
	private String storageKey;

	@Description("Bucket name. Not passing a `bucketName` will retrieve the default Bucket. (https://developer.mozilla.org/en-US/docs/Web/API/Storage_API#storage_buckets)")
	private String bucketName;

	@Required
	@Description("Path to the directory using each path component as an array item.")
	private String[] pathComponents;

    public BucketFileSystemLocator() {
    }

	public String getStorageKey() {
		return this.storageKey;
	}
	public void setStorageKey(String storageKey) {
		this.storageKey = storageKey;
	}
	public String getBucketName() {
		return this.bucketName;
	}
	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}
	public String[] getPathComponents() {
		return this.pathComponents;
	}
	public void setPathComponents(String[] pathComponents) {
		this.pathComponents = pathComponents;
	}
}
