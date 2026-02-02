package ru.hzerr.generated.overlay;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;

public class ContainerQueryHighlightConfig {

	@Required
	@Description("A descriptor for the highlight appearance of container query containers.")
	private ContainerQueryContainerHighlightConfig containerQueryContainerHighlightConfig;

	@Required
	@Description("Identifier of the container node to highlight.")
	@TypeDescription("Unique DOM node identifier.")
	private int nodeId;

    public ContainerQueryHighlightConfig() {
    }

	public ContainerQueryContainerHighlightConfig getContainerQueryContainerHighlightConfig() {
		return this.containerQueryContainerHighlightConfig;
	}
	public void setContainerQueryContainerHighlightConfig(ContainerQueryContainerHighlightConfig containerQueryContainerHighlightConfig) {
		this.containerQueryContainerHighlightConfig = containerQueryContainerHighlightConfig;
	}
	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
}
