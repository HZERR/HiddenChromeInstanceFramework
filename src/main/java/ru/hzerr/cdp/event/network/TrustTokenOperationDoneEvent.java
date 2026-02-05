package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Fired exactly once for each Trust Token operation. Depending on the type of the operation and whether the operation succeeded or failed, the event is fired before the corresponding request was sent or after the response was received.")
@Event("trustTokenOperationDone")
public class TrustTokenOperationDoneEvent {

	@Required
	@Description("Detailed success or error status of the operation. 'AlreadyExists' also signifies a successful operation, as the result of the operation already exists und thus, the operation was abort preemptively (e.g. a cache hit).")
	@Enum({"Ok", "InvalidArgument", "MissingIssuerKeys", "FailedPrecondition", "ResourceExhausted", "AlreadyExists", "ResourceLimited", "Unauthorized", "BadResponse", "InternalError", "UnknownError", "FulfilledLocally", "SiteIssuerLimit"})
	private String status;

	@Required
	@TypeExperimental
	private String type;

	@Required
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

	@Description("Top level origin. The context in which the operation was attempted.")
	private String topLevelOrigin;

	@Description("Origin of the issuer in case of a \"Issuance\" or \"Redemption\" operation.")
	private String issuerOrigin;

	@Description("The number of obtained Trust Tokens on a successful \"Issuance\" operation.")
	private int issuedTokenCount;

    public TrustTokenOperationDoneEvent() {
    }

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getTopLevelOrigin() {
		return this.topLevelOrigin;
	}
	public void setTopLevelOrigin(String topLevelOrigin) {
		this.topLevelOrigin = topLevelOrigin;
	}
	public String getIssuerOrigin() {
		return this.issuerOrigin;
	}
	public void setIssuerOrigin(String issuerOrigin) {
		this.issuerOrigin = issuerOrigin;
	}
	public int getIssuedTokenCount() {
		return this.issuedTokenCount;
	}
	public void setIssuedTokenCount(int issuedTokenCount) {
		this.issuedTokenCount = issuedTokenCount;
	}
}
