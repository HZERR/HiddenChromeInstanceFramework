package ru.hzerr.cdp.type.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Experimental
public class BackForwardCacheNotRestoredExplanation {

	@Required
	@Description("Type of the reason")
	@TypeExperimental
	@TypeDescription("Types of not restored reasons for back-forward cache.")
	private String type;

	@Required
	@Description("Not restored reason")
	@TypeExperimental
	@TypeDescription("List of not restored reasons for back-forward cache.")
	private String reason;

	@Description("Context associated with the reason. The meaning of this context is dependent on the reason: - EmbedderExtensionSentMessageToCachedFrame: the extension ID.")
	private String context;

	private List<BackForwardCacheBlockingDetails> details;

    public BackForwardCacheNotRestoredExplanation() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getContext() {
		return this.context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public List<BackForwardCacheBlockingDetails> getDetails() {
		return this.details;
	}
	public void setDetails(List<BackForwardCacheBlockingDetails> details) {
		this.details = details;
	}
}
