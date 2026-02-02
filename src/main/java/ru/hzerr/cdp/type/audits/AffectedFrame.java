package ru.hzerr.cdp.type.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Information about the frame affected by an inspector issue.")
public class AffectedFrame {

	@Required
	@TypeDescription("Unique frame identifier.")
	private String frameId;

    public AffectedFrame() {
    }

	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
}
