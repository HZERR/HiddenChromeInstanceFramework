package ru.hzerr.generated.overlay;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;

public class ScrollSnapHighlightConfig {

	@Required
	@Description("A descriptor for the highlight appearance of scroll snap containers.")
	private ScrollSnapContainerHighlightConfig scrollSnapContainerHighlightConfig;

	@Required
	@Description("Identifier of the node to highlight.")
	@TypeDescription("Unique DOM node identifier.")
	private int nodeId;

    public ScrollSnapHighlightConfig() {
    }

	public ScrollSnapContainerHighlightConfig getScrollSnapContainerHighlightConfig() {
		return this.scrollSnapContainerHighlightConfig;
	}
	public void setScrollSnapContainerHighlightConfig(ScrollSnapContainerHighlightConfig scrollSnapContainerHighlightConfig) {
		this.scrollSnapContainerHighlightConfig = scrollSnapContainerHighlightConfig;
	}
	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
}
