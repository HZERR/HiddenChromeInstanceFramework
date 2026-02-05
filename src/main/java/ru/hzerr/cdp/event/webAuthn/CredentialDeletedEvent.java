package ru.hzerr.cdp.event.webAuthn;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Description("Triggered when a credential is deleted, e.g. through PublicKeyCredential.signalUnknownCredential().")
@Event("credentialDeleted")
public class CredentialDeletedEvent {

	@Required
	private String authenticatorId;

	@Required
	private byte[] credentialId;

    public CredentialDeletedEvent() {
    }

	public String getAuthenticatorId() {
		return this.authenticatorId;
	}
	public void setAuthenticatorId(String authenticatorId) {
		this.authenticatorId = authenticatorId;
	}
	public byte[] getCredentialId() {
		return this.credentialId;
	}
	public void setCredentialId(byte[] credentialId) {
		this.credentialId = credentialId;
	}
}
