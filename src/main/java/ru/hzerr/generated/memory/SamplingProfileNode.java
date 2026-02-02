package ru.hzerr.generated.memory;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Heap profile sample.")
public class SamplingProfileNode {

	@Required
	@Description("Size of the sampled allocation.")
	private Number size;

	@Required
	@Description("Total bytes attributed to this sample.")
	private Number total;

	@Required
	@Description("Execution stack at the point of allocation.")
	private String[] stack;

    public SamplingProfileNode() {
    }

	public Number getSize() {
		return this.size;
	}
	public void setSize(Number size) {
		this.size = size;
	}
	public Number getTotal() {
		return this.total;
	}
	public void setTotal(Number total) {
		this.total = total;
	}
	public String[] getStack() {
		return this.stack;
	}
	public void setStack(String[] stack) {
		this.stack = stack;
	}
}
