package ru.hzerr.cdp.event.heapProfiler;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Description("If heap objects tracking has been started then backend may send update for one or more fragments")
@Event("heapStatsUpdate")
public class HeapStatsUpdateEvent {

	@Required
	@Description("An array of triplets. Each triplet describes a fragment. The first integer is the fragment index, the second integer is a total count of objects for the fragment, the third integer is a total size of the objects for the fragment.")
	private int[] statsUpdate;

    public HeapStatsUpdateEvent() {
    }

	public int[] getStatsUpdate() {
		return this.statsUpdate;
	}
	public void setStatsUpdate(int[] statsUpdate) {
		this.statsUpdate = statsUpdate;
	}
}
