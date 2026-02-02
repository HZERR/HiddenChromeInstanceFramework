package ru.hzerr.cdp.type.page;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Error while paring app manifest.")
public class AppManifestError {

	@Required
	@Description("Error message.")
	private String message;

	@Required
	@Description("If critical, this is a non-recoverable parse error.")
	private int critical;

	@Required
	@Description("Error line.")
	private int line;

	@Required
	@Description("Error column.")
	private int column;

    public AppManifestError() {
    }

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getCritical() {
		return this.critical;
	}
	public void setCritical(int critical) {
		this.critical = critical;
	}
	public int getLine() {
		return this.line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public int getColumn() {
		return this.column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
}
