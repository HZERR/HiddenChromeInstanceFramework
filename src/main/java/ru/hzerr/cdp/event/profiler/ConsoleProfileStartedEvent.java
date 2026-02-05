package ru.hzerr.cdp.event.profiler;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.debugger.Location;

@Description("Sent when new profile recording is started using console.profile() call.")
@Event("consoleProfileStarted")
public class ConsoleProfileStartedEvent {

	@Required
	private String id;

	@Required
	@Description("Location of console.profile().")
	private Location location;

	@Description("Profile title passed as an argument to console.profile().")
	private String title;

    public ConsoleProfileStartedEvent() {
    }

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Location getLocation() {
		return this.location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
