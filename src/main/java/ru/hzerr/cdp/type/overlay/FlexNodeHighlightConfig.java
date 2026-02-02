package ru.hzerr.cdp.type.overlay;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;

public class FlexNodeHighlightConfig {

	@Required
	@Description("A descriptor for the highlight appearance of flex containers.")
	private FlexContainerHighlightConfig flexContainerHighlightConfig;

	@Required
	@Description("Identifier of the node to highlight.")
	@TypeDescription("Unique DOM node identifier.")
	private int nodeId;

    public FlexNodeHighlightConfig() {
    }

	public FlexContainerHighlightConfig getFlexContainerHighlightConfig() {
		return this.flexContainerHighlightConfig;
	}
	public void setFlexContainerHighlightConfig(FlexContainerHighlightConfig flexContainerHighlightConfig) {
		this.flexContainerHighlightConfig = flexContainerHighlightConfig;
	}
	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
}
