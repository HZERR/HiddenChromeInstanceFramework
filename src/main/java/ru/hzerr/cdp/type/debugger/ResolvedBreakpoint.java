package ru.hzerr.cdp.type.debugger;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;

public class ResolvedBreakpoint {

	@Required
	@Description("Breakpoint unique identifier.")
	@TypeDescription("Breakpoint identifier.")
	private String breakpointId;

	@Required
	@Description("Actual breakpoint location.")
	private Location location;

    public ResolvedBreakpoint() {
    }

	public String getBreakpointId() {
		return this.breakpointId;
	}
	public void setBreakpointId(String breakpointId) {
		this.breakpointId = breakpointId;
	}
	public Location getLocation() {
		return this.location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
}
