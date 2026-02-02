package ru.hzerr.generated.heapProfiler;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("Sampling profile.")
public class SamplingHeapProfile {

	@Required
	private SamplingHeapProfileNode head;

	@Required
	private List<SamplingHeapProfileSample> samples;

    public SamplingHeapProfile() {
    }

	public SamplingHeapProfileNode getHead() {
		return this.head;
	}
	public void setHead(SamplingHeapProfileNode head) {
		this.head = head;
	}
	public List<SamplingHeapProfileSample> getSamples() {
		return this.samples;
	}
	public void setSamples(List<SamplingHeapProfileSample> samples) {
		this.samples = samples;
	}
}
