package ru.hzerr.cdp.event.profiler;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import java.util.List;
import ru.hzerr.cdp.type.profiler.ScriptCoverage;

@Experimental
@Description("Reports coverage delta since the last poll (either from an event like this, or from `takePreciseCoverage` for the current isolate. May only be sent if precise code coverage has been started. This event can be trigged by the embedder to, for example, trigger collection of coverage data immediately at a certain point in time.")
@Event("preciseCoverageDeltaUpdate")
public class PreciseCoverageDeltaUpdateEvent {

	@Required
	@Description("Monotonically increasing time (in seconds) when the coverage update was taken in the backend.")
	private Number timestamp;

	@Required
	@Description("Identifier for distinguishing coverage events.")
	private String occasion;

	@Required
	@Description("Coverage data for the current isolate.")
	private List<ScriptCoverage> result;

    public PreciseCoverageDeltaUpdateEvent() {
    }

	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
	public String getOccasion() {
		return this.occasion;
	}
	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}
	public List<ScriptCoverage> getResult() {
		return this.result;
	}
	public void setResult(List<ScriptCoverage> result) {
		this.result = result;
	}
}
