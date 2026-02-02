package ru.hzerr.cdp.type.fileSystem;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import java.util.List;

public class Directory {

	@Required
	private String name;

	@Required
	private String[] nestedDirectories;

	@Required
	@Description("Files that are directly nested under this directory.")
	private List<File> nestedFiles;

    public Directory() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getNestedDirectories() {
		return this.nestedDirectories;
	}
	public void setNestedDirectories(String[] nestedDirectories) {
		this.nestedDirectories = nestedDirectories;
	}
	public List<File> getNestedFiles() {
		return this.nestedFiles;
	}
	public void setNestedFiles(List<File> nestedFiles) {
		this.nestedFiles = nestedFiles;
	}
}
