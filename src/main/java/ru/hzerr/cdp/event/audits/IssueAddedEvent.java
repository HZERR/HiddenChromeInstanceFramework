package ru.hzerr.cdp.event.audits;

import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.audits.InspectorIssue;

@Event("issueAdded")
public class IssueAddedEvent {

	@Required
	private InspectorIssue issue;

    public IssueAddedEvent() {
    }

	public InspectorIssue getIssue() {
		return this.issue;
	}
	public void setIssue(InspectorIssue issue) {
		this.issue = issue;
	}
}
