package ru.hzerr.generated.accessibility;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Description("A single computed AX property.")
public class AXValue {

	@Required
	@Description("The type of this value.")
	@TypeDescription("Enum of possible property types.")
	private String type;

	@Description("The computed value of this property.")
	private Object value;

	@Description("One or more related nodes, if applicable.")
	private List<AXRelatedNode> relatedNodes;

	@Description("The sources which contributed to the computation of this property.")
	private List<AXValueSource> sources;

    public AXValue() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Object getValue() {
		return this.value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public List<AXRelatedNode> getRelatedNodes() {
		return this.relatedNodes;
	}
	public void setRelatedNodes(List<AXRelatedNode> relatedNodes) {
		this.relatedNodes = relatedNodes;
	}
	public List<AXValueSource> getSources() {
		return this.sources;
	}
	public void setSources(List<AXValueSource> sources) {
		this.sources = sources;
	}
}
