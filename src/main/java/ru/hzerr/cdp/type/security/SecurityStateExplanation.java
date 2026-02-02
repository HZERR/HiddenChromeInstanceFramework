package ru.hzerr.cdp.type.security;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("An explanation of an factor contributing to the security state.")
public class SecurityStateExplanation {

	@Required
	@Description("Security state representing the severity of the factor being explained.")
	@TypeDescription("The security level of a page or resource.")
	private String securityState;

	@Required
	@Description("Title describing the type of factor.")
	private String title;

	@Required
	@Description("Short phrase describing the type of factor.")
	private String summary;

	@Required
	@Description("Full text explanation of the factor.")
	private String description;

	@Required
	@Description("The type of mixed content described by the explanation.")
	@TypeDescription("A description of mixed content (HTTP resources on HTTPS pages), as defined by https://www.w3.org/TR/mixed-content/#categories")
	private String mixedContentType;

	@Required
	@Description("Page certificate.")
	private String[] certificate;

	@Description("Recommendations to fix any issues.")
	private String[] recommendations;

    public SecurityStateExplanation() {
    }

	public String getSecurityState() {
		return this.securityState;
	}
	public void setSecurityState(String securityState) {
		this.securityState = securityState;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMixedContentType() {
		return this.mixedContentType;
	}
	public void setMixedContentType(String mixedContentType) {
		this.mixedContentType = mixedContentType;
	}
	public String[] getCertificate() {
		return this.certificate;
	}
	public void setCertificate(String[] certificate) {
		this.certificate = certificate;
	}
	public String[] getRecommendations() {
		return this.recommendations;
	}
	public void setRecommendations(String[] recommendations) {
		this.recommendations = recommendations;
	}
}
