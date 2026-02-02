package ru.hzerr.cdp.type.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Experimental
@Description("Encapsulates the script ancestry and the root script filterlist rule that caused the frame to be labelled as an ad. Only created when `ancestryChain` is not empty.")
public class AdScriptAncestry {

	@Required
	@Description("A chain of `AdScriptId`s representing the ancestry of an ad script that led to the creation of a frame. The chain is ordered from the script itself (lower level) up to its root ancestor that was flagged by filterlist.")
	private List<AdScriptId> ancestryChain;

	@Description("The filterlist rule that caused the root (last) script in `ancestryChain` to be ad-tagged. Only populated if the rule is available.")
	private String rootScriptFilterlistRule;

    public AdScriptAncestry() {
    }

	public List<AdScriptId> getAncestryChain() {
		return this.ancestryChain;
	}
	public void setAncestryChain(List<AdScriptId> ancestryChain) {
		this.ancestryChain = ancestryChain;
	}
	public String getRootScriptFilterlistRule() {
		return this.rootScriptFilterlistRule;
	}
	public void setRootScriptFilterlistRule(String rootScriptFilterlistRule) {
		this.rootScriptFilterlistRule = rootScriptFilterlistRule;
	}
}
