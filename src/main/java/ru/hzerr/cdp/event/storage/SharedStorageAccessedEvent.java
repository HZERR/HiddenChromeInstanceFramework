package ru.hzerr.cdp.event.storage;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.storage.SharedStorageAccessParams;

@Description("Shared storage was accessed by the associated page. The following parameters are included in all events.")
@Event("sharedStorageAccessed")
public class SharedStorageAccessedEvent {

	@Required
	@Description("Time of the access.")
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number accessTime;

	@Required
	@Description("Enum value indicating the access scope.")
	@TypeDescription("Enum of shared storage access scopes.")
	private String scope;

	@Required
	@Description("Enum value indicating the Shared Storage API method invoked.")
	@TypeDescription("Enum of shared storage access methods.")
	private String method;

	@Required
	@Description("DevTools Frame Token for the primary frame tree's root.")
	@TypeDescription("Unique frame identifier.")
	private String mainFrameId;

	@Required
	@Description("Serialization of the origin owning the Shared Storage data.")
	private String ownerOrigin;

	@Required
	@Description("Serialization of the site owning the Shared Storage data.")
	private String ownerSite;

	@Required
	@Description("The sub-parameters wrapped by `params` are all optional and their presence/absence depends on `type`.")
	private SharedStorageAccessParams params;

    public SharedStorageAccessedEvent() {
    }

	public Number getAccessTime() {
		return this.accessTime;
	}
	public void setAccessTime(Number accessTime) {
		this.accessTime = accessTime;
	}
	public String getScope() {
		return this.scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getMethod() {
		return this.method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getMainFrameId() {
		return this.mainFrameId;
	}
	public void setMainFrameId(String mainFrameId) {
		this.mainFrameId = mainFrameId;
	}
	public String getOwnerOrigin() {
		return this.ownerOrigin;
	}
	public void setOwnerOrigin(String ownerOrigin) {
		this.ownerOrigin = ownerOrigin;
	}
	public String getOwnerSite() {
		return this.ownerSite;
	}
	public void setOwnerSite(String ownerSite) {
		this.ownerSite = ownerSite;
	}
	public SharedStorageAccessParams getParams() {
		return this.params;
	}
	public void setParams(SharedStorageAccessParams params) {
		this.params = params;
	}
}
