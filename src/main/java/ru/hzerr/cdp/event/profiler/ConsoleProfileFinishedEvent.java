package ru.hzerr.cdp.event.profiler;

import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.cdp.type.debugger.Location;
import ru.hzerr.cdp.type.profiler.Profile;

@Event("consoleProfileFinished")
public class ConsoleProfileFinishedEvent {

	@Required
	private String id;

	@Required
	@Description("Location of console.profileEnd().")
	private Location location;

	@Required
	private Profile profile;

	@Description("Profile title passed as an argument to console.profile().")
	private String title;

    public ConsoleProfileFinishedEvent() {
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
	public Profile getProfile() {
		return this.profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
