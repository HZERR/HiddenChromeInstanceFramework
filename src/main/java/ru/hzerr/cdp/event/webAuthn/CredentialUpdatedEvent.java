package ru.hzerr.cdp.event.webAuthn;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.webAuthn.Credential;

@Description("Triggered when a credential is updated, e.g. through PublicKeyCredential.signalCurrentUserDetails().")
@Event("credentialUpdated")
public class CredentialUpdatedEvent {

	@Required
	private String authenticatorId;

	@Required
	private Credential credential;

    public CredentialUpdatedEvent() {
    }

	public String getAuthenticatorId() {
		return this.authenticatorId;
	}
	public void setAuthenticatorId(String authenticatorId) {
		this.authenticatorId = authenticatorId;
	}
	public Credential getCredential() {
		return this.credential;
	}
	public void setCredential(Credential credential) {
		this.credential = credential;
	}
}
