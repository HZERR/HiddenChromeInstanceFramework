package ru.hzerr.cdp.type.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Experimental
@Description("Information about a signed exchange response.")
public class SignedExchangeInfo {

	@Required
	@Description("The outer response of signed HTTP exchange which was received from network.")
	private Response outerResponse;

	@Required
	@Description("Whether network response for the signed exchange was accompanied by extra headers.")
	private boolean hasExtraInfo;

	@Description("Information about the signed exchange header.")
	private SignedExchangeHeader header;

	@Description("Security details for the signed exchange header.")
	private SecurityDetails securityDetails;

	@Description("Errors occurred while handling the signed exchange.")
	private List<SignedExchangeError> errors;

    public SignedExchangeInfo() {
    }

	public Response getOuterResponse() {
		return this.outerResponse;
	}
	public void setOuterResponse(Response outerResponse) {
		this.outerResponse = outerResponse;
	}
	public boolean getHasExtraInfo() {
		return this.hasExtraInfo;
	}
	public void setHasExtraInfo(boolean hasExtraInfo) {
		this.hasExtraInfo = hasExtraInfo;
	}
	public SignedExchangeHeader getHeader() {
		return this.header;
	}
	public void setHeader(SignedExchangeHeader header) {
		this.header = header;
	}
	public SecurityDetails getSecurityDetails() {
		return this.securityDetails;
	}
	public void setSecurityDetails(SecurityDetails securityDetails) {
		this.securityDetails = securityDetails;
	}
	public List<SignedExchangeError> getErrors() {
		return this.errors;
	}
	public void setErrors(List<SignedExchangeError> errors) {
		this.errors = errors;
	}
}
