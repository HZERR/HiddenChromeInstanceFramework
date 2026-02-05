package ru.hzerr.cdp.event.target;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Description("Issued when a target has crashed.")
@Event("targetCrashed")
public class TargetCrashedEvent {

	@Required
	private String targetId;

	@Required
	@Description("Termination status type.")
	private String status;

	@Required
	@Description("Termination error code.")
	private int errorCode;

    public TargetCrashedEvent() {
    }

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}
	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
}
