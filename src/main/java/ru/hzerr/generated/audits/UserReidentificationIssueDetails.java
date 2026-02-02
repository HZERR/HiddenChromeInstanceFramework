package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("This issue warns about uses of APIs that may be considered misuse to re-identify users.")
public class UserReidentificationIssueDetails {

	@Required
	private String type;

	@Description("Applies to BlockedFrameNavigation and BlockedSubresource issue types.")
	private AffectedRequest request;

	@Description("Applies to NoisedCanvasReadback issue type.")
	private SourceCodeLocation sourceCodeLocation;

    public UserReidentificationIssueDetails() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public AffectedRequest getRequest() {
		return this.request;
	}
	public void setRequest(AffectedRequest request) {
		this.request = request;
	}
	public SourceCodeLocation getSourceCodeLocation() {
		return this.sourceCodeLocation;
	}
	public void setSourceCodeLocation(SourceCodeLocation sourceCodeLocation) {
		this.sourceCodeLocation = sourceCodeLocation;
	}
}
