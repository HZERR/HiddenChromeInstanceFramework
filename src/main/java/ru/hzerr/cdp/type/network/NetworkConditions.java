package ru.hzerr.cdp.type.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;

@Experimental
public class NetworkConditions {

	@Required
	@Description("Only matching requests will be affected by these conditions. Patterns use the URLPattern constructor string syntax (https://urlpattern.spec.whatwg.org/) and must be absolute. If the pattern is empty, all requests are matched (including p2p connections).")
	private String urlPattern;

	@Required
	@Description("Minimum latency from request sent to response headers received (ms).")
	private Number latency;

	@Required
	@Description("Maximal aggregated download throughput (bytes/sec). -1 disables download throttling.")
	private Number downloadThroughput;

	@Required
	@Description("Maximal aggregated upload throughput (bytes/sec).  -1 disables upload throttling.")
	private Number uploadThroughput;

	@Description("Connection type if known.")
	@TypeDescription("The underlying connection technology that the browser is supposedly using.")
	private String connectionType;

	@Description("WebRTC packet loss (percent, 0-100). 0 disables packet loss emulation, 100 drops all the packets.")
	private Number packetLoss;

	@Description("WebRTC packet queue length (packet). 0 removes any queue length limitations.")
	private int packetQueueLength;

	@Description("WebRTC packetReordering feature.")
	private boolean packetReordering;

    public NetworkConditions() {
    }

	public String getUrlPattern() {
		return this.urlPattern;
	}
	public void setUrlPattern(String urlPattern) {
		this.urlPattern = urlPattern;
	}
	public Number getLatency() {
		return this.latency;
	}
	public void setLatency(Number latency) {
		this.latency = latency;
	}
	public Number getDownloadThroughput() {
		return this.downloadThroughput;
	}
	public void setDownloadThroughput(Number downloadThroughput) {
		this.downloadThroughput = downloadThroughput;
	}
	public Number getUploadThroughput() {
		return this.uploadThroughput;
	}
	public void setUploadThroughput(Number uploadThroughput) {
		this.uploadThroughput = uploadThroughput;
	}
	public String getConnectionType() {
		return this.connectionType;
	}
	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}
	public Number getPacketLoss() {
		return this.packetLoss;
	}
	public void setPacketLoss(Number packetLoss) {
		this.packetLoss = packetLoss;
	}
	public int getPacketQueueLength() {
		return this.packetQueueLength;
	}
	public void setPacketQueueLength(int packetQueueLength) {
		this.packetQueueLength = packetQueueLength;
	}
	public boolean getPacketReordering() {
		return this.packetReordering;
	}
	public void setPacketReordering(boolean packetReordering) {
		this.packetReordering = packetReordering;
	}
}
