package ru.hzerr.generated.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;

@Experimental
public class ClientSecurityState {

	@Required
	private boolean initiatorIsSecureContext;

	@Required
	@TypeExperimental
	private String initiatorIPAddressSpace;

	@Required
	@TypeExperimental
	private String privateNetworkRequestPolicy;

    public ClientSecurityState() {
    }

	public boolean getInitiatorIsSecureContext() {
		return this.initiatorIsSecureContext;
	}
	public void setInitiatorIsSecureContext(boolean initiatorIsSecureContext) {
		this.initiatorIsSecureContext = initiatorIsSecureContext;
	}
	public String getInitiatorIPAddressSpace() {
		return this.initiatorIPAddressSpace;
	}
	public void setInitiatorIPAddressSpace(String initiatorIPAddressSpace) {
		this.initiatorIPAddressSpace = initiatorIPAddressSpace;
	}
	public String getPrivateNetworkRequestPolicy() {
		return this.privateNetworkRequestPolicy;
	}
	public void setPrivateNetworkRequestPolicy(String privateNetworkRequestPolicy) {
		this.privateNetworkRequestPolicy = privateNetworkRequestPolicy;
	}
}
