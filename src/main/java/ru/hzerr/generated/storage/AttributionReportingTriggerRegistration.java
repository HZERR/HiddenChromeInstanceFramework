package ru.hzerr.generated.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;
import java.util.List;

@Experimental
public class AttributionReportingTriggerRegistration {

	@Required
	private AttributionReportingFilterPair filters;

	@TypeExperimental
	private String debugKey;

	@Required
	private List<AttributionReportingAggregatableDedupKey> aggregatableDedupKeys;

	@Required
	private List<AttributionReportingEventTriggerData> eventTriggerData;

	@Required
	private List<AttributionReportingAggregatableTriggerData> aggregatableTriggerData;

	@Required
	private List<AttributionReportingAggregatableValueEntry> aggregatableValues;

	@Required
	private int aggregatableFilteringIdMaxBytes;

	@Required
	private boolean debugReporting;

	private String aggregationCoordinatorOrigin;

	@Required
	@TypeExperimental
	private String sourceRegistrationTimeConfig;

	private String triggerContextId;

	@Required
	private AttributionReportingAggregatableDebugReportingConfig aggregatableDebugReportingConfig;

	@Required
	private String[] scopes;

	@Required
	private List<AttributionReportingNamedBudgetCandidate> namedBudgets;

    public AttributionReportingTriggerRegistration() {
    }

	public AttributionReportingFilterPair getFilters() {
		return this.filters;
	}
	public void setFilters(AttributionReportingFilterPair filters) {
		this.filters = filters;
	}
	public String getDebugKey() {
		return this.debugKey;
	}
	public void setDebugKey(String debugKey) {
		this.debugKey = debugKey;
	}
	public List<AttributionReportingAggregatableDedupKey> getAggregatableDedupKeys() {
		return this.aggregatableDedupKeys;
	}
	public void setAggregatableDedupKeys(List<AttributionReportingAggregatableDedupKey> aggregatableDedupKeys) {
		this.aggregatableDedupKeys = aggregatableDedupKeys;
	}
	public List<AttributionReportingEventTriggerData> getEventTriggerData() {
		return this.eventTriggerData;
	}
	public void setEventTriggerData(List<AttributionReportingEventTriggerData> eventTriggerData) {
		this.eventTriggerData = eventTriggerData;
	}
	public List<AttributionReportingAggregatableTriggerData> getAggregatableTriggerData() {
		return this.aggregatableTriggerData;
	}
	public void setAggregatableTriggerData(List<AttributionReportingAggregatableTriggerData> aggregatableTriggerData) {
		this.aggregatableTriggerData = aggregatableTriggerData;
	}
	public List<AttributionReportingAggregatableValueEntry> getAggregatableValues() {
		return this.aggregatableValues;
	}
	public void setAggregatableValues(List<AttributionReportingAggregatableValueEntry> aggregatableValues) {
		this.aggregatableValues = aggregatableValues;
	}
	public int getAggregatableFilteringIdMaxBytes() {
		return this.aggregatableFilteringIdMaxBytes;
	}
	public void setAggregatableFilteringIdMaxBytes(int aggregatableFilteringIdMaxBytes) {
		this.aggregatableFilteringIdMaxBytes = aggregatableFilteringIdMaxBytes;
	}
	public boolean getDebugReporting() {
		return this.debugReporting;
	}
	public void setDebugReporting(boolean debugReporting) {
		this.debugReporting = debugReporting;
	}
	public String getAggregationCoordinatorOrigin() {
		return this.aggregationCoordinatorOrigin;
	}
	public void setAggregationCoordinatorOrigin(String aggregationCoordinatorOrigin) {
		this.aggregationCoordinatorOrigin = aggregationCoordinatorOrigin;
	}
	public String getSourceRegistrationTimeConfig() {
		return this.sourceRegistrationTimeConfig;
	}
	public void setSourceRegistrationTimeConfig(String sourceRegistrationTimeConfig) {
		this.sourceRegistrationTimeConfig = sourceRegistrationTimeConfig;
	}
	public String getTriggerContextId() {
		return this.triggerContextId;
	}
	public void setTriggerContextId(String triggerContextId) {
		this.triggerContextId = triggerContextId;
	}
	public AttributionReportingAggregatableDebugReportingConfig getAggregatableDebugReportingConfig() {
		return this.aggregatableDebugReportingConfig;
	}
	public void setAggregatableDebugReportingConfig(AttributionReportingAggregatableDebugReportingConfig aggregatableDebugReportingConfig) {
		this.aggregatableDebugReportingConfig = aggregatableDebugReportingConfig;
	}
	public String[] getScopes() {
		return this.scopes;
	}
	public void setScopes(String[] scopes) {
		this.scopes = scopes;
	}
	public List<AttributionReportingNamedBudgetCandidate> getNamedBudgets() {
		return this.namedBudgets;
	}
	public void setNamedBudgets(List<AttributionReportingNamedBudgetCandidate> namedBudgets) {
		this.namedBudgets = namedBudgets;
	}
}
