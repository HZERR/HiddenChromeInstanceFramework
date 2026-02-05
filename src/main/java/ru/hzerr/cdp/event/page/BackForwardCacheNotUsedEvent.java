package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;
import ru.hzerr.cdp.type.page.BackForwardCacheNotRestoredExplanation;
import ru.hzerr.cdp.type.page.BackForwardCacheNotRestoredExplanationTree;

@Experimental
@Description("Fired for failed bfcache history navigations if BackForwardCache feature is enabled. Do not assume any ordering with the Page.frameNavigated event. This event is fired only for main-frame history navigation where the document changes (non-same-document navigations), when bfcache navigation fails.")
@Event("backForwardCacheNotUsed")
public class BackForwardCacheNotUsedEvent {

	@Required
	@Description("The loader id for the associated navigation.")
	@TypeDescription("Unique loader identifier.")
	private String loaderId;

	@Required
	@Description("The frame id of the associated frame.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Required
	@Description("Array of reasons why the page could not be cached. This must not be empty.")
	private List<BackForwardCacheNotRestoredExplanation> notRestoredExplanations;

	@Description("Tree structure of reasons why the page could not be cached for each frame.")
	private BackForwardCacheNotRestoredExplanationTree notRestoredExplanationsTree;

    public BackForwardCacheNotUsedEvent() {
    }

	public String getLoaderId() {
		return this.loaderId;
	}
	public void setLoaderId(String loaderId) {
		this.loaderId = loaderId;
	}
	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public List<BackForwardCacheNotRestoredExplanation> getNotRestoredExplanations() {
		return this.notRestoredExplanations;
	}
	public void setNotRestoredExplanations(List<BackForwardCacheNotRestoredExplanation> notRestoredExplanations) {
		this.notRestoredExplanations = notRestoredExplanations;
	}
	public BackForwardCacheNotRestoredExplanationTree getNotRestoredExplanationsTree() {
		return this.notRestoredExplanationsTree;
	}
	public void setNotRestoredExplanationsTree(BackForwardCacheNotRestoredExplanationTree notRestoredExplanationsTree) {
		this.notRestoredExplanationsTree = notRestoredExplanationsTree;
	}
}
