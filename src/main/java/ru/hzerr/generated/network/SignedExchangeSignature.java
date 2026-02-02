package ru.hzerr.generated.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Experimental
@Description("Information about a signed exchange signature. https://wicg.github.io/webpackage/draft-yasskin-httpbis-origin-signed-exchanges-impl.html#rfc.section.3.1")
public class SignedExchangeSignature {

	@Required
	@Description("Signed exchange signature label.")
	private String label;

	@Required
	@Description("The hex string of signed exchange signature.")
	private String signature;

	@Required
	@Description("Signed exchange signature integrity.")
	private String integrity;

	@Description("Signed exchange signature cert Url.")
	private String certUrl;

	@Description("The hex string of signed exchange signature cert sha256.")
	private String certSha256;

	@Required
	@Description("Signed exchange signature validity Url.")
	private String validityUrl;

	@Required
	@Description("Signed exchange signature date.")
	private int date;

	@Required
	@Description("Signed exchange signature expires.")
	private int expires;

	@Description("The encoded certificates.")
	private String[] certificates;

    public SignedExchangeSignature() {
    }

	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getSignature() {
		return this.signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getIntegrity() {
		return this.integrity;
	}
	public void setIntegrity(String integrity) {
		this.integrity = integrity;
	}
	public String getCertUrl() {
		return this.certUrl;
	}
	public void setCertUrl(String certUrl) {
		this.certUrl = certUrl;
	}
	public String getCertSha256() {
		return this.certSha256;
	}
	public void setCertSha256(String certSha256) {
		this.certSha256 = certSha256;
	}
	public String getValidityUrl() {
		return this.validityUrl;
	}
	public void setValidityUrl(String validityUrl) {
		this.validityUrl = validityUrl;
	}
	public int getDate() {
		return this.date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getExpires() {
		return this.expires;
	}
	public void setExpires(int expires) {
		this.expires = expires;
	}
	public String[] getCertificates() {
		return this.certificates;
	}
	public void setCertificates(String[] certificates) {
		this.certificates = certificates;
	}
}
