package ru.hzerr.generated.tracing;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Enum;

public class TraceConfig {

	@Experimental
	@Description("Controls how the trace buffer stores data. The default is `recordUntilFull`.")
	@Enum({"recordUntilFull", "recordContinuously", "recordAsMuchAsPossible", "echoToConsole"})
	private String recordMode;

	@Experimental
	@Description("Size of the trace buffer in kilobytes. If not specified or zero is passed, a default value of 200 MB would be used.")
	private Number traceBufferSizeInKb;

	@Experimental
	@Description("Turns on JavaScript stack sampling.")
	private boolean enableSampling;

	@Experimental
	@Description("Turns on system tracing.")
	private boolean enableSystrace;

	@Experimental
	@Description("Turns on argument filter.")
	private boolean enableArgumentFilter;

	@Description("Included category filters.")
	private String[] includedCategories;

	@Description("Excluded category filters.")
	private String[] excludedCategories;

	@Experimental
	@Description("Configuration to synthesize the delays in tracing.")
	private String[] syntheticDelays;

	@Experimental
	@Description("Configuration for memory dump triggers. Used only when \"memory-infra\" category is enabled.")
	private MemoryDumpConfig memoryDumpConfig;

    public TraceConfig() {
    }

	public String getRecordMode() {
		return this.recordMode;
	}
	public void setRecordMode(String recordMode) {
		this.recordMode = recordMode;
	}
	public Number getTraceBufferSizeInKb() {
		return this.traceBufferSizeInKb;
	}
	public void setTraceBufferSizeInKb(Number traceBufferSizeInKb) {
		this.traceBufferSizeInKb = traceBufferSizeInKb;
	}
	public boolean getEnableSampling() {
		return this.enableSampling;
	}
	public void setEnableSampling(boolean enableSampling) {
		this.enableSampling = enableSampling;
	}
	public boolean getEnableSystrace() {
		return this.enableSystrace;
	}
	public void setEnableSystrace(boolean enableSystrace) {
		this.enableSystrace = enableSystrace;
	}
	public boolean getEnableArgumentFilter() {
		return this.enableArgumentFilter;
	}
	public void setEnableArgumentFilter(boolean enableArgumentFilter) {
		this.enableArgumentFilter = enableArgumentFilter;
	}
	public String[] getIncludedCategories() {
		return this.includedCategories;
	}
	public void setIncludedCategories(String[] includedCategories) {
		this.includedCategories = includedCategories;
	}
	public String[] getExcludedCategories() {
		return this.excludedCategories;
	}
	public void setExcludedCategories(String[] excludedCategories) {
		this.excludedCategories = excludedCategories;
	}
	public String[] getSyntheticDelays() {
		return this.syntheticDelays;
	}
	public void setSyntheticDelays(String[] syntheticDelays) {
		this.syntheticDelays = syntheticDelays;
	}
	public MemoryDumpConfig getMemoryDumpConfig() {
		return this.memoryDumpConfig;
	}
	public void setMemoryDumpConfig(MemoryDumpConfig memoryDumpConfig) {
		this.memoryDumpConfig = memoryDumpConfig;
	}
}
