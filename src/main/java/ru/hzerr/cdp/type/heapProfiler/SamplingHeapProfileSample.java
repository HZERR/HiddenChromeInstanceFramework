package ru.hzerr.cdp.type.heapProfiler;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("A single sample from a sampling profile.")
public class SamplingHeapProfileSample {

	@Required
	@Description("Allocation size in bytes attributed to the sample.")
	private Number size;

	@Required
	@Description("Id of the corresponding profile tree node.")
	private int nodeId;

	@Required
	@Description("Time-ordered sample ordinal number. It is unique across all profiles retrieved between startSampling and stopSampling.")
	private Number ordinal;

    public SamplingHeapProfileSample() {
    }

	public Number getSize() {
		return this.size;
	}
	public void setSize(Number size) {
		this.size = size;
	}
	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	public Number getOrdinal() {
		return this.ordinal;
	}
	public void setOrdinal(Number ordinal) {
		this.ordinal = ordinal;
	}
}
