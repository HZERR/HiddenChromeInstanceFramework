package ru.hzerr.generated.overlay;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;

public class IsolatedElementHighlightConfig {

	@Required
	@Description("A descriptor for the highlight appearance of an element in isolation mode.")
	private IsolationModeHighlightConfig isolationModeHighlightConfig;

	@Required
	@Description("Identifier of the isolated element to highlight.")
	@TypeDescription("Unique DOM node identifier.")
	private int nodeId;

    public IsolatedElementHighlightConfig() {
    }

	public IsolationModeHighlightConfig getIsolationModeHighlightConfig() {
		return this.isolationModeHighlightConfig;
	}
	public void setIsolationModeHighlightConfig(IsolationModeHighlightConfig isolationModeHighlightConfig) {
		this.isolationModeHighlightConfig = isolationModeHighlightConfig;
	}
	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
}
