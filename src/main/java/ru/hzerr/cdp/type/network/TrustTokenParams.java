package ru.hzerr.cdp.type.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.annotation.Enum;

@Experimental
@Description("Determines what type of Trust Token operation is executed and depending on the type, some additional parameters. The values are specified in third_party/blink/renderer/core/fetch/trust_token.idl.")
public class TrustTokenParams {

	@Required
	@TypeExperimental
	private String operation;

	@Required
	@Description("Only set for \"token-redemption\" operation and determine whether to request a fresh SRR or use a still valid cached SRR.")
	@Enum({"UseCached", "Refresh"})
	private String refreshPolicy;

	@Description("Origins of issuers from whom to request tokens or redemption records.")
	private String[] issuers;

    public TrustTokenParams() {
    }

	public String getOperation() {
		return this.operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getRefreshPolicy() {
		return this.refreshPolicy;
	}
	public void setRefreshPolicy(String refreshPolicy) {
		this.refreshPolicy = refreshPolicy;
	}
	public String[] getIssuers() {
		return this.issuers;
	}
	public void setIssuers(String[] issuers) {
		this.issuers = issuers;
	}
}
