package ru.hzerr.cdp.type.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.TypeExperimental;

@Experimental
@Description("Identifies the script which caused a script or frame to be labelled as an ad.")
public class AdScriptId {

	@Required
	@Description("Script Id of the script which caused a script or frame to be labelled as an ad.")
	@TypeDescription("Unique script identifier.")
	private String scriptId;

	@Required
	@Description("Id of scriptId's debugger.")
	@TypeExperimental
	@TypeDescription("Unique identifier of current debugger.")
	private String debuggerId;

    public AdScriptId() {
    }

	public String getScriptId() {
		return this.scriptId;
	}
	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
	}
	public String getDebuggerId() {
		return this.debuggerId;
	}
	public void setDebuggerId(String debuggerId) {
		this.debuggerId = debuggerId;
	}
}
