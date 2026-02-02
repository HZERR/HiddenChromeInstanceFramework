package ru.hzerr.cdp.type.preload;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("A key that identifies a preloading attempt.  The url used is the url specified by the trigger (i.e. the initial URL), and not the final url that is navigated to. For example, prerendering allows same-origin main frame navigations during the attempt, but the attempt is still keyed with the initial URL.")
public class PreloadingAttemptKey {

	@Required
	@TypeDescription("Unique loader identifier.")
	private String loaderId;

	@Required
	@TypeDescription("The type of preloading attempted. It corresponds to mojom::SpeculationAction (although PrefetchWithSubresources is omitted as it isn't being used by clients).")
	private String action;

	@Required
	private String url;

	@TypeDescription("Corresponds to mojom::SpeculationTargetHint. See https://github.com/WICG/nav-speculation/blob/main/triggers.md#window-name-targeting-hints")
	private String targetHint;

    public PreloadingAttemptKey() {
    }

	public String getLoaderId() {
		return this.loaderId;
	}
	public void setLoaderId(String loaderId) {
		this.loaderId = loaderId;
	}
	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTargetHint() {
		return this.targetHint;
	}
	public void setTargetHint(String targetHint) {
		this.targetHint = targetHint;
	}
}
