package ru.hzerr.cdp.type.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;
import java.util.List;

@Experimental
public class AttributionReportingAggregatableDebugReportingConfig {

	@Description("number instead of integer because not all uint32 can be represented by int, only present for source registrations")
	private Number budget;

	@Required
	@TypeExperimental
	private String keyPiece;

	@Required
	private List<AttributionReportingAggregatableDebugReportingData> debugData;

	private String aggregationCoordinatorOrigin;

    public AttributionReportingAggregatableDebugReportingConfig() {
    }

	public Number getBudget() {
		return this.budget;
	}
	public void setBudget(Number budget) {
		this.budget = budget;
	}
	public String getKeyPiece() {
		return this.keyPiece;
	}
	public void setKeyPiece(String keyPiece) {
		this.keyPiece = keyPiece;
	}
	public List<AttributionReportingAggregatableDebugReportingData> getDebugData() {
		return this.debugData;
	}
	public void setDebugData(List<AttributionReportingAggregatableDebugReportingData> debugData) {
		this.debugData = debugData;
	}
	public String getAggregationCoordinatorOrigin() {
		return this.aggregationCoordinatorOrigin;
	}
	public void setAggregationCoordinatorOrigin(String aggregationCoordinatorOrigin) {
		this.aggregationCoordinatorOrigin = aggregationCoordinatorOrigin;
	}
}
