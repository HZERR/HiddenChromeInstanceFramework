package ru.hzerr.generated.overlay;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Configurations for Persistent Grid Highlight")
public class GridNodeHighlightConfig {

	@Required
	@Description("A descriptor for the highlight appearance.")
	private GridHighlightConfig gridHighlightConfig;

	@Required
	@Description("Identifier of the node to highlight.")
	@TypeDescription("Unique DOM node identifier.")
	private int nodeId;

    public GridNodeHighlightConfig() {
    }

	public GridHighlightConfig getGridHighlightConfig() {
		return this.gridHighlightConfig;
	}
	public void setGridHighlightConfig(GridHighlightConfig gridHighlightConfig) {
		this.gridHighlightConfig = gridHighlightConfig;
	}
	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
}
