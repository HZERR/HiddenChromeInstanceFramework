package ru.hzerr.cdp.type.page;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("Information about the Frame hierarchy.")
public class FrameTree {

	@Required
	@Description("Frame information for this tree item.")
	private Frame frame;

	@Description("Child frames.")
	private List<FrameTree> childFrames;

    public FrameTree() {
    }

	public Frame getFrame() {
		return this.frame;
	}
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	public List<FrameTree> getChildFrames() {
		return this.childFrames;
	}
	public void setChildFrames(List<FrameTree> childFrames) {
		this.childFrames = childFrames;
	}
}
