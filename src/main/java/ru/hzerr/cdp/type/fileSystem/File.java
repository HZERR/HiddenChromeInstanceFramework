package ru.hzerr.cdp.type.fileSystem;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;

public class File {

	@Required
	private String name;

	@Required
	@Description("Timestamp")
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number lastModified;

	@Required
	@Description("Size in bytes")
	private Number size;

	@Required
	private String type;

    public File() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Number getLastModified() {
		return this.lastModified;
	}
	public void setLastModified(Number lastModified) {
		this.lastModified = lastModified;
	}
	public Number getSize() {
		return this.size;
	}
	public void setSize(Number size) {
		this.size = size;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
