package ru.hzerr.generated.animation;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Required;

@Description("Timeline instance")
public class ViewOrScrollTimeline {

	@Description("Scroll container node")
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int sourceNodeId;

	@Description("Represents the starting scroll position of the timeline as a length offset in pixels from scroll origin.")
	private Number startOffset;

	@Description("Represents the ending scroll position of the timeline as a length offset in pixels from scroll origin.")
	private Number endOffset;

	@Description("The element whose principal box's visibility in the scrollport defined the progress of the timeline. Does not exist for animations with ScrollTimeline")
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int subjectNodeId;

	@Required
	@Description("Orientation of the scroll")
	@TypeDescription("Physical scroll orientation")
	private String axis;

    public ViewOrScrollTimeline() {
    }

	public int getSourceNodeId() {
		return this.sourceNodeId;
	}
	public void setSourceNodeId(int sourceNodeId) {
		this.sourceNodeId = sourceNodeId;
	}
	public Number getStartOffset() {
		return this.startOffset;
	}
	public void setStartOffset(Number startOffset) {
		this.startOffset = startOffset;
	}
	public Number getEndOffset() {
		return this.endOffset;
	}
	public void setEndOffset(Number endOffset) {
		this.endOffset = endOffset;
	}
	public int getSubjectNodeId() {
		return this.subjectNodeId;
	}
	public void setSubjectNodeId(int subjectNodeId) {
		this.subjectNodeId = subjectNodeId;
	}
	public String getAxis() {
		return this.axis;
	}
	public void setAxis(String axis) {
		this.axis = axis;
	}
}
