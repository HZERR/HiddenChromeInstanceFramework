package ru.hzerr.cdp.type.pwa;

import ru.hzerr.annotation.Required;
import java.util.List;

public class FileHandler {

	@Required
	private String action;

	@Required
	private List<FileHandlerAccept> accepts;

	@Required
	private String displayName;

    public FileHandler() {
    }

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public List<FileHandlerAccept> getAccepts() {
		return this.accepts;
	}
	public void setAccepts(List<FileHandlerAccept> accepts) {
		this.accepts = accepts;
	}
	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
}
