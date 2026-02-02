package ru.hzerr.cdp.type.console;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;

@Description("Console message.")
public class ConsoleMessage {

	@Required
	@Description("Message source.")
	@Enum({"xml", "javascript", "network", "console-api", "storage", "appcache", "rendering", "security", "other", "deprecation", "worker"})
	private String source;

	@Required
	@Description("Message severity.")
	@Enum({"log", "warning", "error", "debug", "info"})
	private String level;

	@Required
	@Description("Message text.")
	private String text;

	@Description("URL of the message origin.")
	private String url;

	@Description("Line number in the resource that generated this message (1-based).")
	private int line;

	@Description("Column number in the resource that generated this message (1-based).")
	private int column;

    public ConsoleMessage() {
    }

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
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
