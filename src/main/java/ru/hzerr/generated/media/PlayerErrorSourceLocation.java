package ru.hzerr.generated.media;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Represents logged source line numbers reported in an error. NOTE: file and line are from chromium c++ implementation code, not js.")
public class PlayerErrorSourceLocation {

	@Required
	private String file;

	@Required
	private int line;

    public PlayerErrorSourceLocation() {
    }

	public String getFile() {
		return this.file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public int getLine() {
		return this.line;
	}
	public void setLine(int line) {
		this.line = line;
	}
}
