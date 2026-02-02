package ru.hzerr.cdp.type.preload;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Information of headers to be displayed when the header mismatch occurred.")
public class PrerenderMismatchedHeaders {

	@Required
	private String headerName;

	private String initialValue;

	private String activationValue;

    public PrerenderMismatchedHeaders() {
    }

	public String getHeaderName() {
		return this.headerName;
	}
	public void setHeaderName(String headerName) {
		this.headerName = headerName;
	}
	public String getInitialValue() {
		return this.initialValue;
	}
	public void setInitialValue(String initialValue) {
		this.initialValue = initialValue;
	}
	public String getActivationValue() {
		return this.activationValue;
	}
	public void setActivationValue(String activationValue) {
		this.activationValue = activationValue;
	}
}
