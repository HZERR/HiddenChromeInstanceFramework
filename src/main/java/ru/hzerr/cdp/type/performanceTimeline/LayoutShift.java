package ru.hzerr.cdp.type.performanceTimeline;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Description("See https://wicg.github.io/layout-instability/#sec-layout-shift and layout_shift.idl")
public class LayoutShift {

	@Required
	@Description("Score increment produced by this event.")
	private Number value;

	@Required
	private boolean hadRecentInput;

	@Required
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number lastInputTime;

	@Required
	private List<LayoutShiftAttribution> sources;

    public LayoutShift() {
    }

	public Number getValue() {
		return this.value;
	}
	public void setValue(Number value) {
		this.value = value;
	}
	public boolean getHadRecentInput() {
		return this.hadRecentInput;
	}
	public void setHadRecentInput(boolean hadRecentInput) {
		this.hadRecentInput = hadRecentInput;
	}
	public Number getLastInputTime() {
		return this.lastInputTime;
	}
	public void setLastInputTime(Number lastInputTime) {
		this.lastInputTime = lastInputTime;
	}
	public List<LayoutShiftAttribution> getSources() {
		return this.sources;
	}
	public void setSources(List<LayoutShiftAttribution> sources) {
		this.sources = sources;
	}
}
