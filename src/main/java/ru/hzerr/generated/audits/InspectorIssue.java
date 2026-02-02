package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("An inspector issue reported from the back-end.")
public class InspectorIssue {

	@Required
	@TypeDescription("A unique identifier for the type of issue. Each type may use one of the optional fields in InspectorIssueDetails to convey more specific information about the kind of issue.")
	private String code;

	@Required
	private InspectorIssueDetails details;

	@Description("A unique id for this issue. May be omitted if no other entity (e.g. exception, CDP message, etc.) is referencing this issue.")
	@TypeDescription("A unique id for a DevTools inspector issue. Allows other entities (e.g. exceptions, CDP message, console messages, etc.) to reference an issue.")
	private String issueId;

    public InspectorIssue() {
    }

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public InspectorIssueDetails getDetails() {
		return this.details;
	}
	public void setDetails(InspectorIssueDetails details) {
		this.details = details;
	}
	public String getIssueId() {
		return this.issueId;
	}
	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}
}
