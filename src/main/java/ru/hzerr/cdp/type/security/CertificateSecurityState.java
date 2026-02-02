package ru.hzerr.cdp.type.security;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Details about the security state of the page certificate.")
public class CertificateSecurityState {

	@Required
	@Description("Protocol name (e.g. \"TLS 1.2\" or \"QUIC\").")
	private String protocol;

	@Required
	@Description("Key Exchange used by the connection, or the empty string if not applicable.")
	private String keyExchange;

	@Description("(EC)DH group used by the connection, if applicable.")
	private String keyExchangeGroup;

	@Required
	@Description("Cipher name.")
	private String cipher;

	@Description("TLS MAC. Note that AEAD ciphers do not have separate MACs.")
	private String mac;

	@Required
	@Description("Page certificate.")
	private String[] certificate;

	@Required
	@Description("Certificate subject name.")
	private String subjectName;

	@Required
	@Description("Name of the issuing CA.")
	private String issuer;

	@Required
	@Description("Certificate valid from date.")
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number validFrom;

	@Required
	@Description("Certificate valid to (expiration) date")
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number validTo;

	@Description("The highest priority network error code, if the certificate has an error.")
	private String certificateNetworkError;

	@Required
	@Description("True if the certificate uses a weak signature algorithm.")
	private boolean certificateHasWeakSignature;

	@Required
	@Description("True if the certificate has a SHA1 signature in the chain.")
	private boolean certificateHasSha1Signature;

	@Required
	@Description("True if modern SSL")
	private boolean modernSSL;

	@Required
	@Description("True if the connection is using an obsolete SSL protocol.")
	private boolean obsoleteSslProtocol;

	@Required
	@Description("True if the connection is using an obsolete SSL key exchange.")
	private boolean obsoleteSslKeyExchange;

	@Required
	@Description("True if the connection is using an obsolete SSL cipher.")
	private boolean obsoleteSslCipher;

	@Required
	@Description("True if the connection is using an obsolete SSL signature.")
	private boolean obsoleteSslSignature;

    public CertificateSecurityState() {
    }

	public String getProtocol() {
		return this.protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getKeyExchange() {
		return this.keyExchange;
	}
	public void setKeyExchange(String keyExchange) {
		this.keyExchange = keyExchange;
	}
	public String getKeyExchangeGroup() {
		return this.keyExchangeGroup;
	}
	public void setKeyExchangeGroup(String keyExchangeGroup) {
		this.keyExchangeGroup = keyExchangeGroup;
	}
	public String getCipher() {
		return this.cipher;
	}
	public void setCipher(String cipher) {
		this.cipher = cipher;
	}
	public String getMac() {
		return this.mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String[] getCertificate() {
		return this.certificate;
	}
	public void setCertificate(String[] certificate) {
		this.certificate = certificate;
	}
	public String getSubjectName() {
		return this.subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getIssuer() {
		return this.issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	public Number getValidFrom() {
		return this.validFrom;
	}
	public void setValidFrom(Number validFrom) {
		this.validFrom = validFrom;
	}
	public Number getValidTo() {
		return this.validTo;
	}
	public void setValidTo(Number validTo) {
		this.validTo = validTo;
	}
	public String getCertificateNetworkError() {
		return this.certificateNetworkError;
	}
	public void setCertificateNetworkError(String certificateNetworkError) {
		this.certificateNetworkError = certificateNetworkError;
	}
	public boolean getCertificateHasWeakSignature() {
		return this.certificateHasWeakSignature;
	}
	public void setCertificateHasWeakSignature(boolean certificateHasWeakSignature) {
		this.certificateHasWeakSignature = certificateHasWeakSignature;
	}
	public boolean getCertificateHasSha1Signature() {
		return this.certificateHasSha1Signature;
	}
	public void setCertificateHasSha1Signature(boolean certificateHasSha1Signature) {
		this.certificateHasSha1Signature = certificateHasSha1Signature;
	}
	public boolean getModernSSL() {
		return this.modernSSL;
	}
	public void setModernSSL(boolean modernSSL) {
		this.modernSSL = modernSSL;
	}
	public boolean getObsoleteSslProtocol() {
		return this.obsoleteSslProtocol;
	}
	public void setObsoleteSslProtocol(boolean obsoleteSslProtocol) {
		this.obsoleteSslProtocol = obsoleteSslProtocol;
	}
	public boolean getObsoleteSslKeyExchange() {
		return this.obsoleteSslKeyExchange;
	}
	public void setObsoleteSslKeyExchange(boolean obsoleteSslKeyExchange) {
		this.obsoleteSslKeyExchange = obsoleteSslKeyExchange;
	}
	public boolean getObsoleteSslCipher() {
		return this.obsoleteSslCipher;
	}
	public void setObsoleteSslCipher(boolean obsoleteSslCipher) {
		this.obsoleteSslCipher = obsoleteSslCipher;
	}
	public boolean getObsoleteSslSignature() {
		return this.obsoleteSslSignature;
	}
	public void setObsoleteSslSignature(boolean obsoleteSslSignature) {
		this.obsoleteSslSignature = obsoleteSslSignature;
	}
}
