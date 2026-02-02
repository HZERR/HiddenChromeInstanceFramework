package ru.hzerr.cdp.type.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Text range within a resource. All numbers are zero-based.")
public class SourceRange {

	@Required
	@Description("Start line of range.")
	private int startLine;

	@Required
	@Description("Start column of range (inclusive).")
	private int startColumn;

	@Required
	@Description("End line of range")
	private int endLine;

	@Required
	@Description("End column of range (exclusive).")
	private int endColumn;

    public SourceRange() {
    }

	public int getStartLine() {
		return this.startLine;
	}
	public void setStartLine(int startLine) {
		this.startLine = startLine;
	}
	public int getStartColumn() {
		return this.startColumn;
	}
	public void setStartColumn(int startColumn) {
		this.startColumn = startColumn;
	}
	public int getEndLine() {
		return this.endLine;
	}
	public void setEndLine(int endLine) {
		this.endLine = endLine;
	}
	public int getEndColumn() {
		return this.endColumn;
	}
	public void setEndColumn(int endColumn) {
		this.endColumn = endColumn;
	}
}
