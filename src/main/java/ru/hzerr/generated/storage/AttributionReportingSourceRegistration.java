package ru.hzerr.generated.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeExperimental;
import java.util.List;

@Experimental
public class AttributionReportingSourceRegistration {

	@Required
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number time;

	@Required
	@Description("duration in seconds")
	private int expiry;

	@Required
	@Description("number instead of integer because not all uint32 can be represented by int")
	private Number[] triggerData;

	@Required
	private AttributionReportingEventReportWindows eventReportWindows;

	@Required
	@Description("duration in seconds")
	private int aggregatableReportWindow;

	@Required
	@TypeExperimental
	private String type;

	@Required
	private String sourceOrigin;

	@Required
	private String reportingOrigin;

	@Required
	private String[] destinationSites;

	@Required
	@TypeExperimental
	private String eventId;

	@Required
	@TypeExperimental
	private String priority;

	@Required
	private List<AttributionReportingFilterDataEntry> filterData;

	@Required
	private List<AttributionReportingAggregationKeysEntry> aggregationKeys;

	@TypeExperimental
	private String debugKey;

	@Required
	@TypeExperimental
	private String triggerDataMatching;

	@Required
	@TypeExperimental
	private String destinationLimitPriority;

	@Required
	private AttributionReportingAggregatableDebugReportingConfig aggregatableDebugReportingConfig;

	private AttributionScopesData scopesData;

	@Required
	private int maxEventLevelReports;

	@Required
	private List<AttributionReportingNamedBudgetDef> namedBudgets;

	@Required
	private boolean debugReporting;

	@Required
	private Number eventLevelEpsilon;

    public AttributionReportingSourceRegistration() {
    }

	public Number getTime() {
		return this.time;
	}
	public void setTime(Number time) {
		this.time = time;
	}
	public int getExpiry() {
		return this.expiry;
	}
	public void setExpiry(int expiry) {
		this.expiry = expiry;
	}
	public Number[] getTriggerData() {
		return this.triggerData;
	}
	public void setTriggerData(Number[] triggerData) {
		this.triggerData = triggerData;
	}
	public AttributionReportingEventReportWindows getEventReportWindows() {
		return this.eventReportWindows;
	}
	public void setEventReportWindows(AttributionReportingEventReportWindows eventReportWindows) {
		this.eventReportWindows = eventReportWindows;
	}
	public int getAggregatableReportWindow() {
		return this.aggregatableReportWindow;
	}
	public void setAggregatableReportWindow(int aggregatableReportWindow) {
		this.aggregatableReportWindow = aggregatableReportWindow;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSourceOrigin() {
		return this.sourceOrigin;
	}
	public void setSourceOrigin(String sourceOrigin) {
		this.sourceOrigin = sourceOrigin;
	}
	public String getReportingOrigin() {
		return this.reportingOrigin;
	}
	public void setReportingOrigin(String reportingOrigin) {
		this.reportingOrigin = reportingOrigin;
	}
	public String[] getDestinationSites() {
		return this.destinationSites;
	}
	public void setDestinationSites(String[] destinationSites) {
		this.destinationSites = destinationSites;
	}
	public String getEventId() {
		return this.eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getPriority() {
		return this.priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public List<AttributionReportingFilterDataEntry> getFilterData() {
		return this.filterData;
	}
	public void setFilterData(List<AttributionReportingFilterDataEntry> filterData) {
		this.filterData = filterData;
	}
	public List<AttributionReportingAggregationKeysEntry> getAggregationKeys() {
		return this.aggregationKeys;
	}
	public void setAggregationKeys(List<AttributionReportingAggregationKeysEntry> aggregationKeys) {
		this.aggregationKeys = aggregationKeys;
	}
	public String getDebugKey() {
		return this.debugKey;
	}
	public void setDebugKey(String debugKey) {
		this.debugKey = debugKey;
	}
	public String getTriggerDataMatching() {
		return this.triggerDataMatching;
	}
	public void setTriggerDataMatching(String triggerDataMatching) {
		this.triggerDataMatching = triggerDataMatching;
	}
	public String getDestinationLimitPriority() {
		return this.destinationLimitPriority;
	}
	public void setDestinationLimitPriority(String destinationLimitPriority) {
		this.destinationLimitPriority = destinationLimitPriority;
	}
	public AttributionReportingAggregatableDebugReportingConfig getAggregatableDebugReportingConfig() {
		return this.aggregatableDebugReportingConfig;
	}
	public void setAggregatableDebugReportingConfig(AttributionReportingAggregatableDebugReportingConfig aggregatableDebugReportingConfig) {
		this.aggregatableDebugReportingConfig = aggregatableDebugReportingConfig;
	}
	public AttributionScopesData getScopesData() {
		return this.scopesData;
	}
	public void setScopesData(AttributionScopesData scopesData) {
		this.scopesData = scopesData;
	}
	public int getMaxEventLevelReports() {
		return this.maxEventLevelReports;
	}
	public void setMaxEventLevelReports(int maxEventLevelReports) {
		this.maxEventLevelReports = maxEventLevelReports;
	}
	public List<AttributionReportingNamedBudgetDef> getNamedBudgets() {
		return this.namedBudgets;
	}
	public void setNamedBudgets(List<AttributionReportingNamedBudgetDef> namedBudgets) {
		this.namedBudgets = namedBudgets;
	}
	public boolean getDebugReporting() {
		return this.debugReporting;
	}
	public void setDebugReporting(boolean debugReporting) {
		this.debugReporting = debugReporting;
	}
	public Number getEventLevelEpsilon() {
		return this.eventLevelEpsilon;
	}
	public void setEventLevelEpsilon(Number eventLevelEpsilon) {
		this.eventLevelEpsilon = eventLevelEpsilon;
	}
}
