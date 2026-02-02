package ru.hzerr.generated.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Description("Security details about a request.")
public class SecurityDetails {

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
	@Description("Certificate ID value.")
	@TypeDescription("An internal certificate ID value.")
	private int certificateId;

	@Required
	@Description("Certificate subject name.")
	private String subjectName;

	@Required
	@Description("Subject Alternative Name (SAN) DNS names and IP addresses.")
	private String[] sanList;

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

	@Required
	@Description("List of signed certificate timestamps (SCTs).")
	private List<SignedCertificateTimestamp> signedCertificateTimestampList;

	@Required
	@Description("Whether the request complied with Certificate Transparency policy")
	@TypeDescription("Whether the request complied with Certificate Transparency policy.")
	private String certificateTransparencyCompliance;

	@Description("The signature algorithm used by the server in the TLS server signature, represented as a TLS SignatureScheme code point. Omitted if not applicable or not known.")
	private int serverSignatureAlgorithm;

	@Required
	@Description("Whether the connection used Encrypted ClientHello")
	private boolean encryptedClientHello;

    public SecurityDetails() {
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
	public int getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}
	public String getSubjectName() {
		return this.subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String[] getSanList() {
		return this.sanList;
	}
	public void setSanList(String[] sanList) {
		this.sanList = sanList;
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
	public List<SignedCertificateTimestamp> getSignedCertificateTimestampList() {
		return this.signedCertificateTimestampList;
	}
	public void setSignedCertificateTimestampList(List<SignedCertificateTimestamp> signedCertificateTimestampList) {
		this.signedCertificateTimestampList = signedCertificateTimestampList;
	}
	public String getCertificateTransparencyCompliance() {
		return this.certificateTransparencyCompliance;
	}
	public void setCertificateTransparencyCompliance(String certificateTransparencyCompliance) {
		this.certificateTransparencyCompliance = certificateTransparencyCompliance;
	}
	public int getServerSignatureAlgorithm() {
		return this.serverSignatureAlgorithm;
	}
	public void setServerSignatureAlgorithm(int serverSignatureAlgorithm) {
		this.serverSignatureAlgorithm = serverSignatureAlgorithm;
	}
	public boolean getEncryptedClientHello() {
		return this.encryptedClientHello;
	}
	public void setEncryptedClientHello(boolean encryptedClientHello) {
		this.encryptedClientHello = encryptedClientHello;
	}
}
