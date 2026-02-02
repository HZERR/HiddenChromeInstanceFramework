package ru.hzerr.generated.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

@Experimental
public class AttributionReportingEventReportWindows {

	@Required
	@Description("duration in seconds")
	private int start;

	@Required
	@Description("duration in seconds")
	private int[] ends;

    public AttributionReportingEventReportWindows() {
    }

	public int getStart() {
		return this.start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int[] getEnds() {
		return this.ends;
	}
	public void setEnds(int[] ends) {
		this.ends = ends;
	}
}
