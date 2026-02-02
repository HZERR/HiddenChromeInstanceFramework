package ru.hzerr.generated.profiler;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Description("Coverage data for a JavaScript script.")
public class ScriptCoverage {

	@Required
	@Description("JavaScript script id.")
	@TypeDescription("Unique script identifier.")
	private String scriptId;

	@Required
	@Description("JavaScript script name or url.")
	private String url;

	@Required
	@Description("Functions contained in the script that has coverage data.")
	private List<FunctionCoverage> functions;

    public ScriptCoverage() {
    }

	public String getScriptId() {
		return this.scriptId;
	}
	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<FunctionCoverage> getFunctions() {
		return this.functions;
	}
	public void setFunctions(List<FunctionCoverage> functions) {
		this.functions = functions;
	}
}
