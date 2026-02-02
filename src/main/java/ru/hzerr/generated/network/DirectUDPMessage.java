package ru.hzerr.generated.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

@Experimental
public class DirectUDPMessage {

	@Required
	private byte[] data;

	@Description("Null for connected mode.")
	private String remoteAddr;

	@Description("Null for connected mode. Expected to be unsigned integer.")
	private int remotePort;

    public DirectUDPMessage() {
    }

	public byte[] getData() {
		return this.data;
	}
	public void setData(byte[] data) {
		this.data = data;
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
}
