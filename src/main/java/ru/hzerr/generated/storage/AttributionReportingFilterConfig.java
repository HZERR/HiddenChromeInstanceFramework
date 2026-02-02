package ru.hzerr.generated.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import java.util.List;
import ru.hzerr.annotation.Description;

@Experimental
public class AttributionReportingFilterConfig {

	@Required
	private List<AttributionReportingFilterDataEntry> filterValues;

	@Description("duration in seconds")
	private int lookbackWindow;

    public AttributionReportingFilterConfig() {
    }

	public List<AttributionReportingFilterDataEntry> getFilterValues() {
		return this.filterValues;
	}
	public void setFilterValues(List<AttributionReportingFilterDataEntry> filterValues) {
		this.filterValues = filterValues;
	}
	public int getLookbackWindow() {
		return this.lookbackWindow;
	}
	public void setLookbackWindow(int lookbackWindow) {
		this.lookbackWindow = lookbackWindow;
	}
}
