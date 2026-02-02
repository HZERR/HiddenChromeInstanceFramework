package ru.hzerr.generated.page;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Navigation history entry.")
public class NavigationEntry {

	@Required
	@Description("Unique id of the navigation history entry.")
	private int id;

	@Required
	@Description("URL of the navigation history entry.")
	private String url;

	@Required
	@Description("URL that the user typed in the url bar.")
	private String userTypedURL;

	@Required
	@Description("Title of the navigation history entry.")
	private String title;

	@Required
	@Description("Transition type.")
	@TypeDescription("Transition type.")
	private String transitionType;

    public NavigationEntry() {
    }

	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserTypedURL() {
		return this.userTypedURL;
	}
	public void setUserTypedURL(String userTypedURL) {
		this.userTypedURL = userTypedURL;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTransitionType() {
		return this.transitionType;
	}
	public void setTransitionType(String transitionType) {
		this.transitionType = transitionType;
	}
}
