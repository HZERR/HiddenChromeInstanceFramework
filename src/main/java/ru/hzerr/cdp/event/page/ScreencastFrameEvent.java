package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.page.ScreencastFrameMetadata;

@Experimental
@Description("Compressed image data requested by the `startScreencast`.")
@Event("screencastFrame")
public class ScreencastFrameEvent {

	@Required
	@Description("Base64-encoded compressed image.")
	private byte[] data;

	@Required
	@Description("Screencast frame metadata.")
	private ScreencastFrameMetadata metadata;

	@Required
	@Description("Frame number.")
	private int sessionId;

    public ScreencastFrameEvent() {
    }

	public byte[] getData() {
		return this.data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	public ScreencastFrameMetadata getMetadata() {
		return this.metadata;
	}
	public void setMetadata(ScreencastFrameMetadata metadata) {
		this.metadata = metadata;
	}
	public int getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
}
