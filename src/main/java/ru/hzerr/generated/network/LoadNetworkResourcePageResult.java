package ru.hzerr.generated.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.generated.network.Headers;

@Experimental
@Description("An object providing the result of a network resource load.")
public class LoadNetworkResourcePageResult {

	@Required
	private boolean success;

	@Description("Optional values used for error reporting.")
	private Number netError;

	private String netErrorName;

	private Number httpStatusCode;

	@Description("If successful, one of the following two fields holds the result.")
	@TypeDescription("This is either obtained from another method or specified as `blob:<uuid>` where `<uuid>` is an UUID of a Blob.")
	private String stream;

	@Description("Response headers.")
	private Headers headers;

    public LoadNetworkResourcePageResult() {
    }

	public boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public Number getNetError() {
		return this.netError;
	}
	public void setNetError(Number netError) {
		this.netError = netError;
	}
	public String getNetErrorName() {
		return this.netErrorName;
	}
	public void setNetErrorName(String netErrorName) {
		this.netErrorName = netErrorName;
	}
	public Number getHttpStatusCode() {
		return this.httpStatusCode;
	}
	public void setHttpStatusCode(Number httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}
	public String getStream() {
		return this.stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public Headers getHeaders() {
		return this.headers;
	}
	public void setHeaders(Headers headers) {
		this.headers = headers;
	}
}
