package ru.hzerr.generated.runtime;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("If `debuggerId` is set stack trace comes from another debugger and can be resolved there. This allows to track cross-debugger calls. See `Runtime.StackTrace` and `Debugger.paused` for usages.")
public class StackTraceId {

	@Required
	private String id;

	@TypeExperimental
	@TypeDescription("Unique identifier of current debugger.")
	private String debuggerId;

    public StackTraceId() {
    }

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDebuggerId() {
		return this.debuggerId;
	}
	public void setDebuggerId(String debuggerId) {
		this.debuggerId = debuggerId;
	}
}
