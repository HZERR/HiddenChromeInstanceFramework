package ru.hzerr.cdp.type.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.annotation.Description;

@Experimental
public class AttributionReportingAggregatableDebugReportingData {

	@Required
	@TypeExperimental
	private String keyPiece;

	@Required
	@Description("number instead of integer because not all uint32 can be represented by int")
	private Number value;

	@Required
	private String[] types;

    public AttributionReportingAggregatableDebugReportingData() {
    }

	public String getKeyPiece() {
		return this.keyPiece;
	}
	public void setKeyPiece(String keyPiece) {
		this.keyPiece = keyPiece;
	}
	public Number getValue() {
		return this.value;
	}
	public void setValue(Number value) {
		this.value = value;
	}
	public String[] getTypes() {
		return this.types;
	}
	public void setTypes(String[] types) {
		this.types = types;
	}
}
