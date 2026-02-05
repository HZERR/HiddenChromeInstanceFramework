package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;
import ru.hzerr.cdp.type.network.AssociatedCookie;
import ru.hzerr.cdp.type.network.Headers;
import ru.hzerr.cdp.type.network.ConnectTiming;
import ru.hzerr.cdp.type.network.ClientSecurityState;

@Experimental
@Description("Fired when additional information about a requestWillBeSent event is available from the network stack. Not every requestWillBeSent event will have an additional requestWillBeSentExtraInfo fired for it, and there is no guarantee whether requestWillBeSent or requestWillBeSentExtraInfo will be fired first for the same request.")
@Event("requestWillBeSentExtraInfo")
public class RequestWillBeSentExtraInfoEvent {

	@Required
	@Description("Request identifier. Used to match this information to an existing requestWillBeSent event.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

	@Required
	@Description("A list of cookies potentially associated to the requested URL. This includes both cookies sent with the request and the ones not sent; the latter are distinguished by having blockedReasons field set.")
	private List<AssociatedCookie> associatedCookies;

	@Required
	@Description("Raw request headers as they will be sent over the wire.")
	private Headers headers;

	@Experimental
	@Required
	@Description("Connection timing information for the request.")
	private ConnectTiming connectTiming;

	@Description("The client security state set for the request.")
	private ClientSecurityState clientSecurityState;

	@Description("Whether the site has partitioned cookies stored in a partition different than the current one.")
	private boolean siteHasCookieInOtherPartition;

	@Description("The network conditions id if this request was affected by network conditions configured via emulateNetworkConditionsByRule.")
	private String appliedNetworkConditionsId;

    public RequestWillBeSentExtraInfoEvent() {
    }

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public List<AssociatedCookie> getAssociatedCookies() {
		return this.associatedCookies;
	}
	public void setAssociatedCookies(List<AssociatedCookie> associatedCookies) {
		this.associatedCookies = associatedCookies;
	}
	public Headers getHeaders() {
		return this.headers;
	}
	public void setHeaders(Headers headers) {
		this.headers = headers;
	}
	public ConnectTiming getConnectTiming() {
		return this.connectTiming;
	}
	public void setConnectTiming(ConnectTiming connectTiming) {
		this.connectTiming = connectTiming;
	}
	public ClientSecurityState getClientSecurityState() {
		return this.clientSecurityState;
	}
	public void setClientSecurityState(ClientSecurityState clientSecurityState) {
		this.clientSecurityState = clientSecurityState;
	}
	public boolean getSiteHasCookieInOtherPartition() {
		return this.siteHasCookieInOtherPartition;
	}
	public void setSiteHasCookieInOtherPartition(boolean siteHasCookieInOtherPartition) {
		this.siteHasCookieInOtherPartition = siteHasCookieInOtherPartition;
	}
	public String getAppliedNetworkConditionsId() {
		return this.appliedNetworkConditionsId;
	}
	public void setAppliedNetworkConditionsId(String appliedNetworkConditionsId) {
		this.appliedNetworkConditionsId = appliedNetworkConditionsId;
	}
}
