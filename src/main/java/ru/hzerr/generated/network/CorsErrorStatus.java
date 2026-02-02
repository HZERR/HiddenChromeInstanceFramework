package ru.hzerr.generated.network;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

public class CorsErrorStatus {

	@Required
	@TypeDescription("The reason why request was blocked.")
	private String corsError;

	@Required
	private String failedParameter;

    public CorsErrorStatus() {
    }

	public String getCorsError() {
		return this.corsError;
	}
	public void setCorsError(String corsError) {
		this.corsError = corsError;
	}
	public String getFailedParameter() {
		return this.failedParameter;
	}
	public void setFailedParameter(String failedParameter) {
		this.failedParameter = failedParameter;
	}
}
