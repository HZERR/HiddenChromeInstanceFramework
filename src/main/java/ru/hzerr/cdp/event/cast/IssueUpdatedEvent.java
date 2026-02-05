package ru.hzerr.cdp.event.cast;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Description("This is fired whenever the outstanding issue/error message changes. |issueMessage| is empty if there is no issue.")
@Event("issueUpdated")
public class IssueUpdatedEvent {

	@Required
	private String issueMessage;

    public IssueUpdatedEvent() {
    }

	public String getIssueMessage() {
		return this.issueMessage;
	}
	public void setIssueMessage(String issueMessage) {
		this.issueMessage = issueMessage;
	}
}
