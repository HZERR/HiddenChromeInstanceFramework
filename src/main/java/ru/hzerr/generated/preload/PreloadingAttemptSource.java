package ru.hzerr.generated.preload;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Description("Lists sources for a preloading attempt, specifically the ids of rule sets that had a speculation rule that triggered the attempt, and the BackendNodeIds of <a href> or <area href> elements that triggered the attempt (in the case of attempts triggered by a document rule). It is possible for multiple rule sets and links to trigger a single attempt.")
public class PreloadingAttemptSource {

	@Required
	private PreloadingAttemptKey key;

	@Required
	@TypeDescription("Unique id")
	private List<String> ruleSetIds;

	@Required
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private List<Integer> nodeIds;

    public PreloadingAttemptSource() {
    }

	public PreloadingAttemptKey getKey() {
		return this.key;
	}
	public void setKey(PreloadingAttemptKey key) {
		this.key = key;
	}
	public List<String> getRuleSetIds() {
		return this.ruleSetIds;
	}
	public void setRuleSetIds(List<String> ruleSetIds) {
		this.ruleSetIds = ruleSetIds;
	}
	public List<Integer> getNodeIds() {
		return this.nodeIds;
	}
	public void setNodeIds(List<Integer> nodeIds) {
		this.nodeIds = nodeIds;
	}
}
