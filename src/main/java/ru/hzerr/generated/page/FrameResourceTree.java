package ru.hzerr.generated.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Experimental
@Description("Information about the Frame hierarchy along with their cached resources.")
public class FrameResourceTree {

	@Required
	@Description("Frame information for this tree item.")
	private Frame frame;

	@Description("Child frames.")
	private List<FrameResourceTree> childFrames;

	@Required
	@Description("Information about frame resources.")
	private List<FrameResource> resources;

    public FrameResourceTree() {
    }

	public Frame getFrame() {
		return this.frame;
	}
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	public List<FrameResourceTree> getChildFrames() {
		return this.childFrames;
	}
	public void setChildFrames(List<FrameResourceTree> childFrames) {
		this.childFrames = childFrames;
	}
	public List<FrameResource> getResources() {
		return this.resources;
	}
	public void setResources(List<FrameResource> resources) {
		this.resources = resources;
	}
}
