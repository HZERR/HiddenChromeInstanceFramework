package ru.hzerr.cdp.type.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Experimental;
import java.util.List;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Enum;

@Description("HTTP request data.")
public class Request {

	@Required
	@Description("Request URL (without fragment).")
	private String url;

	@Description("Fragment of the requested URL starting with hash, if present.")
	private String urlFragment;

	@Required
	@Description("HTTP request method.")
	private String method;

	@Required
	@Description("HTTP request headers.")
	private Headers headers;

	@Deprecated
	@Description("HTTP POST request data. Use postDataEntries instead.")
	private String postData;

	@Description("True when the request has POST data. Note that postData might still be omitted when this flag is true when the data is too long.")
	private boolean hasPostData;

	@Experimental
	@Description("Request body elements (post data broken into individual entries).")
	private List<PostDataEntry> postDataEntries;

	@Description("The mixed content type of the request.")
	@TypeDescription("A description of mixed content (HTTP resources on HTTPS pages), as defined by https://www.w3.org/TR/mixed-content/#categories")
	private String mixedContentType;

	@Required
	@Description("Priority of the resource request at the time request is sent.")
	@TypeDescription("Loading priority of a resource request.")
	private String initialPriority;

	@Required
	@Description("The referrer policy of the request, as defined in https://www.w3.org/TR/referrer-policy/")
	@Enum({"unsafe-url", "no-referrer-when-downgrade", "no-referrer", "origin", "origin-when-cross-origin", "same-origin", "strict-origin", "strict-origin-when-cross-origin"})
	private String referrerPolicy;

	@Description("Whether is loaded via link preload.")
	private boolean isLinkPreload;

	@Experimental
	@Description("Set for requests when the TrustToken API is used. Contains the parameters passed by the developer (e.g. via \"fetch\") as understood by the backend.")
	private TrustTokenParams trustTokenParams;

	@Experimental
	@Description("True if this resource request is considered to be the 'same site' as the request corresponding to the main frame.")
	private boolean isSameSite;

	@Experimental
	@Description("True when the resource request is ad-related.")
	private boolean isAdRelated;

    public Request() {
    }

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrlFragment() {
		return this.urlFragment;
	}
	public void setUrlFragment(String urlFragment) {
		this.urlFragment = urlFragment;
	}
	public String getMethod() {
		return this.method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public Headers getHeaders() {
		return this.headers;
	}
	public void setHeaders(Headers headers) {
		this.headers = headers;
	}
	public String getPostData() {
		return this.postData;
	}
	public void setPostData(String postData) {
		this.postData = postData;
	}
	public boolean getHasPostData() {
		return this.hasPostData;
	}
	public void setHasPostData(boolean hasPostData) {
		this.hasPostData = hasPostData;
	}
	public List<PostDataEntry> getPostDataEntries() {
		return this.postDataEntries;
	}
	public void setPostDataEntries(List<PostDataEntry> postDataEntries) {
		this.postDataEntries = postDataEntries;
	}
	public String getMixedContentType() {
		return this.mixedContentType;
	}
	public void setMixedContentType(String mixedContentType) {
		this.mixedContentType = mixedContentType;
	}
	public String getInitialPriority() {
		return this.initialPriority;
	}
	public void setInitialPriority(String initialPriority) {
		this.initialPriority = initialPriority;
	}
	public String getReferrerPolicy() {
		return this.referrerPolicy;
	}
	public void setReferrerPolicy(String referrerPolicy) {
		this.referrerPolicy = referrerPolicy;
	}
	public boolean getIsLinkPreload() {
		return this.isLinkPreload;
	}
	public void setIsLinkPreload(boolean isLinkPreload) {
		this.isLinkPreload = isLinkPreload;
	}
	public TrustTokenParams getTrustTokenParams() {
		return this.trustTokenParams;
	}
	public void setTrustTokenParams(TrustTokenParams trustTokenParams) {
		this.trustTokenParams = trustTokenParams;
	}
	public boolean getIsSameSite() {
		return this.isSameSite;
	}
	public void setIsSameSite(boolean isSameSite) {
		this.isSameSite = isSameSite;
	}
	public boolean getIsAdRelated() {
		return this.isAdRelated;
	}
	public void setIsAdRelated(boolean isAdRelated) {
		this.isAdRelated = isAdRelated;
	}
}
