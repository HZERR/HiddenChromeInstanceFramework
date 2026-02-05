package ru.hzerr.cdp.event.preload;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;
import ru.hzerr.cdp.type.preload.PreloadingAttemptSource;

@Description("Send a list of sources for all preloading attempts in a document.")
@Event("preloadingAttemptSourcesUpdated")
public class PreloadingAttemptSourcesUpdatedEvent {

	@Required
	@TypeDescription("Unique loader identifier.")
	private String loaderId;

	@Required
	private List<PreloadingAttemptSource> preloadingAttemptSources;

    public PreloadingAttemptSourcesUpdatedEvent() {
    }

	public String getLoaderId() {
		return this.loaderId;
	}
	public void setLoaderId(String loaderId) {
		this.loaderId = loaderId;
	}
	public List<PreloadingAttemptSource> getPreloadingAttemptSources() {
		return this.preloadingAttemptSources;
	}
	public void setPreloadingAttemptSources(List<PreloadingAttemptSource> preloadingAttemptSources) {
		this.preloadingAttemptSources = preloadingAttemptSources;
	}
}
