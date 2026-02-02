package ru.hzerr.generated.debugger;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Location in the source code.")
public class Location {

	@Required
	@Description("Script identifier as reported in the `Debugger.scriptParsed`.")
	@TypeDescription("Unique script identifier.")
	private String scriptId;

	@Required
	@Description("Line number in the script (0-based).")
	private int lineNumber;

	@Description("Column number in the script (0-based).")
	private int columnNumber;

    public Location() {
    }

	public String getScriptId() {
		return this.scriptId;
	}
	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
	}
	public int getLineNumber() {
		return this.lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public int getColumnNumber() {
		return this.columnNumber;
	}
	public void setColumnNumber(int columnNumber) {
		this.columnNumber = columnNumber;
	}
}
