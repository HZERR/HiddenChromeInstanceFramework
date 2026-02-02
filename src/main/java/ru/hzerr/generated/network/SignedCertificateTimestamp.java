package ru.hzerr.generated.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Details of a signed certificate timestamp (SCT).")
public class SignedCertificateTimestamp {

	@Required
	@Description("Validation status.")
	private String status;

	@Required
	@Description("Origin.")
	private String origin;

	@Required
	@Description("Log name / description.")
	private String logDescription;

	@Required
	@Description("Log ID.")
	private String logId;

	@Required
	@Description("Issuance date. Unlike TimeSinceEpoch, this contains the number of milliseconds since January 1, 1970, UTC, not the number of seconds.")
	private Number timestamp;

	@Required
	@Description("Hash algorithm.")
	private String hashAlgorithm;

	@Required
	@Description("Signature algorithm.")
	private String signatureAlgorithm;

	@Required
	@Description("Signature data.")
	private String signatureData;

    public SignedCertificateTimestamp() {
    }

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getLogDescription() {
		return this.logDescription;
	}
	public void setLogDescription(String logDescription) {
		this.logDescription = logDescription;
	}
	public String getLogId() {
		return this.logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
	public String getHashAlgorithm() {
		return this.hashAlgorithm;
	}
	public void setHashAlgorithm(String hashAlgorithm) {
		this.hashAlgorithm = hashAlgorithm;
	}
	public String getSignatureAlgorithm() {
		return this.signatureAlgorithm;
	}
	public void setSignatureAlgorithm(String signatureAlgorithm) {
		this.signatureAlgorithm = signatureAlgorithm;
	}
	public String getSignatureData() {
		return this.signatureData;
	}
	public void setSignatureData(String signatureData) {
		this.signatureData = signatureData;
	}
}
