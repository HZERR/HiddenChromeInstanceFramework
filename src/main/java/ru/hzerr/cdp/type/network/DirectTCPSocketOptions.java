package ru.hzerr.cdp.type.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeExperimental;

@Experimental
public class DirectTCPSocketOptions {

	@Required
	@Description("TCP_NODELAY option")
	private boolean noDelay;

	@Description("Expected to be unsigned integer.")
	private Number keepAliveDelay;

	@Description("Expected to be unsigned integer.")
	private Number sendBufferSize;

	@Description("Expected to be unsigned integer.")
	private Number receiveBufferSize;

	@TypeExperimental
	private String dnsQueryType;

    public DirectTCPSocketOptions() {
    }

	public boolean getNoDelay() {
		return this.noDelay;
	}
	public void setNoDelay(boolean noDelay) {
		this.noDelay = noDelay;
	}
	public Number getKeepAliveDelay() {
		return this.keepAliveDelay;
	}
	public void setKeepAliveDelay(Number keepAliveDelay) {
		this.keepAliveDelay = keepAliveDelay;
	}
	public Number getSendBufferSize() {
		return this.sendBufferSize;
	}
	public void setSendBufferSize(Number sendBufferSize) {
		this.sendBufferSize = sendBufferSize;
	}
	public Number getReceiveBufferSize() {
		return this.receiveBufferSize;
	}
	public void setReceiveBufferSize(Number receiveBufferSize) {
		this.receiveBufferSize = receiveBufferSize;
	}
	public String getDnsQueryType() {
		return this.dnsQueryType;
	}
	public void setDnsQueryType(String dnsQueryType) {
		this.dnsQueryType = dnsQueryType;
	}
}
