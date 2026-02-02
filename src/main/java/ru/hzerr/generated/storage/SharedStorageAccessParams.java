package ru.hzerr.generated.storage;

import ru.hzerr.annotation.Description;
import java.util.List;

@Description("Bundles the parameters for shared storage access events whose presence/absence can vary according to SharedStorageAccessType.")
public class SharedStorageAccessParams {

	@Description("Spec of the module script URL. Present only for SharedStorageAccessMethods: addModule and createWorklet.")
	private String scriptSourceUrl;

	@Description("String denoting \"context-origin\", \"script-origin\", or a custom origin to be used as the worklet's data origin. Present only for SharedStorageAccessMethod: createWorklet.")
	private String dataOrigin;

	@Description("Name of the registered operation to be run. Present only for SharedStorageAccessMethods: run and selectURL.")
	private String operationName;

	@Description("ID of the operation call. Present only for SharedStorageAccessMethods: run and selectURL.")
	private String operationId;

	@Description("Whether or not to keep the worket alive for future run or selectURL calls. Present only for SharedStorageAccessMethods: run and selectURL.")
	private boolean keepAlive;

	@Description("Configures the private aggregation options. Present only for SharedStorageAccessMethods: run and selectURL.")
	private SharedStoragePrivateAggregationConfig privateAggregationConfig;

	@Description("The operation's serialized data in bytes (converted to a string). Present only for SharedStorageAccessMethods: run and selectURL. TODO(crbug.com/401011862): Consider updating this parameter to binary.")
	private String serializedData;

	@Description("Array of candidate URLs' specs, along with any associated metadata. Present only for SharedStorageAccessMethod: selectURL.")
	private List<SharedStorageUrlWithMetadata> urlsWithMetadata;

	@Description("Spec of the URN:UUID generated for a selectURL call. Present only for SharedStorageAccessMethod: selectURL.")
	private String urnUuid;

	@Description("Key for a specific entry in an origin's shared storage. Present only for SharedStorageAccessMethods: set, append, delete, and get.")
	private String key;

	@Description("Value for a specific entry in an origin's shared storage. Present only for SharedStorageAccessMethods: set and append.")
	private String value;

	@Description("Whether or not to set an entry for a key if that key is already present. Present only for SharedStorageAccessMethod: set.")
	private boolean ignoreIfPresent;

	@Description("A number denoting the (0-based) order of the worklet's creation relative to all other shared storage worklets created by documents using the current storage partition. Present only for SharedStorageAccessMethods: addModule, createWorklet.")
	private int workletOrdinal;

	@Description("Hex representation of the DevTools token used as the TargetID for the associated shared storage worklet. Present only for SharedStorageAccessMethods: addModule, createWorklet, run, selectURL, and any other SharedStorageAccessMethod when the SharedStorageAccessScope is sharedStorageWorklet.")
	private String workletTargetId;

	@Description("Name of the lock to be acquired, if present. Optionally present only for SharedStorageAccessMethods: batchUpdate, set, append, delete, and clear.")
	private String withLock;

	@Description("If the method has been called as part of a batchUpdate, then this number identifies the batch to which it belongs. Optionally present only for SharedStorageAccessMethods: batchUpdate (required), set, append, delete, and clear.")
	private String batchUpdateId;

	@Description("Number of modifier methods sent in batch. Present only for SharedStorageAccessMethod: batchUpdate.")
	private int batchSize;

    public SharedStorageAccessParams() {
    }

	public String getScriptSourceUrl() {
		return this.scriptSourceUrl;
	}
	public void setScriptSourceUrl(String scriptSourceUrl) {
		this.scriptSourceUrl = scriptSourceUrl;
	}
	public String getDataOrigin() {
		return this.dataOrigin;
	}
	public void setDataOrigin(String dataOrigin) {
		this.dataOrigin = dataOrigin;
	}
	public String getOperationName() {
		return this.operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	public String getOperationId() {
		return this.operationId;
	}
	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	public boolean getKeepAlive() {
		return this.keepAlive;
	}
	public void setKeepAlive(boolean keepAlive) {
		this.keepAlive = keepAlive;
	}
	public SharedStoragePrivateAggregationConfig getPrivateAggregationConfig() {
		return this.privateAggregationConfig;
	}
	public void setPrivateAggregationConfig(SharedStoragePrivateAggregationConfig privateAggregationConfig) {
		this.privateAggregationConfig = privateAggregationConfig;
	}
	public String getSerializedData() {
		return this.serializedData;
	}
	public void setSerializedData(String serializedData) {
		this.serializedData = serializedData;
	}
	public List<SharedStorageUrlWithMetadata> getUrlsWithMetadata() {
		return this.urlsWithMetadata;
	}
	public void setUrlsWithMetadata(List<SharedStorageUrlWithMetadata> urlsWithMetadata) {
		this.urlsWithMetadata = urlsWithMetadata;
	}
	public String getUrnUuid() {
		return this.urnUuid;
	}
	public void setUrnUuid(String urnUuid) {
		this.urnUuid = urnUuid;
	}
	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean getIgnoreIfPresent() {
		return this.ignoreIfPresent;
	}
	public void setIgnoreIfPresent(boolean ignoreIfPresent) {
		this.ignoreIfPresent = ignoreIfPresent;
	}
	public int getWorkletOrdinal() {
		return this.workletOrdinal;
	}
	public void setWorkletOrdinal(int workletOrdinal) {
		this.workletOrdinal = workletOrdinal;
	}
	public String getWorkletTargetId() {
		return this.workletTargetId;
	}
	public void setWorkletTargetId(String workletTargetId) {
		this.workletTargetId = workletTargetId;
	}
	public String getWithLock() {
		return this.withLock;
	}
	public void setWithLock(String withLock) {
		this.withLock = withLock;
	}
	public String getBatchUpdateId() {
		return this.batchUpdateId;
	}
	public void setBatchUpdateId(String batchUpdateId) {
		this.batchUpdateId = batchUpdateId;
	}
	public int getBatchSize() {
		return this.batchSize;
	}
	public void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}
}
