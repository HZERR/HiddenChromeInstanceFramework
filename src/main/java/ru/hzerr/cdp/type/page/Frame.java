package ru.hzerr.cdp.type.page;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.TypeExperimental;
import java.util.List;

@Description("Information about the Frame on the page.")
public class Frame {

	@Required
	@Description("Frame unique identifier.")
	@TypeDescription("Unique frame identifier.")
	private String id;

	@Description("Parent frame identifier.")
	@TypeDescription("Unique frame identifier.")
	private String parentId;

	@Required
	@Description("Identifier of the loader associated with this frame.")
	@TypeDescription("Unique loader identifier.")
	private String loaderId;

	@Description("Frame's name as specified in the tag.")
	private String name;

	@Required
	@Description("Frame document's URL without fragment.")
	private String url;

	@Experimental
	@Description("Frame document's URL fragment including the '#'.")
	private String urlFragment;

	@Experimental
	@Required
	@Description("Frame document's registered domain, taking the public suffixes list into account. Extracted from the Frame's url. Example URLs: http://www.google.com/file.html -> \"google.com\"               http://a.b.co.uk/file.html      -> \"b.co.uk\"")
	private String domainAndRegistry;

	@Required
	@Description("Frame document's security origin.")
	private String securityOrigin;

	@Experimental
	@Description("Additional details about the frame document's security origin.")
	private SecurityOriginDetails securityOriginDetails;

	@Required
	@Description("Frame document's mimeType as determined by the browser.")
	private String mimeType;

	@Experimental
	@Description("If the frame failed to load, this contains the URL that could not be loaded. Note that unlike url above, this URL may contain a fragment.")
	private String unreachableUrl;

	@Experimental
	@Description("Indicates whether this frame was tagged as an ad and why.")
	private AdFrameStatus adFrameStatus;

	@Experimental
	@Required
	@Description("Indicates whether the main document is a secure context and explains why that is the case.")
	@TypeExperimental
	@TypeDescription("Indicates whether the frame is a secure context and why it is the case.")
	private String secureContextType;

	@Experimental
	@Required
	@Description("Indicates whether this is a cross origin isolated context.")
	@TypeExperimental
	@TypeDescription("Indicates whether the frame is cross-origin isolated and why it is the case.")
	private String crossOriginIsolatedContextType;

	@Experimental
	@Required
	@Description("Indicated which gated APIs / features are available.")
	@TypeExperimental
	private List<String> gatedAPIFeatures;

    public Frame() {
    }

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getLoaderId() {
		return this.loaderId;
	}
	public void setLoaderId(String loaderId) {
		this.loaderId = loaderId;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrlFragment() {
		return this.urlFragment;
	}
	public void setUrlFragment(String urlFragment) {
		this.urlFragment = urlFragment;
	}
	public String getDomainAndRegistry() {
		return this.domainAndRegistry;
	}
	public void setDomainAndRegistry(String domainAndRegistry) {
		this.domainAndRegistry = domainAndRegistry;
	}
	public String getSecurityOrigin() {
		return this.securityOrigin;
	}
	public void setSecurityOrigin(String securityOrigin) {
		this.securityOrigin = securityOrigin;
	}
	public SecurityOriginDetails getSecurityOriginDetails() {
		return this.securityOriginDetails;
	}
	public void setSecurityOriginDetails(SecurityOriginDetails securityOriginDetails) {
		this.securityOriginDetails = securityOriginDetails;
	}
	public String getMimeType() {
		return this.mimeType;
	}
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	public String getUnreachableUrl() {
		return this.unreachableUrl;
	}
	public void setUnreachableUrl(String unreachableUrl) {
		this.unreachableUrl = unreachableUrl;
	}
	public AdFrameStatus getAdFrameStatus() {
		return this.adFrameStatus;
	}
	public void setAdFrameStatus(AdFrameStatus adFrameStatus) {
		this.adFrameStatus = adFrameStatus;
	}
	public String getSecureContextType() {
		return this.secureContextType;
	}
	public void setSecureContextType(String secureContextType) {
		this.secureContextType = secureContextType;
	}
	public String getCrossOriginIsolatedContextType() {
		return this.crossOriginIsolatedContextType;
	}
	public void setCrossOriginIsolatedContextType(String crossOriginIsolatedContextType) {
		this.crossOriginIsolatedContextType = crossOriginIsolatedContextType;
	}
	public List<String> getGatedAPIFeatures() {
		return this.gatedAPIFeatures;
	}
	public void setGatedAPIFeatures(List<String> gatedAPIFeatures) {
		this.gatedAPIFeatures = gatedAPIFeatures;
	}
}
