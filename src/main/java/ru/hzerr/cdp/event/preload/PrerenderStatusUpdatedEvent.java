package ru.hzerr.cdp.event.preload;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.preload.PreloadingAttemptKey;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;
import ru.hzerr.cdp.type.preload.PrerenderMismatchedHeaders;

@Description("Fired when a prerender attempt is updated.")
@Event("prerenderStatusUpdated")
public class PrerenderStatusUpdatedEvent {

	@Required
	private PreloadingAttemptKey key;

	@Required
	@TypeDescription("Chrome manages different types of preloads together using a concept of preloading pipeline. For example, if a site uses a SpeculationRules for prerender, Chrome first starts a prefetch and then upgrades it to prerender.  CDP events for them are emitted separately but they share `PreloadPipelineId`.")
	private String pipelineId;

	@Required
	@TypeDescription("Preloading status values, see also PreloadingTriggeringOutcome. This status is shared by prefetchStatusUpdated and prerenderStatusUpdated.")
	private String status;

	@TypeDescription("List of FinalStatus reasons for Prerender2.")
	private String prerenderStatus;

	@Description("This is used to give users more information about the name of Mojo interface that is incompatible with prerender and has caused the cancellation of the attempt.")
	private String disallowedMojoInterface;

	private List<PrerenderMismatchedHeaders> mismatchedHeaders;

    public PrerenderStatusUpdatedEvent() {
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
	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPrerenderStatus() {
		return this.prerenderStatus;
	}
	public void setPrerenderStatus(String prerenderStatus) {
		this.prerenderStatus = prerenderStatus;
	}
	public String getDisallowedMojoInterface() {
		return this.disallowedMojoInterface;
	}
	public void setDisallowedMojoInterface(String disallowedMojoInterface) {
		this.disallowedMojoInterface = disallowedMojoInterface;
	}
	public List<PrerenderMismatchedHeaders> getMismatchedHeaders() {
		return this.mismatchedHeaders;
	}
	public void setMismatchedHeaders(List<PrerenderMismatchedHeaders> mismatchedHeaders) {
		this.mismatchedHeaders = mismatchedHeaders;
	}
}
