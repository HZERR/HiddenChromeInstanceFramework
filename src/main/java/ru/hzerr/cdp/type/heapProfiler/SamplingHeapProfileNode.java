package ru.hzerr.cdp.type.heapProfiler;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.runtime.CallFrame;
import java.util.List;

@Description("Sampling Heap Profile node. Holds callsite information, allocation statistics and child nodes.")
public class SamplingHeapProfileNode {

	@Required
	@Description("Function location.")
	private CallFrame callFrame;

	@Required
	@Description("Allocations size in bytes for the node excluding children.")
	private Number selfSize;

	@Required
	@Description("Node id. Ids are unique across all profiles collected between startSampling and stopSampling.")
	private int id;

	@Required
	@Description("Child nodes.")
	private List<SamplingHeapProfileNode> children;

    public SamplingHeapProfileNode() {
    }

	public CallFrame getCallFrame() {
		return this.callFrame;
	}
	public void setCallFrame(CallFrame callFrame) {
		this.callFrame = callFrame;
	}
	public Number getSelfSize() {
		return this.selfSize;
	}
	public void setSelfSize(Number selfSize) {
		this.selfSize = selfSize;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<SamplingHeapProfileNode> getChildren() {
		return this.children;
	}
	public void setChildren(List<SamplingHeapProfileNode> children) {
		this.children = children;
	}
}
