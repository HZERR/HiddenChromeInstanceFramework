package ru.hzerr.generated.debugger;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Location range within one script.")
public class LocationRange {

	@Required
	@TypeDescription("Unique script identifier.")
	private String scriptId;

	@Required
	private ScriptPosition start;

	@Required
	private ScriptPosition end;

    public LocationRange() {
    }

	public String getScriptId() {
		return this.scriptId;
	}
	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
	}
	public ScriptPosition getStart() {
		return this.start;
	}
	public void setStart(ScriptPosition start) {
		this.start = start;
	}
	public ScriptPosition getEnd() {
		return this.end;
	}
	public void setEnd(ScriptPosition end) {
		this.end = end;
	}
}
