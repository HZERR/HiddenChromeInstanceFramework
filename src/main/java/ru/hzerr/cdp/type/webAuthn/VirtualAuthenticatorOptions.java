package ru.hzerr.cdp.type.webAuthn;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

public class VirtualAuthenticatorOptions {

	@Required
	private String protocol;

	@Description("Defaults to ctap2_0. Ignored if |protocol| == u2f.")
	private String ctap2Version;

	@Required
	private String transport;

	@Description("Defaults to false.")
	private boolean hasResidentKey;

	@Description("Defaults to false.")
	private boolean hasUserVerification;

	@Description("If set to true, the authenticator will support the largeBlob extension. https://w3c.github.io/webauthn#largeBlob Defaults to false.")
	private boolean hasLargeBlob;

	@Description("If set to true, the authenticator will support the credBlob extension. https://fidoalliance.org/specs/fido-v2.1-rd-20201208/fido-client-to-authenticator-protocol-v2.1-rd-20201208.html#sctn-credBlob-extension Defaults to false.")
	private boolean hasCredBlob;

	@Description("If set to true, the authenticator will support the minPinLength extension. https://fidoalliance.org/specs/fido-v2.1-ps-20210615/fido-client-to-authenticator-protocol-v2.1-ps-20210615.html#sctn-minpinlength-extension Defaults to false.")
	private boolean hasMinPinLength;

	@Description("If set to true, the authenticator will support the prf extension. https://w3c.github.io/webauthn/#prf-extension Defaults to false.")
	private boolean hasPrf;

	@Description("If set to true, tests of user presence will succeed immediately. Otherwise, they will not be resolved. Defaults to true.")
	private boolean automaticPresenceSimulation;

	@Description("Sets whether User Verification succeeds or fails for an authenticator. Defaults to false.")
	private boolean isUserVerified;

	@Description("Credentials created by this authenticator will have the backup eligibility (BE) flag set to this value. Defaults to false. https://w3c.github.io/webauthn/#sctn-credential-backup")
	private boolean defaultBackupEligibility;

	@Description("Credentials created by this authenticator will have the backup state (BS) flag set to this value. Defaults to false. https://w3c.github.io/webauthn/#sctn-credential-backup")
	private boolean defaultBackupState;

    public VirtualAuthenticatorOptions() {
    }

	public String getProtocol() {
		return this.protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getCtap2Version() {
		return this.ctap2Version;
	}
	public void setCtap2Version(String ctap2Version) {
		this.ctap2Version = ctap2Version;
	}
	public String getTransport() {
		return this.transport;
	}
	public void setTransport(String transport) {
		this.transport = transport;
	}
	public boolean getHasResidentKey() {
		return this.hasResidentKey;
	}
	public void setHasResidentKey(boolean hasResidentKey) {
		this.hasResidentKey = hasResidentKey;
	}
	public boolean getHasUserVerification() {
		return this.hasUserVerification;
	}
	public void setHasUserVerification(boolean hasUserVerification) {
		this.hasUserVerification = hasUserVerification;
	}
	public boolean getHasLargeBlob() {
		return this.hasLargeBlob;
	}
	public void setHasLargeBlob(boolean hasLargeBlob) {
		this.hasLargeBlob = hasLargeBlob;
	}
	public boolean getHasCredBlob() {
		return this.hasCredBlob;
	}
	public void setHasCredBlob(boolean hasCredBlob) {
		this.hasCredBlob = hasCredBlob;
	}
	public boolean getHasMinPinLength() {
		return this.hasMinPinLength;
	}
	public void setHasMinPinLength(boolean hasMinPinLength) {
		this.hasMinPinLength = hasMinPinLength;
	}
	public boolean getHasPrf() {
		return this.hasPrf;
	}
	public void setHasPrf(boolean hasPrf) {
		this.hasPrf = hasPrf;
	}
	public boolean getAutomaticPresenceSimulation() {
		return this.automaticPresenceSimulation;
	}
	public void setAutomaticPresenceSimulation(boolean automaticPresenceSimulation) {
		this.automaticPresenceSimulation = automaticPresenceSimulation;
	}
	public boolean getIsUserVerified() {
		return this.isUserVerified;
	}
	public void setIsUserVerified(boolean isUserVerified) {
		this.isUserVerified = isUserVerified;
	}
	public boolean getDefaultBackupEligibility() {
		return this.defaultBackupEligibility;
	}
	public void setDefaultBackupEligibility(boolean defaultBackupEligibility) {
		this.defaultBackupEligibility = defaultBackupEligibility;
	}
	public boolean getDefaultBackupState() {
		return this.defaultBackupState;
	}
	public void setDefaultBackupState(boolean defaultBackupState) {
		this.defaultBackupState = defaultBackupState;
	}
}
