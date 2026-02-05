package ru.hzerr.cdp.event.preload;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.preload.PreloadingAttemptKey;
import ru.hzerr.annotation.TypeDescription;

@Description("Fired when a prefetch attempt is updated.")
@Event("prefetchStatusUpdated")
public class PrefetchStatusUpdatedEvent {

	@Required
	private PreloadingAttemptKey key;

	@Required
	@TypeDescription("Chrome manages different types of preloads together using a concept of preloading pipeline. For example, if a site uses a SpeculationRules for prerender, Chrome first starts a prefetch and then upgrades it to prerender.  CDP events for them are emitted separately but they share `PreloadPipelineId`.")
	private String pipelineId;

	@Required
	@Description("The frame id of the frame initiating prefetch.")
	@TypeDescription("Unique frame identifier.")
	private String initiatingFrameId;

	@Required
	private String prefetchUrl;

	@Required
	@TypeDescription("Preloading status values, see also PreloadingTriggeringOutcome. This status is shared by prefetchStatusUpdated and prerenderStatusUpdated.")
	private String status;

	@Required
	@TypeDescription("TODO(https://crbug.com/1384419): revisit the list of PrefetchStatus and filter out the ones that aren't necessary to the developers.")
	private String prefetchStatus;

	@Required
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

    public PrefetchStatusUpdatedEvent() {
    }

	public PreloadingAttemptKey getKey() {
		return this.key;
	}
	public void setKey(PreloadingAttemptKey key) {
		this.key = key;
	}
	public String getPipelineId() {
		return this.pipelineId;
	}
	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
	}
	public String getInitiatingFrameId() {
		return this.initiatingFrameId;
	}
	public void setInitiatingFrameId(String initiatingFrameId) {
		this.initiatingFrameId = initiatingFrameId;
	}
	public String getPrefetchUrl() {
		return this.prefetchUrl;
	}
	public void setPrefetchUrl(String prefetchUrl) {
		this.prefetchUrl = prefetchUrl;
	}
	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPrefetchStatus() {
		return this.prefetchStatus;
	}
	public void setPrefetchStatus(String prefetchStatus) {
		this.prefetchStatus = prefetchStatus;
	}
	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}
