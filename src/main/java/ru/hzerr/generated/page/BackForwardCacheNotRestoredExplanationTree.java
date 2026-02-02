package ru.hzerr.generated.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import java.util.List;

@Experimental
public class BackForwardCacheNotRestoredExplanationTree {

	@Required
	@Description("URL of each frame")
	private String url;

	@Required
	@Description("Not restored reasons of each frame")
	private List<BackForwardCacheNotRestoredExplanation> explanations;

	@Required
	@Description("Array of children frame")
	private List<BackForwardCacheNotRestoredExplanationTree> children;

    public BackForwardCacheNotRestoredExplanationTree() {
    }

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<BackForwardCacheNotRestoredExplanation> getExplanations() {
		return this.explanations;
	}
	public void setExplanations(List<BackForwardCacheNotRestoredExplanation> explanations) {
		this.explanations = explanations;
	}
	public List<BackForwardCacheNotRestoredExplanationTree> getChildren() {
		return this.children;
	}
	public void setChildren(List<BackForwardCacheNotRestoredExplanationTree> children) {
		this.children = children;
	}
}
