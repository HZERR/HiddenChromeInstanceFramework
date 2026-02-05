package ru.hzerr.cdp.event.webAudio;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Notifies that an AudioNode is connected to an AudioParam.")
@Event("nodeParamConnected")
public class NodeParamConnectedEvent {

	@Required
	@TypeDescription("An unique ID for a graph object (AudioContext, AudioNode, AudioParam) in Web Audio API")
	private String contextId;

	@Required
	@TypeDescription("An unique ID for a graph object (AudioContext, AudioNode, AudioParam) in Web Audio API")
	private String sourceId;

	@Required
	@TypeDescription("An unique ID for a graph object (AudioContext, AudioNode, AudioParam) in Web Audio API")
	private String destinationId;

	private Number sourceOutputIndex;

    public NodeParamConnectedEvent() {
    }

	public String getContextId() {
		return this.contextId;
	}
	public void setContextId(String contextId) {
		this.contextId = contextId;
	}
	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public String getDestinationId() {
		return this.destinationId;
	}
	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}
	public Number getSourceOutputIndex() {
		return this.sourceOutputIndex;
	}
	public void setSourceOutputIndex(Number sourceOutputIndex) {
		this.sourceOutputIndex = sourceOutputIndex;
	}
}
