package ru.hzerr.cdp.type.profiler;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.runtime.CallFrame;
import java.util.List;

@Description("Profile node. Holds callsite information, execution statistics and child nodes.")
public class ProfileNode {

	@Required
	@Description("Unique id of the node.")
	private int id;

	@Required
	@Description("Function location.")
	private CallFrame callFrame;

	@Description("Number of samples where this node was on top of the call stack.")
	private int hitCount;

	@Description("Child node ids.")
	private int[] children;

	@Description("The reason of being not optimized. The function may be deoptimized or marked as don't optimize.")
	private String deoptReason;

	@Description("An array of source position ticks.")
	private List<PositionTickInfo> positionTicks;

    public ProfileNode() {
    }

	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CallFrame getCallFrame() {
		return this.callFrame;
	}
	public void setCallFrame(CallFrame callFrame) {
		this.callFrame = callFrame;
	}
	public int getHitCount() {
		return this.hitCount;
	}
	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}
	public int[] getChildren() {
		return this.children;
	}
	public void setChildren(int[] children) {
		this.children = children;
	}
	public String getDeoptReason() {
		return this.deoptReason;
	}
	public void setDeoptReason(String deoptReason) {
		this.deoptReason = deoptReason;
	}
	public List<PositionTickInfo> getPositionTicks() {
		return this.positionTicks;
	}
	public void setPositionTicks(List<PositionTickInfo> positionTicks) {
		this.positionTicks = positionTicks;
	}
}
