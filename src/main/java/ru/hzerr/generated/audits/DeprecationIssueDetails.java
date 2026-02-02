package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("This issue tracks information needed to print a deprecation message. https://source.chromium.org/chromium/chromium/src/+/main:third_party/blink/renderer/core/frame/third_party/blink/renderer/core/frame/deprecation/README.md")
public class DeprecationIssueDetails {

	private AffectedFrame affectedFrame;

	@Required
	private SourceCodeLocation sourceCodeLocation;

	@Required
	@Description("One of the deprecation names from third_party/blink/renderer/core/frame/deprecation/deprecation.json5")
	private String type;

    public DeprecationIssueDetails() {
    }

	public AffectedFrame getAffectedFrame() {
		return this.affectedFrame;
	}
	public void setAffectedFrame(AffectedFrame affectedFrame) {
		this.affectedFrame = affectedFrame;
	}
	public SourceCodeLocation getSourceCodeLocation() {
		return this.sourceCodeLocation;
	}
	public void setSourceCodeLocation(SourceCodeLocation sourceCodeLocation) {
		this.sourceCodeLocation = sourceCodeLocation;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
