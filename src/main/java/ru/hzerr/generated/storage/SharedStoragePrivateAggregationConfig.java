package ru.hzerr.generated.storage;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Represents a dictionary object passed in as privateAggregationConfig to run or selectURL.")
public class SharedStoragePrivateAggregationConfig {

	@Description("The chosen aggregation service deployment.")
	private String aggregationCoordinatorOrigin;

	@Description("The context ID provided.")
	private String contextId;

	@Required
	@Description("Configures the maximum size allowed for filtering IDs.")
	private int filteringIdMaxBytes;

	@Description("The limit on the number of contributions in the final report.")
	private int maxContributions;

    public SharedStoragePrivateAggregationConfig() {
    }

	public String getAggregationCoordinatorOrigin() {
		return this.aggregationCoordinatorOrigin;
	}
	public void setAggregationCoordinatorOrigin(String aggregationCoordinatorOrigin) {
		this.aggregationCoordinatorOrigin = aggregationCoordinatorOrigin;
	}
	public String getContextId() {
		return this.contextId;
	}
	public void setContextId(String contextId) {
		this.contextId = contextId;
	}
	public int getFilteringIdMaxBytes() {
		return this.filteringIdMaxBytes;
	}
	public void setFilteringIdMaxBytes(int filteringIdMaxBytes) {
		this.filteringIdMaxBytes = filteringIdMaxBytes;
	}
	public int getMaxContributions() {
		return this.maxContributions;
	}
	public void setMaxContributions(int maxContributions) {
		this.maxContributions = maxContributions;
	}
}
