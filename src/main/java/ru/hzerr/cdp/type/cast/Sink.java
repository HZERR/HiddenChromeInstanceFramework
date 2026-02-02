package ru.hzerr.cdp.type.cast;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

public class Sink {

	@Required
	private String name;

	@Required
	private String id;

	@Description("Text describing the current session. Present only if there is an active session on the sink.")
	private String session;

    public Sink() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSession() {
		return this.session;
	}
	public void setSession(String session) {
		this.session = session;
	}
}
