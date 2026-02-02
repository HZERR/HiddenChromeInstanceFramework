package ru.hzerr.generated.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Experimental
@Description("Pair of issuer origin and number of available (signed, but not used) Trust Tokens from that issuer.")
public class TrustTokens {

	@Required
	private String issuerOrigin;

	@Required
	private Number count;

    public TrustTokens() {
    }

	public String getIssuerOrigin() {
		return this.issuerOrigin;
	}
	public void setIssuerOrigin(String issuerOrigin) {
		this.issuerOrigin = issuerOrigin;
	}
	public Number getCount() {
		return this.count;
	}
	public void setCount(Number count) {
		this.count = count;
	}
}
