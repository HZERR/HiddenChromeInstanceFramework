package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.network.CorsErrorStatus;

@Description("Fired when HTTP request has failed to load.")
@Event("loadingFailed")
public class LoadingFailedEvent {

	@Required
	@Description("Request identifier.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

	@Required
	@Description("Timestamp.")
	@TypeDescription("Monotonically increasing time in seconds since an arbitrary point in the past.")
	private Number timestamp;

	@Required
	@Description("Resource type.")
	@TypeDescription("Resource type as it was perceived by the rendering engine.")
	private String type;

	@Required
	@Description("Error message. List of network errors: https://cs.chromium.org/chromium/src/net/base/net_error_list.h")
	private String errorText;

	@Description("True if loading was canceled.")
	private boolean canceled;

	@Description("The reason why loading was blocked, if any.")
	@TypeDescription("The reason why request was blocked.")
	private String blockedReason;

	@Description("The reason why loading was blocked by CORS, if any.")
	private CorsErrorStatus corsErrorStatus;

    public LoadingFailedEvent() {
    }

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getErrorText() {
		return this.errorText;
	}
	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}
	public boolean getCanceled() {
		return this.canceled;
	}
	public void setCanceled(boolean canceled) {
		this.canceled = canceled;
	}
	public String getBlockedReason() {
		return this.blockedReason;
	}
	public void setBlockedReason(String blockedReason) {
		this.blockedReason = blockedReason;
	}
	public CorsErrorStatus getCorsErrorStatus() {
		return this.corsErrorStatus;
	}
	public void setCorsErrorStatus(CorsErrorStatus corsErrorStatus) {
		this.corsErrorStatus = corsErrorStatus;
	}
}
