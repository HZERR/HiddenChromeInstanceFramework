package ru.hzerr.generated.profiler;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("Coverage data for a JavaScript function.")
public class FunctionCoverage {

	@Required
	@Description("JavaScript function name.")
	private String functionName;

	@Required
	@Description("Source ranges inside the function with coverage data.")
	private List<CoverageRange> ranges;

	@Required
	@Description("Whether coverage data for this function has block granularity.")
	private boolean isBlockCoverage;

    public FunctionCoverage() {
    }

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	public List<CoverageRange> getRanges() {
		return this.ranges;
	}
	public void setRanges(List<CoverageRange> ranges) {
		this.ranges = ranges;
	}
	public boolean getIsBlockCoverage() {
		return this.isBlockCoverage;
	}
	public void setIsBlockCoverage(boolean isBlockCoverage) {
		this.isBlockCoverage = isBlockCoverage;
	}
}
