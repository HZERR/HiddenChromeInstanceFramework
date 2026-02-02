package ru.hzerr.cdp.type.security;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Deprecated
@Description("Information about insecure content on the page.")
public class InsecureContentStatus {

	@Required
	@Description("Always false.")
	private boolean ranMixedContent;

	@Required
	@Description("Always false.")
	private boolean displayedMixedContent;

	@Required
	@Description("Always false.")
	private boolean containedMixedForm;

	@Required
	@Description("Always false.")
	private boolean ranContentWithCertErrors;

	@Required
	@Description("Always false.")
	private boolean displayedContentWithCertErrors;

	@Required
	@Description("Always set to unknown.")
	@TypeDescription("The security level of a page or resource.")
	private String ranInsecureContentStyle;

	@Required
	@Description("Always set to unknown.")
	@TypeDescription("The security level of a page or resource.")
	private String displayedInsecureContentStyle;

    public InsecureContentStatus() {
    }

	public boolean getRanMixedContent() {
		return this.ranMixedContent;
	}
	public void setRanMixedContent(boolean ranMixedContent) {
		this.ranMixedContent = ranMixedContent;
	}
	public boolean getDisplayedMixedContent() {
		return this.displayedMixedContent;
	}
	public void setDisplayedMixedContent(boolean displayedMixedContent) {
		this.displayedMixedContent = displayedMixedContent;
	}
	public boolean getContainedMixedForm() {
		return this.containedMixedForm;
	}
	public void setContainedMixedForm(boolean containedMixedForm) {
		this.containedMixedForm = containedMixedForm;
	}
	public boolean getRanContentWithCertErrors() {
		return this.ranContentWithCertErrors;
	}
	public void setRanContentWithCertErrors(boolean ranContentWithCertErrors) {
		this.ranContentWithCertErrors = ranContentWithCertErrors;
	}
	public boolean getDisplayedContentWithCertErrors() {
		return this.displayedContentWithCertErrors;
	}
	public void setDisplayedContentWithCertErrors(boolean displayedContentWithCertErrors) {
		this.displayedContentWithCertErrors = displayedContentWithCertErrors;
	}
	public String getRanInsecureContentStyle() {
		return this.ranInsecureContentStyle;
	}
	public void setRanInsecureContentStyle(String ranInsecureContentStyle) {
		this.ranInsecureContentStyle = ranInsecureContentStyle;
	}
	public String getDisplayedInsecureContentStyle() {
		return this.displayedInsecureContentStyle;
	}
	public void setDisplayedInsecureContentStyle(String displayedInsecureContentStyle) {
		this.displayedInsecureContentStyle = displayedInsecureContentStyle;
	}
}
