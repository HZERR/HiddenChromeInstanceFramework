package ru.hzerr.cdp.event.cast;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import java.util.List;
import ru.hzerr.cdp.type.cast.Sink;

@Description("This is fired whenever the list of available sinks changes. A sink is a device or a software surface that you can cast to.")
@Event("sinksUpdated")
public class SinksUpdatedEvent {

	@Required
	private List<Sink> sinks;

    public SinksUpdatedEvent() {
    }

	public List<Sink> getSinks() {
		return this.sinks;
	}
	public void setSinks(List<Sink> sinks) {
		this.sinks = sinks;
	}
}
