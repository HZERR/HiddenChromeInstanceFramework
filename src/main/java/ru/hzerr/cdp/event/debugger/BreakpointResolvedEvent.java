package ru.hzerr.cdp.event.debugger;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.debugger.Location;

@Deprecated
@Description("Fired when breakpoint is resolved to an actual script and location. Deprecated in favor of `resolvedBreakpoints` in the `scriptParsed` event.")
@Event("breakpointResolved")
public class BreakpointResolvedEvent {

	@Required
	@Description("Breakpoint unique identifier.")
	@TypeDescription("Breakpoint identifier.")
	private String breakpointId;

	@Required
	@Description("Actual breakpoint location.")
	private Location location;

    public BreakpointResolvedEvent() {
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
