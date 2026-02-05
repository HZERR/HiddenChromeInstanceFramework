package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Experimental;

@Description("Fired when data chunk was received over the network.")
@Event("dataReceived")
public class DataReceivedEvent {

	@Required
	@Description("Request identifier.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

	@Required
	@Description("Timestamp.")
	@TypeDescription("Monotonically increasing time in seconds since an arbitrary point in the past.")
	private Number timestamp;

	@Required
	@Description("Data chunk length.")
	private int dataLength;

	@Required
	@Description("Actual bytes received (might be less than dataLength for compressed encodings).")
	private int encodedDataLength;

	@Experimental
	@Description("Data that was received.")
	private byte[] data;

    public DataReceivedEvent() {
    }

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
	public int getDataLength() {
		return this.dataLength;
	}
	public void setDataLength(int dataLength) {
		this.dataLength = dataLength;
	}
	public int getEncodedDataLength() {
		return this.encodedDataLength;
	}
	public void setEncodedDataLength(int encodedDataLength) {
		this.encodedDataLength = encodedDataLength;
	}
	public byte[] getData() {
		return this.data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
}
