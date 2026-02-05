package ru.hzerr.cdp.event.heapProfiler;

import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Event("reportHeapSnapshotProgress")
public class ReportHeapSnapshotProgressEvent {

	@Required
	private int done;

	@Required
	private int total;

	private boolean finished;

    public ReportHeapSnapshotProgressEvent() {
    }

	public int getDone() {
		return this.done;
	}
	public void setDone(int done) {
		this.done = done;
	}
	public int getTotal() {
		return this.total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public boolean getFinished() {
		return this.finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
}
