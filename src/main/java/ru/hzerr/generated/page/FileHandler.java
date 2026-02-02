package ru.hzerr.generated.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import java.util.List;
import ru.hzerr.annotation.Description;

@Experimental
public class FileHandler {

	@Required
	private String action;

	@Required
	private String name;

	private List<ImageResource> icons;

	@Description("Mimic a map, name is the key, accepts is the value.")
	private List<FileFilter> accepts;

	@Required
	@Description("Won't repeat the enums, using string for easy comparison. Same as the other enums below.")
	private String launchType;

    public FileHandler() {
    }

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ImageResource> getIcons() {
		return this.icons;
	}
	public void setIcons(List<ImageResource> icons) {
		this.icons = icons;
	}
	public List<FileFilter> getAccepts() {
		return this.accepts;
	}
	public void setAccepts(List<FileFilter> accepts) {
		this.accepts = accepts;
	}
	public String getLaunchType() {
		return this.launchType;
	}
	public void setLaunchType(String launchType) {
		this.launchType = launchType;
	}
}
