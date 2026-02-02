package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("This issue warns about errors in property rules that lead to property registrations being ignored.")
public class PropertyRuleIssueDetails {

	@Required
	@Description("Source code position of the property rule.")
	private SourceCodeLocation sourceCodeLocation;

	@Required
	@Description("Reason why the property rule was discarded.")
	private String propertyRuleIssueReason;

	@Description("The value of the property rule property that failed to parse")
	private String propertyValue;

    public PropertyRuleIssueDetails() {
    }

	public SourceCodeLocation getSourceCodeLocation() {
		return this.sourceCodeLocation;
	}
	public void setSourceCodeLocation(SourceCodeLocation sourceCodeLocation) {
		this.sourceCodeLocation = sourceCodeLocation;
	}
	public String getPropertyRuleIssueReason() {
		return this.propertyRuleIssueReason;
	}
	public void setPropertyRuleIssueReason(String propertyRuleIssueReason) {
		this.propertyRuleIssueReason = propertyRuleIssueReason;
	}
	public String getPropertyValue() {
		return this.propertyValue;
	}
	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}
}
