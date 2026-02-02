package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Details for a issue arising from an SAB being instantiated in, or transferred to a context that is not cross-origin isolated.")
public class SharedArrayBufferIssueDetails {

	@Required
	private SourceCodeLocation sourceCodeLocation;

	@Required
	private boolean isWarning;

	@Required
	private String type;

    public SharedArrayBufferIssueDetails() {
    }

	public SourceCodeLocation getSourceCodeLocation() {
		return this.sourceCodeLocation;
	}
	public void setSourceCodeLocation(SourceCodeLocation sourceCodeLocation) {
		this.sourceCodeLocation = sourceCodeLocation;
	}
	public boolean getIsWarning() {
		return this.isWarning;
	}
	public void setIsWarning(boolean isWarning) {
		this.isWarning = isWarning;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
