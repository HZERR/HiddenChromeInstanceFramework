package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;
import ru.hzerr.cdp.type.network.BlockedSetCookieWithReason;
import ru.hzerr.cdp.type.network.Headers;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.cdp.type.network.CookiePartitionKey;
import ru.hzerr.cdp.type.network.ExemptedSetCookieWithReason;

@Experimental
@Description("Fired when additional information about a responseReceived event is available from the network stack. Not every responseReceived event will have an additional responseReceivedExtraInfo for it, and responseReceivedExtraInfo may be fired before or after responseReceived.")
@Event("responseReceivedExtraInfo")
public class ResponseReceivedExtraInfoEvent {

	@Required
	@Description("Request identifier. Used to match this information to another responseReceived event.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

	@Required
	@Description("A list of cookies which were not stored from the response along with the corresponding reasons for blocking. The cookies here may not be valid due to syntax errors, which are represented by the invalid cookie line string instead of a proper cookie.")
	private List<BlockedSetCookieWithReason> blockedCookies;

	@Required
	@Description("Raw response headers as they were received over the wire. Duplicate headers in the response are represented as a single key with their values concatentated using `\n` as the separator. See also `headersText` that contains verbatim text for HTTP/1.*.")
	private Headers headers;

	@Required
	@Description("The IP address space of the resource. The address space can only be determined once the transport established the connection, so we can't send it in `requestWillBeSentExtraInfo`.")
	@TypeExperimental
	private String resourceIPAddressSpace;

	@Required
	@Description("The status code of the response. This is useful in cases the request failed and no responseReceived event is triggered, which is the case for, e.g., CORS errors. This is also the correct status code for cached requests, where the status in responseReceived is a 200 and this will be 304.")
	private int statusCode;

	@Description("Raw response header text as it was received over the wire. The raw text may not always be available, such as in the case of HTTP/2 or QUIC.")
	private String headersText;

	@Experimental
	@Description("The cookie partition key that will be used to store partitioned cookies set in this response. Only sent when partitioned cookies are enabled.")
	private CookiePartitionKey cookiePartitionKey;

	@Description("True if partitioned cookies are enabled, but the partition key is not serializable to string.")
	private boolean cookiePartitionKeyOpaque;

	@Description("A list of cookies which should have been blocked by 3PCD but are exempted and stored from the response with the corresponding reason.")
	private List<ExemptedSetCookieWithReason> exemptedCookies;

    public ResponseReceivedExtraInfoEvent() {
    }

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public List<BlockedSetCookieWithReason> getBlockedCookies() {
		return this.blockedCookies;
	}
	public void setBlockedCookies(List<BlockedSetCookieWithReason> blockedCookies) {
		this.blockedCookies = blockedCookies;
	}
	public Headers getHeaders() {
		return this.headers;
	}
	public void setHeaders(Headers headers) {
		this.headers = headers;
	}
	public String getResourceIPAddressSpace() {
		return this.resourceIPAddressSpace;
	}
	public void setResourceIPAddressSpace(String resourceIPAddressSpace) {
		this.resourceIPAddressSpace = resourceIPAddressSpace;
	}
	public int getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getHeadersText() {
		return this.headersText;
	}
	public void setHeadersText(String headersText) {
		this.headersText = headersText;
	}
	public CookiePartitionKey getCookiePartitionKey() {
		return this.cookiePartitionKey;
	}
	public void setCookiePartitionKey(CookiePartitionKey cookiePartitionKey) {
		this.cookiePartitionKey = cookiePartitionKey;
	}
	public boolean getCookiePartitionKeyOpaque() {
		return this.cookiePartitionKeyOpaque;
	}
	public void setCookiePartitionKeyOpaque(boolean cookiePartitionKeyOpaque) {
		this.cookiePartitionKeyOpaque = cookiePartitionKeyOpaque;
	}
	public List<ExemptedSetCookieWithReason> getExemptedCookies() {
		return this.exemptedCookies;
	}
	public void setExemptedCookies(List<ExemptedSetCookieWithReason> exemptedCookies) {
		this.exemptedCookies = exemptedCookies;
	}
}
