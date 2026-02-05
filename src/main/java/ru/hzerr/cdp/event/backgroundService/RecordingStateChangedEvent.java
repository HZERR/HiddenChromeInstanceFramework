package ru.hzerr.cdp.event.backgroundService;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Called when the recording state for the service has been updated.")
@Event("recordingStateChanged")
public class RecordingStateChangedEvent {

	@Required
	private boolean isRecording;

	@Required
	@TypeDescription("The Background Service that will be associated with the commands/events. Every Background Service operates independently, but they share the same API.")
	private String service;

    public RecordingStateChangedEvent() {
    }

	public boolean getIsRecording() {
		return this.isRecording;
	}
	public void setIsRecording(boolean isRecording) {
		this.isRecording = isRecording;
	}
	public String getService() {
		return this.service;
	}
	public void setService(String service) {
		this.service = service;
	}
}
