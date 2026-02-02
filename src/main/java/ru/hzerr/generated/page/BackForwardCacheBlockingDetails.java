package ru.hzerr.generated.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Experimental
public class BackForwardCacheBlockingDetails {

	@Description("Url of the file where blockage happened. Optional because of tests.")
	private String url;

	@Description("Function name where blockage happened. Optional because of anonymous functions and tests.")
	private String function;

	@Required
	@Description("Line number in the script (0-based).")
	private int lineNumber;

	@Required
	@Description("Column number in the script (0-based).")
	private int columnNumber;

    public BackForwardCacheBlockingDetails() {
    }

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getFunction() {
		return this.function;
	}
	public void setFunction(String function) {
		this.function = function;
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
