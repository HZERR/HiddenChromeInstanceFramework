package ru.hzerr.cdp.type.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeExperimental;

@Experimental
public class DirectUDPSocketOptions {

	private String remoteAddr;

	@Description("Unsigned int 16.")
	private int remotePort;

	private String localAddr;

	@Description("Unsigned int 16.")
	private int localPort;

	@TypeExperimental
	private String dnsQueryType;

	@Description("Expected to be unsigned integer.")
	private Number sendBufferSize;

	@Description("Expected to be unsigned integer.")
	private Number receiveBufferSize;

	private boolean multicastLoopback;

	@Description("Unsigned int 8.")
	private int multicastTimeToLive;

	private boolean multicastAllowAddressSharing;

    public DirectUDPSocketOptions() {
    }

	public String getRemoteAddr() {
		return this.remoteAddr;
	}
	public void setRemoteAddr(String remoteAddr) {
		this.remoteAddr = remoteAddr;
	}
	public int getRemotePort() {
		return this.remotePort;
	}
	public void setRemotePort(int remotePort) {
		this.remotePort = remotePort;
	}
	public String getLocalAddr() {
		return this.localAddr;
	}
	public void setLocalAddr(String localAddr) {
		this.localAddr = localAddr;
	}
	public int getLocalPort() {
		return this.localPort;
	}
	public void setLocalPort(int localPort) {
		this.localPort = localPort;
	}
	public String getDnsQueryType() {
		return this.dnsQueryType;
	}
	public void setDnsQueryType(String dnsQueryType) {
		this.dnsQueryType = dnsQueryType;
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
	public boolean getMulticastLoopback() {
		return this.multicastLoopback;
	}
	public void setMulticastLoopback(boolean multicastLoopback) {
		this.multicastLoopback = multicastLoopback;
	}
	public int getMulticastTimeToLive() {
		return this.multicastTimeToLive;
	}
	public void setMulticastTimeToLive(int multicastTimeToLive) {
		this.multicastTimeToLive = multicastTimeToLive;
	}
	public boolean getMulticastAllowAddressSharing() {
		return this.multicastAllowAddressSharing;
	}
	public void setMulticastAllowAddressSharing(boolean multicastAllowAddressSharing) {
		this.multicastAllowAddressSharing = multicastAllowAddressSharing;
	}
}
