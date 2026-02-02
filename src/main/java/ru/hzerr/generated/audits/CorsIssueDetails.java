package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.generated.network.CorsErrorStatus;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.generated.network.ClientSecurityState;

@Description("Details for a CORS related issue, e.g. a warning or error related to CORS RFC1918 enforcement.")
public class CorsIssueDetails {

	@Required
	private CorsErrorStatus corsErrorStatus;

	@Required
	private boolean isWarning;

	@Required
	private AffectedRequest request;

	private SourceCodeLocation location;

	private String initiatorOrigin;

	@TypeExperimental
	private String resourceIPAddressSpace;

	private ClientSecurityState clientSecurityState;

    public CorsIssueDetails() {
    }

	public CorsErrorStatus getCorsErrorStatus() {
		return this.corsErrorStatus;
	}
	public void setCorsErrorStatus(CorsErrorStatus corsErrorStatus) {
		this.corsErrorStatus = corsErrorStatus;
	}
	public boolean getIsWarning() {
		return this.isWarning;
	}
	public void setIsWarning(boolean isWarning) {
		this.isWarning = isWarning;
	}
	public AffectedRequest getRequest() {
		return this.request;
	}
	public void setRequest(AffectedRequest request) {
		this.request = request;
	}
	public SourceCodeLocation getLocation() {
		return this.location;
	}
	public void setLocation(SourceCodeLocation location) {
		this.location = location;
	}
	public String getInitiatorOrigin() {
		return this.initiatorOrigin;
	}
	public void setInitiatorOrigin(String initiatorOrigin) {
		this.initiatorOrigin = initiatorOrigin;
	}
	public String getResourceIPAddressSpace() {
		return this.resourceIPAddressSpace;
	}
	public void setResourceIPAddressSpace(String resourceIPAddressSpace) {
		this.resourceIPAddressSpace = resourceIPAddressSpace;
	}
	public ClientSecurityState getClientSecurityState() {
		return this.clientSecurityState;
	}
	public void setClientSecurityState(ClientSecurityState clientSecurityState) {
		this.clientSecurityState = clientSecurityState;
	}
}
