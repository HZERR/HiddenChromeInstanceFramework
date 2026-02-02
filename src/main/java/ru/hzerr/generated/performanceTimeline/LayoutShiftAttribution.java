package ru.hzerr.generated.performanceTimeline;

import ru.hzerr.annotation.Required;
import ru.hzerr.generated.dom.Rect;
import ru.hzerr.annotation.TypeDescription;

public class LayoutShiftAttribution {

	@Required
	private Rect previousRect;

	@Required
	private Rect currentRect;

	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int nodeId;

    public LayoutShiftAttribution() {
    }

	public Rect getPreviousRect() {
		return this.previousRect;
	}
	public void setPreviousRect(Rect previousRect) {
		this.previousRect = previousRect;
	}
	public Rect getCurrentRect() {
		return this.currentRect;
	}
	public void setCurrentRect(Rect currentRect) {
		this.currentRect = currentRect;
	}
	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
}
