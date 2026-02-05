package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Enum;

@Experimental
@Description("Fired when a navigation starts. This event is fired for both renderer-initiated and browser-initiated navigations. For renderer-initiated navigations, the event is fired after `frameRequestedNavigation`. Navigation may still be cancelled after the event is issued. Multiple events can be fired for a single navigation, for example, when a same-document navigation becomes a cross-document navigation (such as in the case of a frameset).")
@Event("frameStartedNavigating")
public class FrameStartedNavigatingEvent {

	@Required
	@Description("ID of the frame that is being navigated.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Required
	@Description("The URL the navigation started with. The final URL can be different.")
	private String url;

	@Required
	@Description("Loader identifier. Even though it is present in case of same-document navigation, the previously committed loaderId would not change unless the navigation changes from a same-document to a cross-document navigation.")
	@TypeDescription("Unique loader identifier.")
	private String loaderId;

	@Required
	@Enum({"reload", "reloadBypassingCache", "restore", "restoreWithPost", "historySameDocument", "historyDifferentDocument", "sameDocument", "differentDocument"})
	private String navigationType;

    public FrameStartedNavigatingEvent() {
    }

	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getLoaderId() {
		return this.loaderId;
	}
	public void setLoaderId(String loaderId) {
		this.loaderId = loaderId;
	}
	public String getNavigationType() {
		return this.navigationType;
	}
	public void setNavigationType(String navigationType) {
		this.navigationType = navigationType;
	}
}
