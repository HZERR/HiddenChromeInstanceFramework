package ru.hzerr.cdp.type.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.TypeExperimental;

@Description("HTTP response data.")
public class Response {

	@Required
	@Description("Response URL. This URL can be different from CachedResource.url in case of redirect.")
	private String url;

	@Required
	@Description("HTTP response status code.")
	private int status;

	@Required
	@Description("HTTP response status text.")
	private String statusText;

	@Required
	@Description("HTTP response headers.")
	private Headers headers;

	@Deprecated
	@Description("HTTP response headers text. This has been replaced by the headers in Network.responseReceivedExtraInfo.")
	private String headersText;

	@Required
	@Description("Resource mimeType as determined by the browser.")
	private String mimeType;

	@Required
	@Description("Resource charset as determined by the browser (if applicable).")
	private String charset;

	@Description("Refined HTTP request headers that were actually transmitted over the network.")
	private Headers requestHeaders;

	@Deprecated
	@Description("HTTP request headers text. This has been replaced by the headers in Network.requestWillBeSentExtraInfo.")
	private String requestHeadersText;

	@Required
	@Description("Specifies whether physical connection was actually reused for this request.")
	private boolean connectionReused;

	@Required
	@Description("Physical connection id that was actually used for this request.")
	private Number connectionId;

	@Description("Remote IP address.")
	private String remoteIPAddress;

	@Description("Remote port.")
	private int remotePort;

	@Description("Specifies that the request was served from the disk cache.")
	private boolean fromDiskCache;

	@Description("Specifies that the request was served from the ServiceWorker.")
	private boolean fromServiceWorker;

	@Description("Specifies that the request was served from the prefetch cache.")
	private boolean fromPrefetchCache;

	@Description("Specifies that the request was served from the prefetch cache.")
	private boolean fromEarlyHints;

	@Experimental
	@Description("Information about how ServiceWorker Static Router API was used. If this field is set with `matchedSourceType` field, a matching rule is found. If this field is set without `matchedSource`, no matching rule is found. Otherwise, the API is not used.")
	private ServiceWorkerRouterInfo serviceWorkerRouterInfo;

	@Required
	@Description("Total number of bytes received for this request so far.")
	private Number encodedDataLength;

	@Description("Timing information for the given request.")
	private ResourceTiming timing;

	@Description("Response source of response from ServiceWorker.")
	@TypeDescription("Source of serviceworker response.")
	private String serviceWorkerResponseSource;

	@Description("The time at which the returned response was generated.")
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number responseTime;

	@Description("Cache Storage Cache Name.")
	private String cacheStorageCacheName;

	@Description("Protocol used to fetch this request.")
	private String protocol;

	@Experimental
	@Description("The reason why Chrome uses a specific transport protocol for HTTP semantics.")
	@TypeExperimental
	@TypeDescription("The reason why Chrome uses a specific transport protocol for HTTP semantics.")
	private String alternateProtocolUsage;

	@Required
	@Description("Security state of the request resource.")
	@TypeDescription("The security level of a page or resource.")
	private String securityState;

	@Description("Security details for the request.")
	private SecurityDetails securityDetails;

    public Response() {
    }

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getStatus() {
		return this.status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getStatusText() {
		return this.statusText;
	}
	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}
	public Headers getHeaders() {
		return this.headers;
	}
	public void setHeaders(Headers headers) {
		this.headers = headers;
	}
	public String getHeadersText() {
		return this.headersText;
	}
	public void setHeadersText(String headersText) {
		this.headersText = headersText;
	}
	public String getMimeType() {
		return this.mimeType;
	}
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	public String getCharset() {
		return this.charset;
	}
	public void setCharset(String charset) {
		this.charset = charset;
	}
	public Headers getRequestHeaders() {
		return this.requestHeaders;
	}
	public void setRequestHeaders(Headers requestHeaders) {
		this.requestHeaders = requestHeaders;
	}
	public String getRequestHeadersText() {
		return this.requestHeadersText;
	}
	public void setRequestHeadersText(String requestHeadersText) {
		this.requestHeadersText = requestHeadersText;
	}
	public boolean getConnectionReused() {
		return this.connectionReused;
	}
	public void setConnectionReused(boolean connectionReused) {
		this.connectionReused = connectionReused;
	}
	public Number getConnectionId() {
		return this.connectionId;
	}
	public void setConnectionId(Number connectionId) {
		this.connectionId = connectionId;
	}
	public String getRemoteIPAddress() {
		return this.remoteIPAddress;
	}
	public void setRemoteIPAddress(String remoteIPAddress) {
		this.remoteIPAddress = remoteIPAddress;
	}
	public int getRemotePort() {
		return this.remotePort;
	}
	public void setRemotePort(int remotePort) {
		this.remotePort = remotePort;
	}
	public boolean getFromDiskCache() {
		return this.fromDiskCache;
	}
	public void setFromDiskCache(boolean fromDiskCache) {
		this.fromDiskCache = fromDiskCache;
	}
	public boolean getFromServiceWorker() {
		return this.fromServiceWorker;
	}
	public void setFromServiceWorker(boolean fromServiceWorker) {
		this.fromServiceWorker = fromServiceWorker;
	}
	public boolean getFromPrefetchCache() {
		return this.fromPrefetchCache;
	}
	public void setFromPrefetchCache(boolean fromPrefetchCache) {
		this.fromPrefetchCache = fromPrefetchCache;
	}
	public boolean getFromEarlyHints() {
		return this.fromEarlyHints;
	}
	public void setFromEarlyHints(boolean fromEarlyHints) {
		this.fromEarlyHints = fromEarlyHints;
	}
	public ServiceWorkerRouterInfo getServiceWorkerRouterInfo() {
		return this.serviceWorkerRouterInfo;
	}
	public void setServiceWorkerRouterInfo(ServiceWorkerRouterInfo serviceWorkerRouterInfo) {
		this.serviceWorkerRouterInfo = serviceWorkerRouterInfo;
	}
	public Number getEncodedDataLength() {
		return this.encodedDataLength;
	}
	public void setEncodedDataLength(Number encodedDataLength) {
		this.encodedDataLength = encodedDataLength;
	}
	public ResourceTiming getTiming() {
		return this.timing;
	}
	public void setTiming(ResourceTiming timing) {
		this.timing = timing;
	}
	public String getServiceWorkerResponseSource() {
		return this.serviceWorkerResponseSource;
	}
	public void setServiceWorkerResponseSource(String serviceWorkerResponseSource) {
		this.serviceWorkerResponseSource = serviceWorkerResponseSource;
	}
	public Number getResponseTime() {
		return this.responseTime;
	}
	public void setResponseTime(Number responseTime) {
		this.responseTime = responseTime;
	}
	public String getCacheStorageCacheName() {
		return this.cacheStorageCacheName;
	}
	public void setCacheStorageCacheName(String cacheStorageCacheName) {
		this.cacheStorageCacheName = cacheStorageCacheName;
	}
	public String getProtocol() {
		return this.protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getAlternateProtocolUsage() {
		return this.alternateProtocolUsage;
	}
	public void setAlternateProtocolUsage(String alternateProtocolUsage) {
		this.alternateProtocolUsage = alternateProtocolUsage;
	}
	public String getSecurityState() {
		return this.securityState;
	}
	public void setSecurityState(String securityState) {
		this.securityState = securityState;
	}
	public SecurityDetails getSecurityDetails() {
		return this.securityDetails;
	}
	public void setSecurityDetails(SecurityDetails securityDetails) {
		this.securityDetails = securityDetails;
	}
}
