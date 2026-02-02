package ru.hzerr.cdp.type.debugger;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Experimental
@Description("Location in the source code.")
public class ScriptPosition {

	@Required
	private int lineNumber;

	@Required
	private int columnNumber;

    public ScriptPosition() {
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
