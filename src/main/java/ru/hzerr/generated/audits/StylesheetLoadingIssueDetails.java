package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("This issue warns when a referenced stylesheet couldn't be loaded.")
public class StylesheetLoadingIssueDetails {

	@Required
	@Description("Source code position that referenced the failing stylesheet.")
	private SourceCodeLocation sourceCodeLocation;

	@Required
	@Description("Reason why the stylesheet couldn't be loaded.")
	private String styleSheetLoadingIssueReason;

	@Description("Contains additional info when the failure was due to a request.")
	private FailedRequestInfo failedRequestInfo;

    public StylesheetLoadingIssueDetails() {
    }

	public SourceCodeLocation getSourceCodeLocation() {
		return this.sourceCodeLocation;
	}
	public void setSourceCodeLocation(SourceCodeLocation sourceCodeLocation) {
		this.sourceCodeLocation = sourceCodeLocation;
	}
	public String getStyleSheetLoadingIssueReason() {
		return this.styleSheetLoadingIssueReason;
	}
	public void setStyleSheetLoadingIssueReason(String styleSheetLoadingIssueReason) {
		this.styleSheetLoadingIssueReason = styleSheetLoadingIssueReason;
	}
	public FailedRequestInfo getFailedRequestInfo() {
		return this.failedRequestInfo;
	}
	public void setFailedRequestInfo(FailedRequestInfo failedRequestInfo) {
		this.failedRequestInfo = failedRequestInfo;
	}
}
