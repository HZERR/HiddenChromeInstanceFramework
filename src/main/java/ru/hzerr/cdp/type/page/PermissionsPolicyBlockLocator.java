package ru.hzerr.cdp.type.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.TypeExperimental;

@Experimental
public class PermissionsPolicyBlockLocator {

	@Required
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Required
	@TypeExperimental
	@TypeDescription("Reason for a permissions policy feature to be disabled.")
	private String blockReason;

    public PermissionsPolicyBlockLocator() {
    }

	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public String getBlockReason() {
		return this.blockReason;
	}
	public void setBlockReason(String blockReason) {
		this.blockReason = blockReason;
	}
}
