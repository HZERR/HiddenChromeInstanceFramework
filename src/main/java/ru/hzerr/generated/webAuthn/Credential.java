package ru.hzerr.generated.webAuthn;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

public class Credential {

	@Required
	private byte[] credentialId;

	@Required
	private boolean isResidentCredential;

	@Description("Relying Party ID the credential is scoped to. Must be set when adding a credential.")
	private String rpId;

	@Required
	@Description("The ECDSA P-256 private key in PKCS#8 format.")
	private byte[] privateKey;

	@Description("An opaque byte sequence with a maximum size of 64 bytes mapping the credential to a specific user.")
	private byte[] userHandle;

	@Required
	@Description("Signature counter. This is incremented by one for each successful assertion. See https://w3c.github.io/webauthn/#signature-counter")
	private int signCount;

	@Description("The large blob associated with the credential. See https://w3c.github.io/webauthn/#sctn-large-blob-extension")
	private byte[] largeBlob;

	@Description("Assertions returned by this credential will have the backup eligibility (BE) flag set to this value. Defaults to the authenticator's defaultBackupEligibility value.")
	private boolean backupEligibility;

	@Description("Assertions returned by this credential will have the backup state (BS) flag set to this value. Defaults to the authenticator's defaultBackupState value.")
	private boolean backupState;

	@Description("The credential's user.name property. Equivalent to empty if not set. https://w3c.github.io/webauthn/#dom-publickeycredentialentity-name")
	private String userName;

	@Description("The credential's user.displayName property. Equivalent to empty if not set. https://w3c.github.io/webauthn/#dom-publickeycredentialuserentity-displayname")
	private String userDisplayName;

    public Credential() {
    }

	public byte[] getCredentialId() {
		return this.credentialId;
	}
	public void setCredentialId(byte[] credentialId) {
		this.credentialId = credentialId;
	}
	public boolean getIsResidentCredential() {
		return this.isResidentCredential;
	}
	public void setIsResidentCredential(boolean isResidentCredential) {
		this.isResidentCredential = isResidentCredential;
	}
	public String getRpId() {
		return this.rpId;
	}
	public void setRpId(String rpId) {
		this.rpId = rpId;
	}
	public byte[] getPrivateKey() {
		return this.privateKey;
	}
	public void setPrivateKey(byte[] privateKey) {
		this.privateKey = privateKey;
	}
	public byte[] getUserHandle() {
		return this.userHandle;
	}
	public void setUserHandle(byte[] userHandle) {
		this.userHandle = userHandle;
	}
	public int getSignCount() {
		return this.signCount;
	}
	public void setSignCount(int signCount) {
		this.signCount = signCount;
	}
	public byte[] getLargeBlob() {
		return this.largeBlob;
	}
	public void setLargeBlob(byte[] largeBlob) {
		this.largeBlob = largeBlob;
	}
	public boolean getBackupEligibility() {
		return this.backupEligibility;
	}
	public void setBackupEligibility(boolean backupEligibility) {
		this.backupEligibility = backupEligibility;
	}
	public boolean getBackupState() {
		return this.backupState;
	}
	public void setBackupState(boolean backupState) {
		this.backupState = backupState;
	}
	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserDisplayName() {
		return this.userDisplayName;
	}
	public void setUserDisplayName(String userDisplayName) {
		this.userDisplayName = userDisplayName;
	}
}
