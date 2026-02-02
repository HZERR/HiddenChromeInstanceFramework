package ru.hzerr.cdp.type.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Details for issues about documents in Quirks Mode or Limited Quirks Mode that affects page layouting.")
public class QuirksModeIssueDetails {

	@Required
	@Description("If false, it means the document's mode is \"quirks\" instead of \"limited-quirks\".")
	private boolean isLimitedQuirksMode;

	@Required
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int documentNodeId;

	@Required
	private String url;

	@Required
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Required
	@TypeDescription("Unique loader identifier.")
	private String loaderId;

    public QuirksModeIssueDetails() {
    }

	public boolean getIsLimitedQuirksMode() {
		return this.isLimitedQuirksMode;
	}
	public void setIsLimitedQuirksMode(boolean isLimitedQuirksMode) {
		this.isLimitedQuirksMode = isLimitedQuirksMode;
	}
	public int getDocumentNodeId() {
		return this.documentNodeId;
	}
	public void setDocumentNodeId(int documentNodeId) {
		this.documentNodeId = documentNodeId;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public String getLoaderId() {
		return this.loaderId;
	}
	public void setLoaderId(String loaderId) {
		this.loaderId = loaderId;
	}
}
