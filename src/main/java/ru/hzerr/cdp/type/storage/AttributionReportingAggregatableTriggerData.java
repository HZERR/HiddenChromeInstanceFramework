package ru.hzerr.cdp.type.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;

@Experimental
public class AttributionReportingAggregatableTriggerData {

	@Required
	@TypeExperimental
	private String keyPiece;

	@Required
	private String[] sourceKeys;

	@Required
	private AttributionReportingFilterPair filters;

    public AttributionReportingAggregatableTriggerData() {
    }

	public String getKeyPiece() {
		return this.keyPiece;
	}
	public void setKeyPiece(String keyPiece) {
		this.keyPiece = keyPiece;
	}
	public String[] getSourceKeys() {
		return this.sourceKeys;
	}
	public void setSourceKeys(String[] sourceKeys) {
		this.sourceKeys = sourceKeys;
	}
	public AttributionReportingFilterPair getFilters() {
		return this.filters;
	}
	public void setFilters(AttributionReportingFilterPair filters) {
		this.filters = filters;
	}
}
