package ru.hzerr.generated.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("WebSocket message data. This represents an entire WebSocket message, not just a fragmented frame as the name suggests.")
public class WebSocketFrame {

	@Required
	@Description("WebSocket message opcode.")
	private Number opcode;

	@Required
	@Description("WebSocket message mask.")
	private boolean mask;

	@Required
	@Description("WebSocket message payload data. If the opcode is 1, this is a text message and payloadData is a UTF-8 string. If the opcode isn't 1, then payloadData is a base64 encoded string representing binary data.")
	private String payloadData;

    public WebSocketFrame() {
    }

	public Number getOpcode() {
		return this.opcode;
	}
	public void setOpcode(Number opcode) {
		this.opcode = opcode;
	}
	public boolean getMask() {
		return this.mask;
	}
	public void setMask(boolean mask) {
		this.mask = mask;
	}
	public String getPayloadData() {
		return this.payloadData;
	}
	public void setPayloadData(String payloadData) {
		this.payloadData = payloadData;
	}
}
