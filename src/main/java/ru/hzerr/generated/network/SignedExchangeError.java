package ru.hzerr.generated.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Information about a signed exchange response.")
public class SignedExchangeError {

	@Required
	@Description("Error message.")
	private String message;

	@Description("The index of the signature which caused the error.")
	private int signatureIndex;

	@Description("The field which caused the error.")
	@TypeExperimental
	@TypeDescription("Field type for a signed exchange related error.")
	private String errorField;

    public SignedExchangeError() {
    }

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getSignatureIndex() {
		return this.signatureIndex;
	}
	public void setSignatureIndex(int signatureIndex) {
		this.signatureIndex = signatureIndex;
	}
	public String getErrorField() {
		return this.errorField;
	}
	public void setErrorField(String errorField) {
		this.errorField = errorField;
	}
}
