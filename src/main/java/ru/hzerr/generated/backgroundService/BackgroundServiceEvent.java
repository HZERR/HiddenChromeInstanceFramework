package ru.hzerr.generated.backgroundService;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

public class BackgroundServiceEvent {

	@Required
	@Description("Timestamp of the event (in seconds).")
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number timestamp;

	@Required
	@Description("The origin this event belongs to.")
	private String origin;

	@Required
	@Description("The Service Worker ID that initiated the event.")
	private String serviceWorkerRegistrationId;

	@Required
	@Description("The Background Service this event belongs to.")
	@TypeDescription("The Background Service that will be associated with the commands/events. Every Background Service operates independently, but they share the same API.")
	private String service;

	@Required
	@Description("A description of the event.")
	private String eventName;

	@Required
	@Description("An identifier that groups related events together.")
	private String instanceId;

	@Required
	@Description("A list of event-specific information.")
	private List<EventMetadata> eventMetadata;

	@Required
	@Description("Storage key this event belongs to.")
	private String storageKey;

    public BackgroundServiceEvent() {
    }

	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getServiceWorkerRegistrationId() {
		return this.serviceWorkerRegistrationId;
	}
	public void setServiceWorkerRegistrationId(String serviceWorkerRegistrationId) {
		this.serviceWorkerRegistrationId = serviceWorkerRegistrationId;
	}
	public String getService() {
		return this.service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getEventName() {
		return this.eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	public List<EventMetadata> getEventMetadata() {
		return this.eventMetadata;
	}
	public void setEventMetadata(List<EventMetadata> eventMetadata) {
		this.eventMetadata = eventMetadata;
	}
	public String getStorageKey() {
		return this.storageKey;
	}
	public void setStorageKey(String storageKey) {
		this.storageKey = storageKey;
	}
}
