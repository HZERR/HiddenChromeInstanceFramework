package ru.hzerr.cdp.event.heapProfiler;

import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Event("addHeapSnapshotChunk")
public class AddHeapSnapshotChunkEvent {

	@Required
	private String chunk;

    public AddHeapSnapshotChunkEvent() {
    }

	public String getChunk() {
		return this.chunk;
	}
	public void setChunk(String chunk) {
		this.chunk = chunk;
	}
}
