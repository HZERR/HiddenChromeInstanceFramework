package ru.hzerr.cdp.event.tracing;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.TypeExperimental;

@Description("Signals that tracing is stopped and there is no trace buffers pending flush, all data were delivered via dataCollected events.")
@Event("tracingComplete")
public class TracingCompleteEvent {

	@Required
	@Description("Indicates whether some trace data is known to have been lost, e.g. because the trace ring buffer wrapped around.")
	private boolean dataLossOccurred;

	@Description("A handle of the stream that holds resulting trace data.")
	@TypeDescription("This is either obtained from another method or specified as `blob:<uuid>` where `<uuid>` is an UUID of a Blob.")
	private String stream;

	@Description("Trace data format of returned stream.")
	@TypeExperimental
	@TypeDescription("Data format of a trace. Can be either the legacy JSON format or the protocol buffer format. Note that the JSON format will be deprecated soon.")
	private String traceFormat;

	@Description("Compression format of returned stream.")
	@TypeExperimental
	@TypeDescription("Compression type to use for traces returned via streams.")
	private String streamCompression;

    public TracingCompleteEvent() {
    }

	public boolean getDataLossOccurred() {
		return this.dataLossOccurred;
	}
	public void setDataLossOccurred(boolean dataLossOccurred) {
		this.dataLossOccurred = dataLossOccurred;
	}
	public String getStream() {
		return this.stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getTraceFormat() {
		return this.traceFormat;
	}
	public void setTraceFormat(String traceFormat) {
		this.traceFormat = traceFormat;
	}
	public String getStreamCompression() {
		return this.streamCompression;
	}
	public void setStreamCompression(String streamCompression) {
		this.streamCompression = streamCompression;
	}
}
