package ru.hzerr.cdp.type.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import java.util.List;

@Experimental
public class ShareTarget {

	@Required
	private String action;

	@Required
	private String method;

	@Required
	private String enctype;

	@Description("Embed the ShareTargetParams")
	private String title;

	private String text;

	private String url;

	private List<FileFilter> files;

    public ShareTarget() {
    }

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getMethod() {
		return this.method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getEnctype() {
		return this.enctype;
	}
	public void setEnctype(String enctype) {
		this.enctype = enctype;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public List<FileFilter> getFiles() {
		return this.files;
	}
	public void setFiles(List<FileFilter> files) {
		this.files = files;
	}
}
