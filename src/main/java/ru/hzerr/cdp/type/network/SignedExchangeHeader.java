package ru.hzerr.cdp.type.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Experimental
@Description("Information about a signed exchange header. https://wicg.github.io/webpackage/draft-yasskin-httpbis-origin-signed-exchanges-impl.html#cbor-representation")
public class SignedExchangeHeader {

	@Required
	@Description("Signed exchange request URL.")
	private String requestUrl;

	@Required
	@Description("Signed exchange response code.")
	private int responseCode;

	@Required
	@Description("Signed exchange response headers.")
	private Headers responseHeaders;

	@Required
	@Description("Signed exchange response signature.")
	private List<SignedExchangeSignature> signatures;

	@Required
	@Description("Signed exchange header integrity hash in the form of `sha256-<base64-hash-value>`.")
	private String headerIntegrity;

    public SignedExchangeHeader() {
    }

	public String getRequestUrl() {
		return this.requestUrl;
	}
	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}
	public int getResponseCode() {
		return this.responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public Headers getResponseHeaders() {
		return this.responseHeaders;
	}
	public void setResponseHeaders(Headers responseHeaders) {
		this.responseHeaders = responseHeaders;
	}
	public List<SignedExchangeSignature> getSignatures() {
		return this.signatures;
	}
	public void setSignatures(List<SignedExchangeSignature> signatures) {
		this.signatures = signatures;
	}
	public String getHeaderIntegrity() {
		return this.headerIntegrity;
	}
	public void setHeaderIntegrity(String headerIntegrity) {
		this.headerIntegrity = headerIntegrity;
	}
}
