package ru.hzerr.generated.profiler;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("Profile.")
public class Profile {

	@Required
	@Description("The list of profile nodes. First item is the root node.")
	private List<ProfileNode> nodes;

	@Required
	@Description("Profiling start timestamp in microseconds.")
	private Number startTime;

	@Required
	@Description("Profiling end timestamp in microseconds.")
	private Number endTime;

	@Description("Ids of samples top nodes.")
	private int[] samples;

	@Description("Time intervals between adjacent samples in microseconds. The first delta is relative to the profile startTime.")
	private int[] timeDeltas;

    public Profile() {
    }

	public List<ProfileNode> getNodes() {
		return this.nodes;
	}
	public void setNodes(List<ProfileNode> nodes) {
		this.nodes = nodes;
	}
	public Number getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Number startTime) {
		this.startTime = startTime;
	}
	public Number getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Number endTime) {
		this.endTime = endTime;
	}
	public int[] getSamples() {
		return this.samples;
	}
	public void setSamples(int[] samples) {
		this.samples = samples;
	}
	public int[] getTimeDeltas() {
		return this.timeDeltas;
	}
	public void setTimeDeltas(int[] timeDeltas) {
		this.timeDeltas = timeDeltas;
	}
}
