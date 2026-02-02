package ru.hzerr.generated.profiler;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Coverage data for a source range.")
public class CoverageRange {

	@Required
	@Description("JavaScript script source offset for the range start.")
	private int startOffset;

	@Required
	@Description("JavaScript script source offset for the range end.")
	private int endOffset;

	@Required
	@Description("Collected execution count of the source range.")
	private int count;

    public CoverageRange() {
    }

	public int getStartOffset() {
		return this.startOffset;
	}
	public void setStartOffset(int startOffset) {
		this.startOffset = startOffset;
	}
	public int getEndOffset() {
		return this.endOffset;
	}
	public void setEndOffset(int endOffset) {
		this.endOffset = endOffset;
	}
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
