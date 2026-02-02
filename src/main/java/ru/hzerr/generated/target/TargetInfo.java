package ru.hzerr.generated.target;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.TypeExperimental;

public class TargetInfo {

	@Required
	private String targetId;

	@Required
	@Description("List of types: https://source.chromium.org/chromium/chromium/src/+/main:content/browser/devtools/devtools_agent_host_impl.cc?ss=chromium&q=f:devtools%20-f:out%20%22::kTypeTab%5B%5D%22")
	private String type;

	@Required
	private String title;

	@Required
	private String url;

	@Required
	@Description("Whether the target has an attached client.")
	private boolean attached;

	@Description("Opener target Id")
	private String openerId;

	@Experimental
	@Required
	@Description("Whether the target has access to the originating window.")
	private boolean canAccessOpener;

	@Experimental
	@Description("Frame id of originating window (is only set if target has an opener).")
	@TypeDescription("Unique frame identifier.")
	private String openerFrameId;

	@Experimental
	@Description("Id of the parent frame, only present for the \"iframe\" targets.")
	@TypeDescription("Unique frame identifier.")
	private String parentFrameId;

	@Experimental
	@TypeExperimental
	private String browserContextId;

	@Experimental
	@Description("Provides additional details for specific target types. For example, for the type of \"page\", this may be set to \"prerender\".")
	private String subtype;

    public TargetInfo() {
    }

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public boolean getAttached() {
		return this.attached;
	}
	public void setAttached(boolean attached) {
		this.attached = attached;
	}
	public String getOpenerId() {
		return this.openerId;
	}
	public void setOpenerId(String openerId) {
		this.openerId = openerId;
	}
	public boolean getCanAccessOpener() {
		return this.canAccessOpener;
	}
	public void setCanAccessOpener(boolean canAccessOpener) {
		this.canAccessOpener = canAccessOpener;
	}
	public String getOpenerFrameId() {
		return this.openerFrameId;
	}
	public void setOpenerFrameId(String openerFrameId) {
		this.openerFrameId = openerFrameId;
	}
	public String getParentFrameId() {
		return this.parentFrameId;
	}
	public void setParentFrameId(String parentFrameId) {
		this.parentFrameId = parentFrameId;
	}
	public String getBrowserContextId() {
		return this.browserContextId;
	}
	public void setBrowserContextId(String browserContextId) {
		this.browserContextId = browserContextId;
	}
	public String getSubtype() {
		return this.subtype;
	}
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}
}
